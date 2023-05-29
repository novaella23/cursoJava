import java.util.*;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  

		System.out.print("Digite o primeiro valor: ");  
		int valor1 = Integer.parseInt(sc.nextLine());

		System.out.print("Digite o segundo valor: ");		
		int valor2 = Integer.parseInt(sc.nextLine());
		
		int soma;
		
		String mensagem = "";
		
		mensagem = valor1 + " + " + valor2;
		
		soma = valor1 + valor2;
		
		mensagem += " = " + soma;
		
		System.out.println(mensagem);

	}

}