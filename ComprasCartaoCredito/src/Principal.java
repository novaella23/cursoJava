import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão de crédito: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;

        while(sair != 0){
            System.out.println("Digite a descrição da compra: ");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra:");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);

            //lancaCompra vai dar true ou false (dependendo se tem saldo para realizar a compra). Se tiver saldo, true
            boolean compraRealizada = cartao.lancaCompra(compra);//se tem saldo, true, e inclui a compra na List

            if(compraRealizada) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Saldo: "+cartao.getSaldo());

            }else{

                System.out.println("Saldo insuficiente!");

                System.out.println("***************************************************\n");
                System.out.println("COMPRAS REALIZADAS:\n");

                Collections.sort(cartao.getCompras());
                for (Compra c : cartao.getCompras()){
                    System.out.println(c.getDescricao() + "  " + c.getValor());
                }

                System.out.println("\n***************************************************");

                System.out.println("\nSaldo do cartão:"+ cartao.getSaldo());
                System.out.println("\n");

            }
        }
    }
}
