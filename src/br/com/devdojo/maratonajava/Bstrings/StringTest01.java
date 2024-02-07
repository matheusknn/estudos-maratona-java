package br.com.devdojo.maratonajava.Bstrings;

public class StringTest01 {
    public static void main(String[] args) {
        //1-: Strings em java são imutáveis
        String nome = "Matheus";//String constant pool
        String nome2 = "Matheus";
        nome = nome.concat(" Kenji");
        System.out.println(nome);
        System.out.println(nome == nome2);//true, compara se as duas variáveis apontam para uma mesma String
    }
}
