package ed;

public class VetorTeste {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Jose");

        Vetor lista = new Vetor();

        System.out.println(lista.tamanho());
        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);
        System.out.println(lista.tamanho());

        System.out.println(lista);

        System.out.println("na lista contem a1?");
        System.out.println(lista.contem(a1));

        System.out.println("na lista contem a2?");
        System.out.println(lista.contem(a2));

        Aluno a3 = new Aluno("Daniel"); //não adicionou a3 na lista
        System.out.println("criou a3:" + a3);

        System.out.println("na lista contem a3?");
        System.out.println(lista.contem(a3));

        System.out.println("adicionou a3 na lista");
        lista.adiciona(a3);//adicionando a3 na lista

        System.out.println("TESTANDO POSIÇÃO 2 E  DEVOLVENDO O ALUNO DA POSIÇÃO DADA");
        System.out.println(lista.pega(2));

//        System.out.println("TESTANDO POSIÇÃO 20 E  DEVOLVENDO O ALUNO DA POSIÇÃO DADA");
//        System.out.println(lista.pega(20));

        Aluno a4 = new Aluno("Antonio");

        System.out.println(lista);
        lista.adiciona(0, a4);
        System.out.println(lista);


    }
}
