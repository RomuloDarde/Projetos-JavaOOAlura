package desafio.compras.forma2;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    //Atributos
    private double limite, saldo;
    private List<ItemCompra> listaDeCompras;


    //Construtor
    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }


    //Getters
    public double getLimite() {return limite;}
    public double getSaldo() {return saldo;}
    public List<ItemCompra> getListaDeCompras() {return listaDeCompras;}


    //Métodos Principais
    public void lancaCompra (ItemCompra item) {
        this.saldo -= item.getValor();
        listaDeCompras.add(item);
    }

}

