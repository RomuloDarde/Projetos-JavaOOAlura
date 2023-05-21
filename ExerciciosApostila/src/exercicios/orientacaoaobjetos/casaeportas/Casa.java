package exercicios.orientacaoaobjetos.casaeportas;

public class Casa {
    //Atribuutos;
    private String cor;
    private Porta porta1, porta2, porta3;


    //Construtor


    public Casa(Porta porta1, Porta porta2, Porta porta3) {
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }

    //Métodos
    public void pinta(String cor) {this.cor = cor;}

    public void statusCasa() {
        int somaPortasAbertas = 0;
        if (porta1.isAberta() == true) somaPortasAbertas ++;
        if (porta2.isAberta() == true) somaPortasAbertas ++;
        if (porta3.isAberta() == true) somaPortasAbertas ++;
        System.out.println("-----------------------");
        System.out.println("Cor da Casa: " + cor);
        System.out.println("Quantas portas abertas? " + somaPortasAbertas);
    }
}
