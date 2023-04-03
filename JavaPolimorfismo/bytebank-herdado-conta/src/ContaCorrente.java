
public class ContaCorrente extends Conta {
	
	
	public ContaCorrente(int agencia, int numero) { //construtor não é herdado de Conta é preciso escrever
		super(agencia, numero);                     //dessa forma, com super, que faz a chamada da classe mãe
	}

	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	
	
}
