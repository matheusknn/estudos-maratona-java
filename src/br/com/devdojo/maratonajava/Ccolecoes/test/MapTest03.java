package br.com.devdojo.maratonajava.Ccolecoes.test;

import br.com.devdojo.maratonajava.Ccolecoes.dominio.Consumidor;
import br.com.devdojo.maratonajava.Ccolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Sukuna");
        Consumidor c2 = new Consumidor("Cleitão");
        Manga manga1 = new Manga(5L, "Hellsing", 11.20);
        Manga manga2 = new Manga(3L, "Mosquito", 8.20);
        Manga manga3 = new Manga(1L, "Jungle Juice", 14.20);
        Manga manga4 = new Manga(6L, "Solo Leveling", 16.20);
        Manga manga5 = new Manga(2L, "Kimetsu", 20.20);

        List<Manga> mangaConsumidorList = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidorList2 = List.of(manga4, manga5);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(c1, mangaConsumidorList);
        consumidorMangaMap.put(c2, mangaConsumidorList2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getNome());
            System.out.println(entry.getValue());
        }
    }
}
