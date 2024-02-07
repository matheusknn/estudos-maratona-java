package br.com.devdojo.maratonajava.Ccolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "id não pode ser nulo");//garantindo que id não será nulo
        Objects.requireNonNull(nome);
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(preco, manga.preco) == 0 && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public int compareTo(Manga outroManga) {
        //negativo se o this < outroManga
        //se this == outroManga , return 0
        //positivo se this > outroManga
//        if(this.id < outroManga.getId()){
//            return -1;
//        }else if (this.id.equals(outroManga.getId())) {
//            return 0;
//        }else {
//            return 1;
//        }

        //OBS: id é um wrapper e wrappers já implementam o método compareTo
//       return this.id.compareTo(outroManga.getId());//por id
        return this.nome.compareTo(outroManga.getNome());
    }
}
