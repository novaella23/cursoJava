
public class Operadores {

	public static void main(String[] args) {
		int valor1 = Integer.parseInt(args[0]);
		String resposta = args[1];
		boolean check = valor1 >= 18 && resposta.equals("sim");
		
		if(check) {
			System.out.println("Voce eh maior de idade e possui CNH");
		}
		
	}

}
