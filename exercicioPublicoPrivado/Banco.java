public class Banco {
  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.nome = "José";
    cliente.idade = 49;
    cliente.cadastraCPF("123.123.456-36");
  
    System.out.println("O cpf do cliente "+ (cliente.nome) +" é "+(cliente.mostraCPF()));
  }
}