package br.com.thales;

public class ClassePrincipal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        String user = usuario.nomeUsuario();
        System.out.println(user);
    }
}
