package br.com.devdojo.maratonajava.Eclassesinternas.test;

public class OuterClassesTest02 {
    private String nome = "Zedão";
    //classes locais = classe dentro de um método ou bloco de inicialização
    //quase nunca usado
    void print() {
        class LocalClass { //usável abstract/final
            public void printLocal() {
                System.out.println(nome);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
