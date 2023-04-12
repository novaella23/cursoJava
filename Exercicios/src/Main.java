public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nome = "sabão";
        produto1.preco = 10;
        produto1.descontoParaPix = 2;
        System.out.println(produto1.pegaPrecoFinal(false));

    }
}