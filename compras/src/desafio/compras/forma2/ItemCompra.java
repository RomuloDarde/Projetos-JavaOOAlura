package desafio.compras.forma2;

public class ItemCompra {
    //Atributos
    private String nome;
    private double valor;


    //Construtor
    public ItemCompra(String nomeItem, double valorItem) {
        this.nome = nomeItem;
        this.valor = valorItem;
    }


    //Getters
    public String getNome() {return nome;}
    public double getValor() {return valor;}
}
