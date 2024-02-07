package br.com.devdojo.maratonajava.Ccolecoes.test;

import br.com.devdojo.maratonajava.Ccolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
//        //equals: método que compara se od conteúdos do objeto são iguais
//        String nome = "Matheus";
//        String nome2 = new String("Matheus");
//        System.out.println(nome.equals(nome2));//true
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");
        System.out.println(s1.equals(s2));//false, pois as duas variáveis fazem referência para objetos diferentes


    }

}
