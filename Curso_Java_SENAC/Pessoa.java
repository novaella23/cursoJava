
public class Pessoa {
	
	private String nome;
	private String cpf;
	private int idade;
	private Endereco endereco;
	protected String roupa;
	
	public Pessoa() {
		this.endereco = new Endereco();
		this.roupa = "camiseta";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void trabalhar() {
		System.out.println("Trabalhando...");
	}
	
	public void seVestir() {
		System.out.println("Vestindo " + this.roupa);
	}
	
	public void seVestir(String ovo) {
		System.out.println("Vestindo " + ovo);
	}
	
}
