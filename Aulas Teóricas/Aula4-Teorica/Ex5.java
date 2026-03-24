import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("Sim! o número inserido é multiplo de 5 e 3.");
        } else {
            System.out.println("Não! o número inserido não é multiplo de 5 e 3.");
        }

        scanner.close();
    }
}
