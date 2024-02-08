package br.com.devdojo.maratonajava.Eclassesinternas.test;

public class ClassesAninhadasEstaticas {
    private String nome = "Junim";

    static class Nested {//classes estáticas se comportam como classe top level
        String lastName = "Kenji";
        void print() {
            System.out.println(new ClassesAninhadasEstaticas().nome + " " + lastName);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
