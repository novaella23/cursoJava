
public class Fatorial {

	public static void main(String[] args) {
		int aux = Integer.parseInt(args[0]);
		int resultado = aux--;
		
		while(aux > 1) {
			resultado = resultado * aux;
			aux--;
		}
		System.out.println("O fatorial de " + args[0] +
				" é igual a " + resultado);

	}

}
