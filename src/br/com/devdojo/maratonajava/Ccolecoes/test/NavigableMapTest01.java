package br.com.devdojo.maratonajava.Ccolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>(); //ordena pela chave e comparable da classe
        map.put("A", "LetraA");
        map.put("D", "LetraD");
        map.put("B", "LetraB");
        map.put("C", "LetraC");
        map.put("E", "LetraE");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(map.headMap("C"));//
    }
}
