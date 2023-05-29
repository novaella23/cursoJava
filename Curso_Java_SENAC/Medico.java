
public class Medico extends Pessoa {
	
	String CRM;
	static String teste;
	
	public Medico() {
		super();
		this.roupa = "jaleco";
	}
	
	public void trabalhar() {
		System.out.println("Atendendo no consultório.");
	}

}
