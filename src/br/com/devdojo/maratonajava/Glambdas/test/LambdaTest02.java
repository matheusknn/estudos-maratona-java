package br.com.devdojo.maratonajava.Glambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest02 {
    //Consumer
    public static void main(String[] args) {
        List<String> names = List.of("Willian", "Kenji", "Hyutaro", "Gengo");
        List<Integer> inteiros = List.of(1,2,3,4,5);
        forEach(names, (String s) -> System.out.println(s));
        forEach (inteiros, (Integer i)-> System.out.println(i));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
