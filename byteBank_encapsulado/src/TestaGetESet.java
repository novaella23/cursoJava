

public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		//não compila conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular=paulo;
		
		paulo.setNome("paulo silveira");
		
		
		//aponta do conta.setTitular para o paulo Cliente.
		conta.setTitular(paulo);
		
	System.out.println(conta.getTitular().getNome());
	
	conta.getTitular().setProfissao("programador");
	//AGORA EM DUAS LINHAS
	
	Cliente titularDaConta = conta.getTitular();
	titularDaConta.setProfissao("programador");
	
	System.out.println(titularDaConta);
	System.out.println(conta.getTitular());
	System.out.println(paulo);
	
	
	}
	
}
