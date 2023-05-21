package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio{
    //Atributos
    private String album, artista, genero;


    //Getters e Setters
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }


    //Métodos Públicos

    @Override
    public int getClassificacao() {
        if (getTotalReproducoes() >= 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
