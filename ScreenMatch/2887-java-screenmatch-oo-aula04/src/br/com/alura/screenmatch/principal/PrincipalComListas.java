package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(6);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(9);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);

        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>(); //parametrizar a lista
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);
        lista.add(lost);//override toString em Serie

        for (Titulo item : lista) {
            System.out.println(item);//o toString reescrito em cada classe, faz a apresentação
            //System.out.println(item.getNome());
//            Filme filme = (Filme) item;  ==> CASTING, CONVERTENDO SERIE EM FILME, MAS SERIE NÃO É UM FILME...E SERIE NÃO TEM METODO GETCLASSIFICACAO
//            System.out.println("Classificação" + filme.getClassificacao());
        }


        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(10);

        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(9);

        Serie serie = new Serie("La Casa de Papel", 2017);

        ArrayList<Titulo> lista2 = new ArrayList<>();
        lista2.add(favorito);
        lista2.add(outro);
        lista2.add(serie);

        for (Titulo item2 : lista2) {
            System.out.println("Nome: " + item2.getNome());//diferente da linha 29; funciona o item da lista, reescrito com toString em cada classe
            if (item2 instanceof Filme filme && filme.getClassificacao() > 2) { //só entra Filme filme, para dar classificação
                System.out.println("Classificação: " + filme.getClassificacao());
                //instanceof verifica se um objeto é de um determinado tipo;
            }
        }
        System.out.println("AULA: ORDENAÇÃO===================================================================");
        //==========================================================================
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);
        System.out.println("ORDENANDO COM COLLECTION.SORT UMA CLASSE STRING================");
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        System.out.println("==========================================================================");

        System.out.println("ORDENANDO COM COLLECTION.SORT A CLASSE TITULO pelo nome do objeto================");
        //PARA ISSO PRECISAMOS INPLEMENTAR EM TITULO A INTERFACE Comparable<Titulo> e sobrescrever o método public int compareTo(Titulo outroTitulo), para então funcionar Collections.sort
        Collections.sort(lista2);
        System.out.println(lista2);

        lista2.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano de lançamento: "+ lista2);
        
    }
}
