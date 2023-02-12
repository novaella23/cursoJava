package byteBanco;

public class CriaContaReferencia {

	public static void main(String[] args) {
		 Conta primeiraConta = new Conta();
	        primeiraConta.saldo = 200;
	        System.out.println(primeiraConta.saldo);
	       
	        primeiraConta.saldo += 100;
	        System.out.println(primeiraConta.saldo);
	      
	        Conta segundaConta = primeiraConta; //aqui criei uma segunda variável segundaConta que aponta para primeiraConta
	        segundaConta.saldo = 50;

	        System.out.println("primeira conta tem " + primeiraConta.saldo);
	        System.out.println("segunda conta tem " + segundaConta.saldo);
	        
	        System.out.println(primeiraConta);
	        System.out.println(segundaConta);
	    }

}

//Como falado nos vídeos, primeiraConta e segundaConta são referências, quando imprimimos, 
//vemos um código um tanto estranho, para isso basta adicionar:System.out.println(primeiraConta);

