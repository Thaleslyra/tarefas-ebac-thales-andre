package br.com.thales;

public class BoxingUnboxing {
    public static void main(String[] args) {

        //boxing
        Boolean status = true;
        Character c = 'A';
        Integer idade = 10;
        Long cpf = 12314134l;

        //Unboxing
        boolean status2 = Boolean.TRUE;
        char letra = Character.valueOf('A');
        int idade2 = Integer.valueOf(12);
        long cpf1 = Long.valueOf(123424);
    }
}
