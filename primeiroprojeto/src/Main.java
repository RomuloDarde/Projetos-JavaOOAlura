import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("------------------------------------");
        double nota = 7.526;
        System.out.format("A nota é: %.2f\n" , nota);

        System.out.println("------------------------------------");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius que será convertida para Farenheit: ");
        double grausCelsius = teclado.nextDouble();
        int converterParaFarenheit = (int) (grausCelsius * 1.8) + 32;
        System.out.println("Conversão para Farenheit: " + converterParaFarenheit);



    }
}