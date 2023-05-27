package desafio.compras.forma1;

public class ItemCompra {
    //Atributos
    private String nome;
    private double valor;


    //Construtor
    public ItemCompra(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    //Getters
    public String getNome() {return nome;}
    public double getValor() {return valor;}


}
