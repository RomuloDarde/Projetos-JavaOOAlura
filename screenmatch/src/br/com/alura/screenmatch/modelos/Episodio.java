package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    //Atributos
    private int numero, totalVizualizacoes;
    private String nome;
    private Serie serie;



    //Getters e Setters
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Serie getSerie() {
        return serie;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    public int getTotalVizualizacoes() {
        return totalVizualizacoes;
    }
    public void setTotalVizualizacoes(int totalVizualizacoes) {
        this.totalVizualizacoes = totalVizualizacoes;
    }

    //Método Interface
    @Override
    public int getClassificacao() {
        if (totalVizualizacoes >= 100) return 4;
        else return 2;
    }
}
