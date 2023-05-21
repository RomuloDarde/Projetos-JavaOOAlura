package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica forever = new Musica();
        forever.setTitulo("Forever");
        forever.setArtista("Kiss");
        for (int i = 0; i < 1000; i++) forever.reproduz();
        for (int i = 0; i < 50; i++) forever.curte();

        Podcast bolhaDev = new Podcast();
        bolhaDev.setTitulo("BolhaDev");
        bolhaDev.setHost("Marcus Mendes");
        for (int i = 0; i < 5000; i++) bolhaDev.reproduz();
        for (int i = 0; i < 1000; i++) bolhaDev.curte();

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(forever);
        preferidas.inclui(bolhaDev);







    }
}
