package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    //Atributos
    private String host, descricao;


    //Getters e Setters
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    //Métodos Públicos

    @Override
    public int getClassificacao() {
        if (getTotalCurtidas() >= 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
