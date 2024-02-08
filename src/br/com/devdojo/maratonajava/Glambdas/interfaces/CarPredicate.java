package br.com.devdojo.maratonajava.Glambdas.interfaces;

import br.com.devdojo.maratonajava.Fparametizandocomportamentos.dominio.Car;

public interface CarPredicate {
    boolean test(Car car);
    //parametro -> <expressão>
    //(Car car) -> car.getColor().equals("green");
}
