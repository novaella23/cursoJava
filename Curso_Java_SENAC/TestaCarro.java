
public class TestaCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Azul");
		Carro carro2 = new Carro("Verde");

		carro1.abastecer(30);
		carro2.abastecer(15);
		carro1.abastecer(10);

		System.out.println("O carro " + carro1.getCor() 
				+ " tem " + carro1.getQtdCombustivel() 
				+ " litros no tanque.");

		System.out.println("O carro " + carro2.getCor() 
				+ " tem " + carro2.getQtdCombustivel() 
				+ " litros no tanque.");

		carro2.andar(20);
		
		System.out.println("O carro " + carro2.getCor() 
				+ " tem " + carro2.getQtdCombustivel() 
				+ " litros no tanque.");

		
		
	}

}
