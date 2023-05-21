package exercicios.orientacaoaobjetos.contabancaria;

import exercicios.orientacaoaobjetos.contabancaria.Conta;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Cliente Romulo = new Cliente ("Rômulo Schmidt", "004.773.170-22");
        Conta contaRomulo = new Conta (Romulo, 3263,
                1040316, new Data(18,05,2023));
        contaRomulo.deposita(20000);

        Cliente Pedro = new Cliente ("Pedro Antunes", "010.447.678-50");
        Conta contaPedro = new Conta(Pedro, 1004,
                54439, new Data(17, 05, 2023));

        contaRomulo.saque(-250);
        contaRomulo.saque(25000);
        contaRomulo.saque(2000);
        contaRomulo.transferePara(contaPedro, 3000);

        contaRomulo.statusConta();
        contaPedro.statusConta();









    }
}
