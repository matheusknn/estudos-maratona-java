package br.com.devdojo.maratonajava.Dgenerics.dominio;

public class Carro {
    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
