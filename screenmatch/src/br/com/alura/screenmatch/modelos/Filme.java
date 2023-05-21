package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    //Atributos
    private String diretor;


    //Setter
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    //Getter
    public String getDiretor() { return diretor; }


    //Metodos
    @Override
    public void exibeFicaTecnica() {
        System.out.println("Filme: " + getNome());
        System.out.println("Ano de Lançamento: " + getAnoDeLancamento());
        System.out.println("Diretor: " + getDiretor());
        System.out.println("Duração em Minutos: " + getDuracaoEmMinutos());
        System.out.printf("Avaliação: %.2f" , getAvaliacao());
        System.out.println(" (" + getTotalDeAvaliacoes() + " avaliações)");
        System.out.println("Incluído no Plano: " + isIncluidoNoPlano());
        System.out.println();

    }

    @Override
    public void avalia(double nota) {
        setSomaAvaliacoes (getSomaAvaliacoes() + nota);
        setTotalDeAvaliacoes (getTotalDeAvaliacoes() + 1);
        setAvaliacao(getSomaAvaliacoes() / getTotalDeAvaliacoes());
    }

    @Override
    public int getClassificacao() {
        return (int) getAvaliacao() / 2;
    }
}
