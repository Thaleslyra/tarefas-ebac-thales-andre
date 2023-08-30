package br.com.thales;

public class Operadores {
    public static void main(String[] args) {

        operacoesAritimeticas();
        operacoesAtribuicoes();
        operacoesIncremento();
        operacoesRelacionais();
        

    }

    private static void operacoesRelacionais() {
        System.out.println("****Operações Relacionais****");
        int num1 = 10;
        int num2 = 10;
        boolean isMaior = num1 > num2;
        System.out.println(isMaior);
        boolean isIgual = num1 == num2;
        System.out.println(isIgual);
        boolean isDiferente  = num1 != num2;
        System.out.println(isDiferente);
        boolean isMaiorOuIgual = num1 >= num2;
        System.out.println(isMaiorOuIgual);


    }

    public static void operacoesIncremento() {
        System.out.println("****  Operações de Incremento");

        int num1 = 10;

        System.out.println(num1);
        num1++;
        System.out.println(num1);
        num1--;
        System.out.println(num1);
    }

    private static void operacoesAtribuicoes() {

        System.out.println("**** Operações Atribuições***");
        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;
        System.out.println(numero3);
         numero3 += numero3;
        System.out.println(numero3);

    }


    public static void operacoesAritimeticas(){

        System.out.println("**** Operações Aritimeticas***");

        int num1 = 10;
        int num2 = 20;
        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 / num2;
        int num6 = num1 * num2;
        int num7 = (10 + 10) / 2;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);

    }
}


