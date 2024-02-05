package br.com.devdojo.maratonajava.Awrapper.test;

import java.util.List;

public class WrapperTest01 {
    public static void main(String[] args) {
        //wrappers: são objetos que encapsulam os dados de tipos primitivos, e transformam
        //eles em objeto, para que possamos trabalhar com eles utilizando referência
        Byte bytew = 1;
        Short shortW = 1;
        Integer intw = 1; //boxing: transformando tipo primitivo em objeto
        Long longw = 23L;
        Float floatw = 10F;
        Double doublew = 100.0;
        Character charw = 'W';
        Boolean booleanw = false;

        List<Integer> IntegerList;

        int i = intw;//umboxing: transformar tipo wraper em primitivo

    }
}
