package br.com.devdojo.maratonajava.Fparametizandocomportamentos.test;

import br.com.devdojo.maratonajava.Fparametizandocomportamentos.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 2001), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println(filterByYear(cars, 2012 ));
    }
    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car: cars) {
            if(car.getName().equals("green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterCarByColor (List<Car> cars, String cor) {
        List<Car> FiterCar = new ArrayList<>();
        for (Car car: cars) {
            if(car.getName().equals(cor)) {
                FiterCar.add(car);
            }
        }
        return FiterCar;
    }

    private static List<Car> filterByYear (List<Car> cars, int year) {
        List<Car> oldCars = new ArrayList<>();
        for (Car car: cars) {
            if(car.getAno() < year) {
                oldCars.add(car);
            }
        }
        return oldCars;
    }
}
