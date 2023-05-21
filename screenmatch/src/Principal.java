import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme oPoderosoChefao = new Filme();
        oPoderosoChefao.setNome ("O Poderoso Chefão");
        oPoderosoChefao.setAnoDeLancamento (1972);
        oPoderosoChefao.setDuracaoEmMinutos (175);
        oPoderosoChefao.setDiretor("Francis Ford Coppola");

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setAtiva(false);
        lost.setTemporadas(6);
        lost.setMinutosPorEpisodio(40);
        lost.setIncluidoNoPlano(true);
        lost.setEpisodiosPorTemporada(20);
        lost.setDuracaoEmMinutos();

        oPoderosoChefao.avalia(8);
        oPoderosoChefao.avalia(6.5);
        oPoderosoChefao.avalia(5);
        oPoderosoChefao.avalia(9);
        oPoderosoChefao.avalia(9.5);

        lost.avalia(6);
        lost.avalia(9);
        lost.avalia(6.5);
        lost.avalia(7);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(oPoderosoChefao);
        calculadora.inclui(lost);

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        Episodio piloto = new Episodio();
        piloto.setNome("Piloto");
        piloto.setNumero(1);
        piloto.setSerie(lost);
        piloto.setTotalVizualizacoes(150);



        oPoderosoChefao.exibeFicaTecnica();
        lost.exibeFicaTecnica();
        calculadora.exibeTempoTotal();
        filtro.filtra(oPoderosoChefao);
        filtro.filtra(piloto);


    }
}
