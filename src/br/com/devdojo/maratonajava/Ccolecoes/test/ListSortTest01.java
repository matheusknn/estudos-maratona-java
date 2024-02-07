package br.com.devdojo.maratonajava.Ccolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Bersek");
        mangas.add("Boku No Piko");
        mangas.add("Yuyu Hakusho");
        mangas.add("Akira");
        Collections.sort(mangas);//organiza caleções de dados em ordem alfabética/numérica]

        for (String manga: mangas) {
            System.out.println(manga);
        }
    }
}
