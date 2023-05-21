package br.com.alura.screenmatch.modelos;

public class Titulo {
    //Atributos
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private int totalDeAvaliacoes;
    private boolean incluidoNoPlano;
    private double avaliacao, somaAvaliacoes;


    //Métodos Setters
    public void setNome(String nome) {this.nome = nome; }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    protected void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }
    protected void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
    protected void setSomaAvaliacoes(double somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
    }
    public int getDuracaoEmMinutos() { return duracaoEmMinutos; }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) { this.duracaoEmMinutos = duracaoEmMinutos; }

    //Métodos Getters
    public String getNome() {
        return nome;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public double getAvaliacao() {
        return avaliacao;
    }
    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }


    //Métodos Principais
    protected void exibeFicaTecnica() {
        System.out.println("-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-");
        System.out.println("Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.printf("Avaliação: %.2f" , avaliacao);
        System.out.println(" (" + totalDeAvaliacoes + " avaliações)");
        System.out.println("Incluído no Plano: " + incluidoNoPlano);
    }

    protected void avalia(double nota) {
        somaAvaliacoes += nota;
        totalDeAvaliacoes ++;
        avaliacao = somaAvaliacoes / totalDeAvaliacoes;
    }


}
