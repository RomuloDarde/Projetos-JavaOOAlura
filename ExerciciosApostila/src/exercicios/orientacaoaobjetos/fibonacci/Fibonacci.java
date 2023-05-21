package exercicios.orientacaoaobjetos.fibonacci;

public class Fibonacci {
    //Atributos
    private int numero1 = 0, numero2 = 1, numero3;


    //Método Principal
    public int calculaFibonacci() {
        numero3 = numero2 + numero1;
        numero1 = numero2;
        numero2 = numero3;
        return numero1;
    }
}
