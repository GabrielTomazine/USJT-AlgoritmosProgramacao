import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.printf("A média das três notas é: %.2f", media);

        scanner.close();
    }
}
