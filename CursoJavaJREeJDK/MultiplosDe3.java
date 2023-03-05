//Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100. 

public class MultiplosDe3 {
	public static void main(String[] args) {
	
		for(int num = 1; num <= 100; num++) {
		if (num % 3 ==0) {
			System.out.print(num);
			System.out.print(" - ");
		}
		}
	}
}
