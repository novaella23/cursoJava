

public class Conta {
	private double saldo;//ATRIBUTO privado não pode ser LIDO ou MODIFICADO fora da classe, apenas dentro da classe
    int agencia;
    int numero;
    Cliente titular;

    //já faz p SETTER
    //método deposita:  //void é o retorno
    void deposita(double valor) {
	this.saldo += valor;
    }
    
    //já faz p SETTER
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
    
   //já faz p SETTER:
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
}