package br.com.devdojo.maratonajava.Eclassesinternas.test;

import br.com.devdojo.maratonajava.Dgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClassesAnonimasTest02 {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Lancha")));
        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getMarca().compareTo(o2.getMarca());
            }
        });
    }
}
