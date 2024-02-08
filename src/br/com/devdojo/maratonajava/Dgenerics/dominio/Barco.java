package br.com.devdojo.maratonajava.Dgenerics.dominio;

public class Barco {
    private String marca;

    public Barco(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "marca='" + marca + '\'' +
                '}';
    }


    public String getMarca() {
        return marca;
    }
}
