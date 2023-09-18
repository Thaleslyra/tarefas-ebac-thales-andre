package br.com.thales;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PessoaFisica pessoa1 = new PessoaFisica("Thales", "Rua pria do amor", 233445, "Lyra", "12313344");
        System.out.println("Pessoa Física: ");
        System.out.println(pessoa1);
        PessoaJuridica juridica1 = new PessoaJuridica("Restaurante Aconchego", "Praia do recanto", 1231344, "132356478-00001-78");
        System.out.println("pessoa juridica: ");
        System.out.println(juridica1);



    }
}

