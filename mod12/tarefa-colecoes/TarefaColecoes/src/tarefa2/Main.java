package tarefa2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        String sexo;

        System.out.println("Digite os nomes e sexos separados por hífen (Exemplo: Maria-F, João-M):");
        String input = scanner.nextLine();

        String[] entradaArray = input.split(",");

        List<String> nomesMasculinos = new ArrayList<String>();
        List<String> nomesFemininos = new ArrayList<String>();


        for (String entrada : entradaArray) {
            String[] partes = entrada.split("-");
            if (partes.length == 2) {
                 nome = partes[0].trim();
                 sexo = partes[1].trim();
                 if(sexo.contains("M")){
                     nomesMasculinos.add(nome);
                 }
                 if(sexo.contains("F")){
                     nomesFemininos.add(nome);
                }
            } else {
                System.out.println("Entrada inválida: " + entrada);

            }
        }

        Collections.sort(nomesMasculinos);
        System.out.println("***** Nomes Masculinos *****");
        for(String nomeMasculino : nomesMasculinos){
            System.out.println(nomeMasculino);
        }

        Collections.sort(nomesFemininos);
        System.out.println("***** Nomes Femininos *****");
        for(String nomeFeminino : nomesFemininos){
            System.out.println(nomeFeminino);
        }



        scanner.close();

    }


}
