//Gerente é um Funcionario, Gerente herda de Funcionario
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	@Override
	public double getBonificacao() {
	    return getBonificacao() + super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;		
	}
	
	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}