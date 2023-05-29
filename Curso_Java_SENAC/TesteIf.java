
public class TesteIf {

	public static void main(String[] args) {
		int valor1 = Integer.parseInt(args[0]);
		
		if(valor1 < 18) {
			System.out.println("Voce eh menor de idade");	
		} else if (valor1 == 18) {
			System.out.println("Voce acabou de virar maior de idade");
		} else {
			System.out.println("Voce eh maior de idade");
		}

	}

}