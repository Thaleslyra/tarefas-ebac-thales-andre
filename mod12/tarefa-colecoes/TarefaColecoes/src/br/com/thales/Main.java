package br.com.thales;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes separados por vírgulas:");
        String input = scanner.nextLine();


        String[] nomesArray = input.split(",");


        List<String> nomes = new ArrayList<>();


        for (String nome : nomesArray) {
            nomes.add(nome.trim());
        }


        Collections.sort(nomes);


        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();

    }





}
