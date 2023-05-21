package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    //Atributos
    private int tempoTotal;

    //Métodos públicos
    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public void exibeTempoTotal() {
        System.out.println("Tempo total dos títulos inclusos (minutos): " + tempoTotal);
        System.out.println();
    }
}
