package br.com.devdojo.maratonajava.Eclassesinternas.test;

public class OuterClassesTest01 {
    private String nome = "Sasuke";

    class InnerClass {
        public void printOuterClassAttribute() {
            System.out.println(nome);
            System.out.println(this);//se referindo a classe InnerClass
            System.out.println(OuterClassesTest01.this);//se referindo a classe outer
        }
    }

    public static void main(String[] args) {
        //classe interna: consiste em uma classe dentro de outra classe
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        InnerClass inner = outerClass.new InnerClass();
        //ou
//        OuterClassesTest01.InnerClass inner2 = outerClass.new InnerClass();
        inner.printOuterClassAttribute();
    }
}
