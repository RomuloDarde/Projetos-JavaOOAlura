package desafio.compras.forma1;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    //Atributos
    private double limite, saldo;
    private List<ItemCompra> listaDeCompras;

    //Construtor
    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = this.limite;
        this.listaDeCompras = new ArrayList<>();
    }


    //Getter e Setter
    public double getLimite() {return limite;}
    public double getSaldo() {return saldo;}
    public List<ItemCompra> getListaDeCompras() {
        return listaDeCompras;
    }

    //Métodos Principais
    public boolean lancaCompra(ItemCompra compra) {
        if (this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.listaDeCompras.add(compra);
            return true;
        } return false;
    }
}
