import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

	public List<Pessoa> pessoas;
	
	public Menu() {
		this.pessoas = new ArrayList<Pessoa>();
	}
	
	public void executar() {
		Scanner sc = new Scanner(System.in); //System.in is a standard input stream  
		
		while(! this.abrirMenu(sc).equals("3")) {
			System.out.println();
			System.out.println("Pressione Enter para continuar...");
			sc.nextLine();
			System.out.println();
		}
	}
	
	public String abrirMenu(Scanner sc) {
		
		String opcao;
		
		System.out.println("Menu");
		System.out.println();
		System.out.println("1-Cadastrar pessoas");
		System.out.println("2-Listar pessoas cadastradas");
		System.out.println("3-Sair");
		System.out.println();
		System.out.println("Digite a opção desejada: ");

		opcao = sc.nextLine();
		
		System.out.println();
		
		switch(opcao) {
			case "1": {
				try {
					Pessoa temp = cadastrar("Pessoa cadastrada com sucesso!", sc);
					this.pessoas.add(temp);
				} catch(Exception e) {
					System.out.println("Idade inválida. Cadastro anulado.");
				}
				
				break;
			}
			case "2": {
				listar(this.pessoas);
				break;
			}
			case "3": {
				sair();
				break;
			}
			default: {
				System.out.println("Opção inválida.");
			}
			
		}
		
		return opcao;

	}

	public static Pessoa cadastrar(String mensagem, Scanner meuScanner) throws NumberFormatException {

		Pessoa gente = new Pessoa();

		System.out.println("Digite o nome:");
		gente.setNome(meuScanner.nextLine());

		System.out.println();
		System.out.println("Digite o CPF:");
		gente.setCpf(meuScanner.nextLine());

		System.out.println();
		System.out.println("Digite a idade:");
		gente.setIdade(Integer.parseInt(meuScanner.nextLine()));

		System.out.println();
		System.out.println("Digite o nome da rua:");
		gente.getEndereco().setRua(meuScanner.nextLine());

		System.out.println();
		System.out.println("Digite o número:");
		gente.getEndereco().setNumero(Integer.parseInt(meuScanner.nextLine()));

		System.out.println();
		System.out.println("Digite o CEP da rua:");
		gente.getEndereco().setCEP(meuScanner.nextLine());
		
		System.out.println();
		System.out.println(mensagem);
		System.out.println();

		return gente;
		
	}
	
	public static void listar(List<Pessoa> pessoas) {
		
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.println("Nome: " + pessoas.get(i).getNome());
			System.out.println("CPF: " + pessoas.get(i).getCpf());
			System.out.println("Idade: " + pessoas.get(i).getIdade());
			System.out.println("Rua: " + pessoas.get(i).getEndereco().getRua());
			System.out.println("Número: " + pessoas.get(i).getEndereco().getNumero());
			System.out.println("CEP: " + pessoas.get(i).getEndereco().getCEP());

			System.out.println();
		}
		
	}

	public static void sair() {
		System.out.println("Saindo...");
	}	
}
