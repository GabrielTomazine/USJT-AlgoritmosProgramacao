import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ângulo em graus: ");
        double angulo = scanner.nextDouble();

        double radianos = angulo * Math.PI / 180;

        System.out.printf("Ângulo convertido para radianos: %.2f", radianos);

        scanner.close();
    }
}
