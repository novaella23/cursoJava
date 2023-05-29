
public class TestaHeranca {

	public static void main(String[] args) {
		// Pessoa p1 = new Pessoa();
		Medico m1 = new Medico();
		Medico m2 = new Medico();
		
		m1.seVestir();
		m1.CRM = "12345";
		m1.teste = "ok";
		m2.CRM = "54321";
		m2.teste = "oi";
		
		System.out.println(m1.teste);

	}

}
