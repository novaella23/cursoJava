public class Teste {
	public static void main(String[] args) {
	
		Conta contaDaElaine = new Conta();
		
		contaDaElaine.setAgencia(001);
		
		contaDaElaine.setNumero(1234);
		
		contaDaElaine.deposita(1000);
		
		System.out.println("a agencia da contaDaElaine é "+ contaDaElaine.getAgencia());
		System.out.println("o numero da contaDaElaine é "+ contaDaElaine.getNumero());
		System.out.println("depositou na contaDaElaine o valor de "+ contaDaElaine.getSaldo());
		
		//CRIANDO CLIENTE elaine
		Cliente elaine = new Cliente();
		//ASSOCIANDO A CONTA CRIADA, ATRAVÉS DE setTitular, AO CLIENTE elaine
		contaDaElaine.setTitular(elaine);
		
		//qualquer inclusão de algum atributo do cliente será via conta e getTitular() e depois set...
		contaDaElaine.getTitular().setNome("Elaine Fraga");
		System.out.println("o nome do titular da conta é "+ contaDaElaine.getTitular().getNome());
		
		contaDaElaine.getTitular().setCpf("123.456.789-00");
		System.out.println("O numero do CPF da cliente é "+contaDaElaine.getTitular().getCpf());
		
		contaDaElaine.getTitular().setProfissao("Desenvolvedora Java Senior");
		System.out.println("A profissão da cliente é "+contaDaElaine.getTitular().getProfissao());
		
		
		
		
	}
}
