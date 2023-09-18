package br.com.thales;

 class PessoaFisica extends Pessoa {
     public String sobrenome;
     public String cpf;


     public PessoaFisica(String nome, String endereco, Integer telefone, String sobrenome, String cpf) {
         super(nome, endereco, telefone);
         this.sobrenome = sobrenome;
         this.cpf = cpf;
     }

     public String getSobrenome() {
         return sobrenome;
     }

     public void setSobrenome(String sobrenome) {
         this.sobrenome = sobrenome;
     }

     public String getCpf() {
         return cpf;
     }

     public void setCpf(String cpf) {
         this.cpf = cpf;
     }

     @Override
     public String toString() {
         return "PessoaFisica{" +
                 "nome='" + nome + '\'' +
                 ", sobrenome='" + sobrenome + '\'' +
                 ", cpf=" + cpf +
                 ", endereco='" + endereco + '\'' +
                 ", telefone=" + telefone +
                 '}';
     }
 }
