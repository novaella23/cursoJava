import br.com.alura.screenmatch.modelos.Filme;
import org.w3c.dom.ls.LSOutput;

public class TestaPrincipal {

    public static void main(String[] args) {



        Filme filme1 = new Filme("Avatar", 2009);
        Filme filme2 = new Filme("The Matrix", 1999);
        Filme filme3 = filme1;
//        System.out.println(filme1);
//        System.out.println(filme3);

        Filme filme4 = new Filme("Avatar", 2009);
        Filme filme5 = new Filme("Avatar", 2009);

        if (filme4 == filme5) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

    }

}
