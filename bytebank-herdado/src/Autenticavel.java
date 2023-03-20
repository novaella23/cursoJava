//I N T E R F A C E

//contrato Autenticável
//quem assina esse contrato, precisa implementar
	//implementar: método setSenha
	//				método autentica


public abstract interface Autenticavel {

	public abstract void setSenha(int senha); 
	
	public abstract boolean autentica(int senha);

}
