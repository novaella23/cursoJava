
public class Cliente implements Autenticavel{
	
	int senha;
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}
	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	
	}

}
