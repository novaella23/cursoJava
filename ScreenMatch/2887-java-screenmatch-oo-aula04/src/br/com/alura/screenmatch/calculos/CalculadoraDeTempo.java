package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Filme;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//        System.out.println("Adicionando duração em minutos de " + f.getNome());
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//        System.out.println("Adicionando duração em minutos de " + s.getNome());
//    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo.getNome());
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
