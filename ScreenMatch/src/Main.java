import screenmatch.modelos.Filme;
import screenmatch.modelos.Titulo;

public class Main {
    public static void main(String[] args) {


        Filme filme1 = new Filme();
        filme1.setNome("O vento levou");
        filme1.setDuracaoEmMinutos(120);
        filme1.setAnoDeLancamento(1960);

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(10);
        filme1.avalia(9);

        System.out.println(filme1.somaDasAvaliacoes);
        System.out.println("total de avaliacoes: "+ filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.pegaMedia());

    }
}