package br.com.devdojo.maratonajava.Ccolecoes.test;

import br.com.devdojo.maratonajava.Ccolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Hellsing", 19.50, 2));
        mangas.add(new Manga(2L, "Bersek", 11, 20));
        mangas.add(new Manga(1L, "Vagabond", 20.00, 0));
        mangas.add(new Manga(3L, "Jujutsu", 67.23, 0));

    }
}
