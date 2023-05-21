package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    //Atributos
    private int temporadas, episodiosPorTemporada, minutosPorEpisodio;
    private boolean ativa;


    //Métodos Getters e Setters
    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
    public boolean isAtiva() {
        return ativa;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setDuracaoEmMinutos() {
        super.setDuracaoEmMinutos(getTemporadas() * getEpisodiosPorTemporada() * getMinutosPorEpisodio());
    }

    //Métodos Principais
    @Override
    public void exibeFicaTecnica() {
        System.out.println("Série: " + getNome());
        System.out.println("Ano de Lançamento: " + getAnoDeLancamento());
        System.out.println("Temporadas: " + getTemporadas());
        if (getEpisodiosPorTemporada() != 0)
            System.out.println("Eposódios por Temporada: " + getEpisodiosPorTemporada());
        if (getMinutosPorEpisodio() != 0)
            System.out.println("Minutos por Eposódio: " + getMinutosPorEpisodio());
        setDuracaoEmMinutos();
        if (getDuracaoEmMinutos() != 0)
            System.out.println("Totam de minutos da série: " + getDuracaoEmMinutos());
        System.out.println("Ativa: " + isAtiva());
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

}
