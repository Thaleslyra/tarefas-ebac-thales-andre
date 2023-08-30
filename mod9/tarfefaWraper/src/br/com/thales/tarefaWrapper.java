package br.com.thales;

public class tarefaWrapper {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        num = Integer.valueOf(10);
        System.out.println("Wrapper : " +num );
    }
}
