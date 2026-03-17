import java.util.Scanner;

public class Exp2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura (em Celsius): ");
        double tempC = scanner.nextDouble();

        double tempF = (tempC * 9.0/5.0) + 32;
        System.out.printf("Temperatura convertida para Fahrenheit: %.2f", tempF);

        scanner.close();
    }

}
