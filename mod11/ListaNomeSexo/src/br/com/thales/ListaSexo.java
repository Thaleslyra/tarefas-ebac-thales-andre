package br.com.thales;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaSexo {

    public static void main(String[] args) {
        separaSexo();

    }

    private static void separaSexo() {
        Scanner scanner = new Scanner(System.in);
        List<String> sexoFeminino = new ArrayList<String>();
        List<String> sexoMasculino = new ArrayList<String>();


        while (true) {

            System.out.println("\nDigite o nome e o sexo respectimamente ou\" sair \" para parar o programa ");

            String nome = scanner.next();

            if(nome.equalsIgnoreCase("sair")){
                System.out.println("encerrando....");
                break;
            }

            System.out.println("Digite o sexo use \"Masculino\" ou \" Feminino\":");

            String sexo = scanner.next();
            Pessoa pessoa = new Pessoa(nome, sexo);



            if (sexo.equalsIgnoreCase("Feminino")){
                sexoFeminino.add(pessoa.getNome());

            } else if (sexo.equalsIgnoreCase("Masculino")){
                sexoMasculino.add(pessoa.getNome());

            } else {
                System.out.println("sexo Inválido");
            }


        }

        System.out.println("\n**** Nomes Femininos *****");
        for(String nome : sexoFeminino){
            System.out.println(nome);
        }

        System.out.println("\n**** Nomes Masculinos *****");
        for(String nome : sexoMasculino) {
            System.out.println(nome);
        }

    }


}








