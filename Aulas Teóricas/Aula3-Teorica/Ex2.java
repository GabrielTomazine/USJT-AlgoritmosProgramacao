import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor dos lados do quadrado (em cm): ");
        double lados = scanner.nextDouble();

        double area = lados * lados;
        System.out.printf("A área do quadrado é: %.2f", area);

        scanner.close();
    }

}
