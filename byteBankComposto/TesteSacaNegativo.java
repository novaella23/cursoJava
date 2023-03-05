

public class TesteSacaNegativo {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(0));
		System.out.println(conta.getSaldo());

		//SOBRE ENCAPSULAMENTO:
		//para não acessar o tributo direto, tem que mudar o tributo
		//mudar o atributo para private 
		//e criar um método público para cessar a informação privada
		//ou seja, usar uma interface para acessar ele.
		//deve acessar sempre por métodos, NUNCA por atributos
		//conta.saldo=conta.saldo-101;
		//System.out.println(conta.saldo);

		
		
	}

}
