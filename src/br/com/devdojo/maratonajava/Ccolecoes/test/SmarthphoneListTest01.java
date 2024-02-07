package br.com.devdojo.maratonajava.Ccolecoes.test;

import br.com.devdojo.maratonajava.Ccolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmarthphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("2ABC2", "Xiomi");
        Smartphone s3 = new Smartphone("3ABC3", "Samsumg");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
//        smartphones.clear();//limpa todos os valores sem perder a referência
        for (Smartphone smartphone: smartphones) {
            System.out.println(smartphone);
        }

        System.out.println(smartphones.contains(s1));
        System.out.println(smartphones.indexOf(s2));
    }
}