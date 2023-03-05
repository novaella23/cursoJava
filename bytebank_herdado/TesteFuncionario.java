package bytebank_herdado;


public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("09820482098");
		nico.setSalario(2000);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
