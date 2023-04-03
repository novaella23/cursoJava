
import java.util.Scanner;

public class TestandoTeste {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        
		 System.out.println("idade: ");
        int idade = leitor.nextInt();
        System.out.println("valor: ");
        float cotacaoDolar = leitor.nextFloat();
        System.out.println("valor: ");
        double cotacaoEuro = leitor.nextDouble();
        System.out.println("nome: ");
        String nome = leitor.nextLine();/*lê uma linha*/
        System.out.println("nome: ");
        String codigoRua = leitor.next();/*lê uma palavra*/
               
        System.out.println("idade "+idade+" dolar "+cotacaoDolar+" euro "+cotacaoEuro+" nome "+ nome + " nome "+ codigoRua);
	}

}
