package br.com.devdojo.maratonajava.Ccolecoes.test;

import br.com.devdojo.maratonajava.Ccolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();//HashSet não mantém ordem de inserção, LinkedHashSet mantém a ordem
        mangas.add(new Manga(5L, "Hellsing", 19.50));
        mangas.add(new Manga(2L, "Bersek", 11));
        mangas.add(new Manga(1L, "Vagabond", 20.00));
        mangas.add(new Manga(3L, "Jujutsu", 67.23));
        mangas.add(new Manga(3L, "Jujutsu", 67.23));//não coloca no set, pois é igual

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
