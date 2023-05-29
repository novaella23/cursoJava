
public class Parametros {

	public static void main(String[] args) {
		System.out.println("A quantidade de parâmetros passados foi " 
				+ args.length);
		for(int contador = 0; contador < args.length; contador++) {
			System.out.println(args[contador]);
		}
	}

}
