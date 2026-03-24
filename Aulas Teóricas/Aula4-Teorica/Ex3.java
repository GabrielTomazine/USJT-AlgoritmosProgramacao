import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2;

        if (media >= 6.0) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Exame!");
        }

        scanner.close();
    }
}
