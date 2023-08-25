
public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Olá Thales");
        Cliente cliente = new Cliente();
        cliente.CadastrarEndereco("Rua 1");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo());
        cliente.imprimirEndereco();
        System.out.println(cliente.retornarNomeCliente());
        System.out.println(cliente.getValorTotal());
    }

}
