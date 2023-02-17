public class Cliente {
    String nome;
    private String cpf;
    int idade;

    public String cadastraCPF(String cpf){
    		this.cpf = cpf;
    		return this.cpf;
   		    }
    
    public String mostraCPF() {
    	return this.cpf;
    }
}