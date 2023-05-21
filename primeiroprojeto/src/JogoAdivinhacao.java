import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        int random = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int contadorTentativas = 0;

        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println("Jogo de adivinhação: Tente adivinhar um número de 0 a 100.");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < 7; i++) {
            System.out.print("Tentativa " + (i+1) + ": ");
            int tentativa = leitura.nextInt();
            if (tentativa > random) System.out.println("Número muito alto.");
            if (tentativa < random) System.out.println("Número muito baixo.");
            if (tentativa == random) {
                System.out.println("Parabéns, você acertou!");
                break;
            }
            contadorTentativas++;
        }

        if (contadorTentativas == 7) System.out.println("Acabaram as tentativas. " +
                "O número era " + random + ".");
    }
}
