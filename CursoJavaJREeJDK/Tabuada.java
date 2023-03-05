
public class Tabuada {

	public static void main(String[] args) {
		
		for (int tab = 1; tab <=10; tab++) {
			for (int num = 0; num <=10; num++) {
				int resultado = tab * num;
				System.out.print(tab + " X " + num + " = " + resultado);
				System.out.println();
			}
			System.out.println();
		}

	}

}
