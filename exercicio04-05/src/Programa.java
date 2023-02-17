
public class Programa {

    public static void main(String args[]) {

        Pessoa p = new Pessoa();
        p.nome = "Paulo";
        //p.endereco.logradouro  = new Endereco(); ESTÁ ERRADO, TEM QUE INICIALIZAR
        p.endereco = new Endereco();
        p.endereco.logradouro  = "Aveninda XYZ";
        
       
    
        
    }
}