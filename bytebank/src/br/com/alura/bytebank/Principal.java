package br.com.alura.bytebank;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao Bytebank!");
        Funcionario f1 = new Funcionario("João", 1, LocalDate.of(1990, 2, 12));

        f1.setNome("João");
        f1.setMatricula(1);
        f1.setDataNascimento(LocalDate.of(1990, 2, 12));

        System.out.println(f1.toString());

    }
}
