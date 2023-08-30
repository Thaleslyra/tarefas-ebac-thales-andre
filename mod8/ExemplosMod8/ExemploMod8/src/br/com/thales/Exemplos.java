package br.com.thales;

public class Exemplos {
// as variáveis podem já sereminiciadas na sua declaração.
    private int codigo = 1;
    private long codigoMaior = 3214324;
    private float valorDecimal = 10.4f;
    private double valorDecimal1 = 12.1;
    private String texto = "thales";
    private boolean status;
    private short shor;
    private byte bi;

    //construtor
    public Exemplos() {

    }

    public String retornarText() {
        //escopo de classe o método acessa as variáveis na classe
        this.codigo = 12;
        return "sdsafdsadf";
    }

    public int retornarInteiro() {
        int val = 10;  // variável de escopo de método, só é acesspivel pelo método;
        return val;
    }

    public long retornaLong(long num) {
        return num;
    }

}
