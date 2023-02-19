

public class Conta {
	private double saldo;//ATRIBUTOs privados não podem ser LIDOs ou MODIFICADOs fora da classe, apenas dentro da classe
    private int agencia;
    private int numero;
    private Cliente titular;//importante, pois dá o vínculo entre Conta e Cliente!!!

    
    //método deposita:  //void é o retorno
    void deposita(double valor) {
	this.saldo += valor;
    }
    
    //método saca:
    public boolean saca(double valor) {
    	if(this.saldo>=valor&&valor>=0) {
    		this.saldo-=valor;
    		return true;
    	}else if (valor<=0) {
    		System.out.println("Não pode sacar valor negativo");
    		return false;
    	}
    		System.out.println("Saldo insuficiente");
    		return false;
    	}
    
  //método transfere:
   public boolean transfere(double valor, Conta destino) {
	   if (this.saldo>=valor) {
		   this.saldo -= valor;
		   destino.deposita(valor);
		   return true;
		}
	   
	   return false;
   }

//forma de acessar o saldo que está como atributo privado.
   //esse método apenas retorna o saldo privado
	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}
	
	//os set são void, pois não devolvem nada, apenas alteram.
	public void setNumero(int numero){
		this.numero=numero;
	}
	
	//this é do atributo
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
}


