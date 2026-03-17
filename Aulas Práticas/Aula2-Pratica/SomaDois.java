import java.util.Scanner;

public class SomaDois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Escreva o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Escreva o terceiro número: ");
        double num3 = scanner.nextDouble();

        double soma = num3*(num1 + num2);
        System.out.println("Valor da soma: " + soma);

        scanner.close();
    }
}