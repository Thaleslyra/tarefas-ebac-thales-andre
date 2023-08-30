package br.com.thales;

public class CalculoMedia {
    public static void main(String[] args) {
        calculaMedia();

    }


    public static void calculaMedia() {
        double nota1 = 7;
        double nota2 = 6.5;
        double nota3 = 8.0;
        double nota4 = 10.0;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(media);


    }
}
