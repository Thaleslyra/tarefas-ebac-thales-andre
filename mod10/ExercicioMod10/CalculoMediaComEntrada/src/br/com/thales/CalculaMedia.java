package br.com.thales;

import java.util.Scanner;

public class CalculaMedia {

    public static void main(String[] args) {



        String media = resultadoFinal(calculaMedia());
        System.out.println(media);



    }



    public static double calculaMedia() {
        Scanner s = new Scanner(System.in);

        Double nota1;
        Double nota2;
        Double nota3;
        Double nota4;
        Double media;

        System.out.println("Digite a primeira nota: ");
        nota1 = s.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = s.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = s.nextDouble();
        System.out.println("Digite a quarta nota; ");
        nota4 = s.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        return media;
    }

     public static String resultadoFinal(double nota){
        String result;

       if(nota >= 7 && nota <= 10){
            result = "Aprovado";
        } else if (nota < 7 && nota >= 5) {
            result = "Recuperação";

        }else {
          result = "Reprovado";
        }

         System.out.println("Sua média foi: " + nota);

        return result;


    }


}
