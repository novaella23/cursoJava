public class Teste {
	public static void main(String[] args) {
	
		//a inicialização de atributos é a principal responsabilidade do construtor.
		Conta contaDaElaine = new Conta(1, 1234);//construtor: para abrir a conta é obrigatório agencia e numero;
		
		//contaDaElaine.setAgencia(001);
		
		//contaDaElaine.setNumero(1234);
		
		contaDaElaine.deposita(1000);
		
		System.out.println("a agencia da contaDaElaine é "+ contaDaElaine.getAgencia());
		System.out.println("o numero da contaDaElaine é "+ contaDaElaine.getNumero());
		
		
		//CRIANDO CLIENTE elaine
		Cliente elaine = new Cliente();
		
		//===ASSOCIANDO A CONTA CRIADA, ATRAVÉS DE setTitular, AO CLIENTE elaine===
		contaDaElaine.setTitular(elaine);
		
		//qualquer inclusão de algum atributo do cliente será via conta e getTitular() e depois set...
		contaDaElaine.getTitular().setNome("Elaine Fraga");
		System.out.println("o nome do titular da conta é "+ contaDaElaine.getTitular().getNome());
		
		contaDaElaine.getTitular().setCpf("123.456.789-00");
		System.out.println("O numero do CPF da cliente é "+contaDaElaine.getTitular().getCpf());
		
		contaDaElaine.getTitular().setProfissao("Desenvolvedora Java Senior");
		System.out.println("A profissão da cliente é "+contaDaElaine.getTitular().getProfissao());
		
		
		contaDaElaine.deposita(-20);
		
		contaDaElaine.saca(2000);
		
		contaDaElaine.deposita(200);
		
		contaDaElaine.saca(-2);
		
		contaDaElaine.saca(100);
		
		Conta contaDoJoao = new Conta (1, 2345);
		Cliente joao = new Cliente();
	//  contaDoJoao.setTitular(Cliente titular):
		contaDoJoao.setTitular(joao);
		
		contaDoJoao.deposita(1000);
		
		
		Conta contaDaMaria = new Conta (1, 2346);
		Cliente maria = new Cliente();
		contaDaMaria.setTitular(maria);
					
		
		System.out.println("numero de contas: "+ Conta.getTotal());
	}
}
