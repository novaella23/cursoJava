

public class Conta {
	double saldo;
    int agencia;
    int numero;
    Cliente titular;

    
    //método deposita:  //void é o retorno
    void deposita(double valor) {
	this.saldo += valor;
    }
    
    //método saca:
    public boolean saca(double valor) {
    	if(this.saldo>=valor) {
    		this.saldo-=valor;
    		return true;
    	}else {
    		System.out.println("Saldo insuficiente");
    		return false;
    	}
    }
   public boolean transfere(double valor, Conta destino) {
	   if (this.saldo>=valor) {
		   this.saldo -= valor;
		   destino.deposita(valor);
		   return true;
		}
	   return false;
   }
}