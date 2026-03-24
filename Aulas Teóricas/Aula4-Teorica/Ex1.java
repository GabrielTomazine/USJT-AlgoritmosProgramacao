import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num = scanner.nextInt();

        if (num>=0) {
            System.out.println("O número inserido é positivo");
        } else {
            System.out.println("O número inserido é negativo");
        }

        scanner.close();
    }
}