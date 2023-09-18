package br.com.thales;

 class PessoaJuridica extends Pessoa {
     public String cnpj;

     public PessoaJuridica(String nome, String endereco, Integer telefone, String cnpj) {
         super(nome, endereco, telefone);
         this.cnpj = cnpj;
     }

     public String getCnpj() {
         return cnpj;
     }

     public void setCnpj(String cnpj) {
         this.cnpj = cnpj;
     }

     @Override
     public String toString() {
         return "PessoaJuridica{" +
                 "cnpj=" + cnpj +
                 ", nome da empresa='" + nome + '\'' +
                 ", endereco='" + endereco + '\'' +
                 ", telefone=" + telefone +
                 '}';
     }
 }
