package exercicios.orientacaoaobjetos.casaeportas;

public class Principal {
    public static void main(String[] args) {

        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();
        Casa minhaCasa = new Casa(porta1, porta2, porta3);

        porta1.pinta("Bege");
        porta2.pinta("Gelo");
        porta3.pinta("Azul Pastel");
        minhaCasa.pinta("Gelo");
        porta1.abre();
        porta3.abre();


        porta1.statusPorta();
        porta2.statusPorta();
        porta3.statusPorta();
        minhaCasa.statusCasa();



    }
}
