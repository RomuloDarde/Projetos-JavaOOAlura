public class ScreenMatch {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("------------------------------");
        System.out.println("Filme: Top Gun: Maverick");

        boolean incluidoNoPlano = true;
        System.out.println("Incluído no Plano: "+incluidoNoPlano);

        double notaCritica = 8.1;
        System.out.println("Nota da Crítica: "+notaCritica);

        int anoDeLancamento = 2022;
        String sinopse = """
                Sinopse: Filme de aventura
                Estrelando o galã dos anos 80, Tom Cruise
                """ + "Ano de Lançamento: " + anoDeLancamento;
        System.out.println(sinopse);

        int estrelas = (int) notaCritica/2;
        System.out.println("Estrelas: " + estrelas);
    }
}
