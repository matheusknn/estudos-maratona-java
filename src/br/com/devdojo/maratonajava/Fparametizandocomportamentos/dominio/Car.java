package br.com.devdojo.maratonajava.Fparametizandocomportamentos.dominio;

public class Car {
    private String name = "Audi";
    private String color = "Prata";
    private int ano;

    public Car(String name, int ano) {
        this.name = name;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", ano=" + ano +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAno() {
        return ano;
    }
}
