import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = scanner.nextDouble();

        double porcentagem = num * 0.10;
        System.out.printf("10% do valor inserido: %.2f", porcentagem);

        scanner.close();
    }
}
