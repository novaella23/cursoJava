public class Tabuada {

	public static void main(String[] args) {
		
		int num1 = 1;
		int contador;
		
		while(num1 <= 10) {
			contador = 1;
			while(contador <= 10) {
				System.out.println(num1 + " x " + contador + " = "
						+ num1*contador);
				contador++;
			}
			System.out.println();
			num1++;
		}
	}

}
