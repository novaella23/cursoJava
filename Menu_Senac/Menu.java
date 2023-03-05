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
				this.pessoas.add(cadastrar("Pessoa cadastrada com sucesso!", sc));
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

	public Pessoa cadastrar(String mensagem, Scanner meuScanner) {
		
		Pessoa gente = new Pessoa("");
				
		System.out.println();
		System.out.println("Digite o nome:");
		gente.setNome(meuScanner.nextLine());
		//gente.nome = meuScanner.nextLine();
		
		
		

		System.out.println();
		System.out.println("Digite o CPF:");
		gente.cpf = meuScanner.nextLine();
		
		
		System.out.println();
		System.out.println("Digite a idade:");
		gente.idade = Integer.parseInt(meuScanner.nextLine());
		
		
		System.out.println();
		System.out.println(mensagem);
		System.out.println();

		return gente;
		
	}
	
	public void listar(List<Pessoa> pessoas) {
		
		
		 for (int i = 0; i <= pessoas.size(); i++) {
	            System.out.println("nome: " + pessoas.get(i));
	        }
		
		
		
		

		
		
		//Receber a lista de pessoas e criar o loop de acordo com a quantidade de itens na lista
		
		//System.out.println("Nome: " + elementoDaLista.nome);
		//System.out.println("CPF: " + elementoDaLista.cpf);
		//System.out.println("Idade: " + elementoDaLista.idade);
		//System.out.println();
	}

	public static void sair() {
		System.out.println("Saindo...");
	}	
}
