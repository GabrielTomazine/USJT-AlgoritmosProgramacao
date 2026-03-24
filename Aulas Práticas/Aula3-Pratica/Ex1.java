import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma distância em Km: ");
        double km = scanner.nextDouble();

        double milhas = km / 1.61;

        System.out.printf("A distância em Km convertida para milhas é: %.2f", milhas);

        scanner.close();
    }
}