package br.com.alura.minhasmusicas.modelos;

public class Audio {
    //Atributos
    private String titulo;
    private int totalCurtidas, totalReproducoes, classificacao;



    //Getters e Setters


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getTotalCurtidas() {
        return totalCurtidas;
    }
    public int getTotalReproducoes() {
        return totalReproducoes;
    }
    public int getClassificacao() {
        return classificacao;
    }

    //Métodos Principais
    public void curte (){
        totalCurtidas ++;
    }

    public void reproduz(){
        totalReproducoes ++;
    }
}
