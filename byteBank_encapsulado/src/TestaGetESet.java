

public class TestaGetESet {
	
	public static void main(String[] args) {
		
		//CRIANDO UMA CONTA conta
		Conta conta = new Conta();
		
		//colocando um número na conta
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		//CRIANDO UM CLIENTE paulo
		Cliente paulo = new Cliente();
		
		//colocando um nome para cliente paulo
		paulo.setNome("paulo silveira");
		
		//ASSOCIAÇÃO DE CONTA COM CLIENTE
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
