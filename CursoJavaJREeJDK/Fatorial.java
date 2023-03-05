//imprimir os fatoriais de 1 a 10!
public class Fatorial {
	public static void main(String[] args) {
		
		int numeroDado = 5;
		int fatorial = 1;
		
		for(int num=1; num<=numeroDado; num++) {
						
			fatorial = fatorial * num;
			
		}
		System.out.println("O fatorial de "+ numeroDado + " é " + fatorial);
		}		
	
}
