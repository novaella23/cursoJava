package bytebank_herdado;

public class ControleBonificacao {

	private double soma;
	
	public void registra(Funcionario f) { //ESSE MÉTODO PUXA A BONIFICACAO DE CADA UM; FUNCIONÁRIO É MAIS GENÉRICO E SERVE COMO REFERÊNCIA PARA OS DEMAIS
		double boni = f.getBonificacao();
		this.soma=this.soma+boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
//Referências de tipos de classes mais genéricas referenciem objetos mais específicos.

//Correto e vimos isso no código, através do exemplo:

//Funcionario f = new Gerente();