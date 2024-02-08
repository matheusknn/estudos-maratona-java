package br.com.devdojo.maratonajava.Dgenerics.test;

import br.com.devdojo.maratonajava.Dgenerics.dominio.Carro;
import br.com.devdojo.maratonajava.Dgenerics.service.CarroRentavelService;
import br.com.devdojo.maratonajava.Dgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fiat Uno Com Escada")));
        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentalService.retornarObjetoAlugado(carro);

        System.out.println("----------------------------");
    }
}
