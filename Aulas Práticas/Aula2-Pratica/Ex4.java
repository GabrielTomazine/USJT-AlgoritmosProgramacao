import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a distância em Km: ");
        double dist = scanner.nextDouble();

        double milhas = dist/1.61;

        System.out.printf("Distância em milhas: %.2f", milhas);

        scanner.close();
    }
}
