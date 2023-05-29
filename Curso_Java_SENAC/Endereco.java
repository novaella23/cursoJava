
public class Endereco {
	
	private String rua;
	private int numero;
	private String CEP; 

	public Endereco() {
	}
	
	public Endereco(String teste) {
		this.rua = teste;
	}
	
	public Endereco(int teste) {
		this.numero = teste;
	}
	
	public Endereco(String teste, int teste2) {
		
	}
	
	
	
	public String getRua() {
		return this.rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}
}
