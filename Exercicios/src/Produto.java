public class Produto {

    String nome;
    double preco;
    double descontoParaPix;
    double precoFinal;

    double pegaPrecoFinal(boolean pagamentoViaPix) {
        if (pagamentoViaPix == true) {
            return precoFinal = preco - descontoParaPix;


        } else
            return precoFinal = preco;


    }
}



