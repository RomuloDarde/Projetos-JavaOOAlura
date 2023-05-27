package desafio.compras.forma2;

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
            String itemNome = leitor.next();
            System.out.print("Informe o valor do item: R$ ");
            double itemValor = leitor.nextDouble();

            var item = new ItemCompra(itemNome, itemValor);
            if (item.getValor() <= cartaoDeCredito.getSaldo()) {
                cartaoDeCredito.lancaCompra(item);
            } else {
                System.out.println("Saldo insuficiente!");
                break;
            }
            System.out.print("Digite 1 para continuar, e 0 para sair: ");
            sair = leitor.nextInt();
        }
        cartaoDeCredito.getListaDeCompras().sort(Comparator.comparing(ItemCompra::getValor));

        System.out.println("""
                *****************************
                COMPRAS REALIZADAS
                """);
        for (ItemCompra item: cartaoDeCredito.getListaDeCompras()) {
            System.out.print(item.getNome());
            System.out.printf(" - R$ %.2f\n", item.getValor());
        }
        System.out.println("*****************************");
        System.out.printf("Saldo do cartão de crédito: R$ %.2f\n", cartaoDeCredito.getSaldo());



    }
}
