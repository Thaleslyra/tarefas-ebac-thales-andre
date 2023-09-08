package br.com.thales;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();


    }

    private static void exemploNumeros() {
        System.out.println("***** Exemplos números *****");
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(3);
        System.out.println(numeros);
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("*** Exemplo lista simples ***");
        List<String> lista = new ArrayList<String>();
        lista.add("João da silva");
        lista.add("Antônio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println(" ");
    }

    private static void exemploListaSimples() {
        System.out.println("*** Exemplo lista simples ordem ascendente ***");
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antônio Sousa");
        lista.add("Lúcia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println(" ");
    }
}
