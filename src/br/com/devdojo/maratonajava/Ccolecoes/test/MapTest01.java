package br.com.devdojo.maratonajava.Ccolecoes.test;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();//ordena o array baseada pelo hash
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
//        map.put("vc", "você2");//sobrescreve valor se já existir a chave
        map.putIfAbsent("vc", "você3");//só adiciona caso não existir a chave
        System.out.println(map);

        for (String chave: map.keySet()) {
            System.out.println(chave + " " + map.get(chave));
        }

        System.out.println("-----------------------------------------");

        for (String valor: map.values()){
            System.out.println(valor);
        }

        System.out.println("---------------------------------------------");
        for (Map.Entry<String ,String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
