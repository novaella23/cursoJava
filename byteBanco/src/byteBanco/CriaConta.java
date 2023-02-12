package byteBanco;

public class CriaConta {

	public static void main(String[] args) {
		 Conta primeiraConta = new Conta();
	        primeiraConta.saldo = 200;
	        System.out.println(primeiraConta.saldo);
	       
	        primeiraConta.saldo += 100;
	        System.out.println(primeiraConta.saldo);
	      
	        //Conta segundaConta = primeiraConta (exemplo no CriaContaReferencia.java;
	        Conta segundaConta = new Conta();
	        segundaConta.saldo = 50;

	        System.out.println("primeira conta tem " + primeiraConta.saldo);
	        System.out.println("segunda conta tem " + segundaConta.saldo);
	        
	        System.out.println(primeiraConta);
	        System.out.println(segundaConta);
	    }

}

//Como falado nos vídeos, primeiraConta e segundaConta são referências, quando imprimimos, 
//vemos um código um tanto estranho, para isso basta adicionar:System.out.println(primeiraConta);

