package br.com.alura.bytebank;

import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu saldo: ");
        double saldo = teclado.nextDouble();
        double valorFinal = saldo + saldo/10;
        System.out.print("O saldo, com reajuste de 10% é: " + valorFinal);


    }
}
