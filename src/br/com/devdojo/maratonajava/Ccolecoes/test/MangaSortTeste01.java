package br.com.devdojo.maratonajava.Ccolecoes.test;

import br.com.devdojo.maratonajava.Ccolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Hellsing", 19.50));
        mangas.add(new Manga(2L, "Bersek", 11));
        mangas.add(new Manga(1L, "Vagabond", 20.00));
        mangas.add(new Manga(3L, "Jujutsu", 67.23));
        for (Manga manga: mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        for (Manga manga: mangas) {
            System.out.println(manga);
        }
    }
}
