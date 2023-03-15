//Gerente é um FuncionarioAutenticavel, Gerente herda de FuncionarioAutenticavel
public class Gerente extends FuncionarioAutenticavel {

	
	@Override
	public double getBonificacao() {
	    return getBonificacao() + super.getSalario();
	}
	
	
}