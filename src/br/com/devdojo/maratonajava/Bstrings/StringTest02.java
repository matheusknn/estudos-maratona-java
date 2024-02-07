package br.com.devdojo.maratonajava.Bstrings;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Jira";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("J", "m"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(numeros.substring(0, 3));//pega as posições de 0 à antes de 3(2)
        System.out.println(numeros.substring(3));//pega da posição 3 até o final
        String nome2 = "    testeTrim     ";
        System.out.println(nome2.trim());//tira os espaços do começo e fim
    }
}
