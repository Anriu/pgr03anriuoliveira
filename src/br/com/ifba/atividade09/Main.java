package br.com.ifba.atividade09;

/**
 * @author anriu
 */

public class Main {

    public static void main(String[] args) {

        Forma[] formas = new Forma[5];

        formas[0] = new Circulo(2);
        formas[1] = new Quadrado(3);
        formas[2] = new Triangulo(4, 5);
        formas[3] = new Esfera(2);
        formas[4] = new Cubo(3);

       
    }
}
