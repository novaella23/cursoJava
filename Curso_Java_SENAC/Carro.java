
public class Carro {

	private String cor;
	private int quantidadeCombustivel;

	public Carro(String cor) {
		this.cor = cor;
		this.quantidadeCombustivel = 0;
	}

	public String getCor() {
		return this.cor;
	}
	
	public int getQtdCombustivel() {
		return this.quantidadeCombustivel;
	}
	
	public void andar(int distancia) {
		if(distancia <= this.quantidadeCombustivel) {
			this.quantidadeCombustivel -= distancia;
			System.out.println("O carro " + this.cor 
					+ " andou " + distancia);
			
		} else {
			System.out.println("Para andar " + distancia + " kms será necessário abastecer " + (this.quantidadeCombustivel - distancia)* -1 + " litros ou mais." ); 
		}
	}
	
	public void abastecer(int quantidade) {
		if(quantidade > 0 && this.quantidadeCombustivel + quantidade <= 50) {
			this.quantidadeCombustivel += quantidade;			
		} else {
			System.out.println("Só é possível abastecer com valor entre 1 e 50");
		}
		
	}
	
}
