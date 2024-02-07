package br.com.devdojo.maratonajava.Ccolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();//1.4
        nomes.add("Matheus");
        nomes.add("Kenji");

        for (String nome: nomes) {
            System.out.println(nome);
        }

        nomes.remove(1);
        nomes.remove("Matheus");
        System.out.println(nomes);
    }
}
