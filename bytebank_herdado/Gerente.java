package bytebank_herdado;

//CLASSE FILHA
//SUB CLASS
//extends = herda
//Gerente eh um Funcionario, Gerente herda tudo da class Funcionario (herda atributos e métodos)
public class Gerente extends Funcionario{
	
	private int senha;
	private String login;
		
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
	//Repare que criamos uma nova versão do método
	//autentica. Agora temos dois métodos autentica na 
	//mesma classe que variam na quantidade ou tipos de parâmetros. 
	//Isso se chama sobrecarga de métodos.
	
	 public boolean autentica(String login, int senha) {
		 if (this.login == login && this.senha == senha) {
				return true;
			}else {
				return false;
			} 
	 }
	
	public double getBonificacao(){ 
		return super.getBonificacao() + super.getSalario();
	}//super, pq salário vem de cima, do pai, do funcionário.
}
	
	