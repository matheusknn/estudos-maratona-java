package br.com.devdojo.maratonajava.Dgenerics.test;

import br.com.devdojo.maratonajava.Dgenerics.dominio.Carro;
import br.com.devdojo.maratonajava.Dgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Alugando o carro por 1 mês ...");
        carroRentavelService.retornarCarroAlugado(carro);;
    }
}
