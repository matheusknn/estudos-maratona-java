package br.com.devdojo.maratonajava.Fparametizandocomportamentos.test;

import br.com.devdojo.maratonajava.Fparametizandocomportamentos.dominio.Car;
import br.com.devdojo.maratonajava.Fparametizandocomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 2001), new Car("red", 2019));

    public static void main(String[] args) {
    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for(Car car : cars ) {
            if(carPredicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }




}
