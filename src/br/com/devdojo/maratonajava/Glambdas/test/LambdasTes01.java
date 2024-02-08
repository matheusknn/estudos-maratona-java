package br.com.devdojo.maratonajava.Glambdas.test;

import br.com.devdojo.maratonajava.Fparametizandocomportamentos.dominio.Car;
import br.com.devdojo.maratonajava.Fparametizandocomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdasTes01 {
    //OBS: para lambdas funcionarem é necessário que a interface seje funcional, ou seja,
    //que só possui um método abstrato
    //Características das lambdas: são funções anônimas, não ligadas à nenhuma classe
    //e tem o objetivo de fazer o código ser mais limpo
    private static List<Car> cars = List.of(new Car("green", 2023), new Car("red", 2024));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getName().equals("green"));
        System.out.println(greenCars);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for(T e : list) {
            if(predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }

}
