package desafio.compras.forma1;

import desafio.compras.forma1.CartaoDeCredito;
import desafio.compras.forma1.ItemCompra;

import java.util.Comparator;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.print("Informe o limite do cartão de crédito: ");
        double limite = leitor.nextDouble();
        var cartaoDeCredito = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair == 1) {
            System.out.print("Informe o item comprado: ");
            String nomeItem = leitor.next();
            System.out.print("Informe o valor do ítem: R$ ");
            double valorItem = leitor.nextDouble();

            var itemCompra = new ItemCompra(nomeItem, valorItem);
            boolean verificaCompra = cartaoDeCredito.lancaCompra(itemCompra);

            if (verificaCompra == true) {
                System.out.println("Compra realizada.");
                System.out.print("Digite 1 para continuar, ou qualquer outro dígito para sair: ");
                sair = leitor.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                break;
            }
        }

        System.out.println("""
                    ******************************
                    COMPRAS REALIZADAS          
                    """);
        cartaoDeCredito.getListaDeCompras().sort(Comparator.comparing(ItemCompra::getValor));
        for (ItemCompra c:cartaoDeCredito.getListaDeCompras()) {
            System.out.print(c.getNome());
            System.out.printf(" - R$ %.2f\n", c.getValor());
        }
        System.out.println("******************************");
        System.out.printf("Saldo do cartão: R$ %.2f\n", cartaoDeCredito.getSaldo());

    }
}
