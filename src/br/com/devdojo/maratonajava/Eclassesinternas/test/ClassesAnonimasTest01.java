package br.com.devdojo.maratonajava.Eclassesinternas.test;

class Animal {
    public void andar() {
        System.out.println("Animal andou");
    }
}

public class ClassesAnonimasTest01 {
    public static void main(String[] args) {
        //classes anônimas: classe que existe só por um período no código é que não podem ser reutilizadas
        Animal animal = new Animal(){ //chaves criam uma nova classe anônima
            @Override
            public void andar() {
                System.out.println("ndando nas sombras");
            }
        };
        animal.andar();
    }
}
