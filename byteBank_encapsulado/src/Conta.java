

public class Conta {
	private double saldo;//ATRIBUTOs privados não podem ser LIDOs ou MODIFICADOs fora da classe, apenas dentro da classe
    private int agencia;
    private int numero;
    private Cliente titular;//relacionamento entre classes / composição / herança /a classe Conta;
    private static int total=0;//STATIC se refere à classe Conta e não ao objeto (como os demais atributos que se referem ao objeto);
    //STATIC não é da instância, é da classe Conta;

    //método deposita:  //void é o retorno
   
    //CONSTRUTOR/inicializador:
    //a inicialização de atributos é a principal responsabilidade do construtor.
    //O construtor define restrições.
    //ao criar uma conta, é necessário incluir dois parâmetros:
    public Conta(int agencia, int numero) {
    	Conta.total++;
    	System.out.println("O total de contas é " + Conta.total);
    	this.agencia=agencia;
    	this.numero=numero;
    	System.out.println("Você criou a conta "+ this.numero + " na agência "+ this.agencia);
     }
        
    //SET método deposita:  //void é o retorno
    void deposita(double valor) {
    	if(valor>0) {
    		this.saldo += valor;
    		System.out.println("Deposito efetuado: "+valor+". Saldo atualizado: "+this.saldo);
    	}else {
    	System.out.println("Não é permitido depositar o valor "+valor);
    	}
    }
    
    //SET método saca:
    public boolean saca(double valor) {
    	if(this.saldo>=valor&&valor>0) {
    		this.saldo-=valor;
    		System.out.println("Saque no valor de "+valor+" efetuado com sucesso. Saldo atualizado: "+this.saldo);
    		return true;
    	}else if (valor<0) {
    		System.out.println("Não é permitido sacar o valor "+valor);
    		return false;
    	}
    		System.out.println("Saldo insuficiente para realizar o saque de " + valor+". Saldo disponível: "+this.saldo);
    		return false;
    	}
    
  //SET método transfere:
   public boolean transfere(double valor, Conta destino) {
	   if (this.saldo>=valor&&valor>0) {
		   this.saldo -= valor;
		   destino.deposita(valor);
		   return true;
		}
	   System.out.println("não pode transferir: valor insuficiente ou negativo.");
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
	
	//NÃO PRECISA MAIS DE SET NUMERO, POIS JÁ ESTÁ NA INICIALIZAÇÃO DA CONTA (CONSTRUTOR):
	//NESSE CASO A CONTA NASCE E MORRE, NÃO PRECISA ALTERAR O NÚMERO (CASO ESPECÍFICO);
	//os set são void, pois não devolvem nada, apenas alteram.
	//public void setNumero(int numero){
		//this.numero=numero;
	//}
	
	
	public int getAgencia() {
		return this.agencia;
	}
	
	//NÃO PRECISA MAIS DE SET AGENCIA, POIS JÁ ESTÁ NA INICIALIZAÇÃO DA CONTA (CONSTRUTOR):
		//this é do atributo
	//public void setAgencia(int agencia) {
		//this.agencia = agencia;
	//}

	//ESSE É A PONTE ENTRE A CONTA E O CLIENTE
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	//ESSE É A PONTE ENTRE A CONTA E O CLIENTE
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}


