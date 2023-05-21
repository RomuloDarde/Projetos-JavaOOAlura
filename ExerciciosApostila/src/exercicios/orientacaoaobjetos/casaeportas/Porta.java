package exercicios.orientacaoaobjetos.casaeportas;

public class Porta {
    //Atributos
    private String cor;
    private boolean aberta;


    //Métodos
    public void pinta(String cor) {this.cor = cor;}
    public void abre() {this.aberta = true;}
    public void fecha() {this.aberta = false;}
    public boolean isAberta() {return aberta;}

    public void statusPorta() {
        System.out.println("---------------------");
        System.out.println("Cor da Porta: " + cor);
        System.out.println("Aberta? " + aberta);
        System.out.println();
    }


}
