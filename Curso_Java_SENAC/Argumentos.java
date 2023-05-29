
public class Argumentos {

	public static void main(String[] args) {
		
		int total = args.length;

		mostraQuantidade(total, "Foram passados ", " parâmetros.");
		mostraQuantidade(total, "Were passed ", " arguments.");
		
		mostraParametros(args);
		mostraParametros(args);
		mostraParametros(args);

	}
	
	public static void mostraQuantidade(int quantidade, String texto1, String texto2) {
		System.out.println(texto1 
				+ quantidade + texto2);
	}

	public static void mostraParametros(String[] parametros) {
		for(int i=0; i < parametros.length; i++) {
			System.out.println("Parâmetro " + (i+1) + ": " +  parametros[i]);
		}
	}
	
}
