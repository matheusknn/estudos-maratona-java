package br.com.devdojo.maratonajava.Dgenerics.test;

import br.com.devdojo.maratonajava.Dgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjetoERetornar(new Barco("Going Merry"));
        System.out.println(barcoList);
    }

//    private static <T> void criarArrayComUmObjeto(T t) {
//        List<T> list = new ArrayList<>();
//        list.add(t);
//        System.out.println(list);
//    }

    private static <T> List<T> criarArrayComUmObjetoERetornar(T t) {
        List<T> list = new ArrayList<>();
        list.add(t);
        return list;
    }
}
