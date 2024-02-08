package br.com.devdojo.maratonajava.Dgenerics.test;

import br.com.devdojo.maratonajava.Dgenerics.test.Animal;
import br.com.devdojo.maratonajava.Dgenerics.test.Cachorro;
import br.com.devdojo.maratonajava.Dgenerics.test.Gato;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato());
        new Gato();
        printConsulta(cachorros);
        printConsulta(gatos);
        List<Animal> animals = new ArrayList<>();
        printConsulta(animals);
    }

    //wildcard ?
    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Animal> animals) {
        Animal animal = new Cachorro();
        Animal animal2 = new Gato();
        animals.add(new Cachorro());
    }
}