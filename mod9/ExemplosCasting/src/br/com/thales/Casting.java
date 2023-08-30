package br.com.thales;

public class Casting {

    public static void main(String[] args) {
        int num1 = 10;
      //  short num2 = num1; // lança um erro de execução pois estamos inserir um variável de 32 bits em uma de 16 bits.
        short num2 = (short) num1; // aqui dizemos explicitamente que queremos isso mesmo que percamos dados


    }
}
