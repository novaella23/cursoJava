package bytebank_herdado;

//CLASSE FILHA
//extends = herda
//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class Gerente extends Funcionario{
	
	private int senha;
	
	/*
	 * public double getBonificacao() { return this.salario; }
	 */
	
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica (int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
}
	
	