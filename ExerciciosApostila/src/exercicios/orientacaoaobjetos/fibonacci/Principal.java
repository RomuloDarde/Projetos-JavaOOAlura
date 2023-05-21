package exercicios.orientacaoaobjetos.fibonacci;

public class Principal {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        for (int i = 0; i < 6; i++) {
            System.out.print(fibonacci.calculaFibonacci() + " ");
        }


    }
}
