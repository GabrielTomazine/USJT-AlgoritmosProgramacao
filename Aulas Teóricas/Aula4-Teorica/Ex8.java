import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int a = scanner.nextInt();

        System.out.println("Digite o primeiro valor: ");
        int b = scanner.nextInt();

        System.out.println("Digite o primeiro valor: ");
        int c = scanner.nextInt();
        
        int temp;

        if (a > b) {

            temp = a;
            a = b;
            b = temp;

        } if (a > c) {

            temp = a;
            a = c;
            c = temp;

        }if (b > c) {

            temp = b;
            b = c;
            c = temp;

        }

        System.out.printf("Valores em ordem crescente: %d, %d, %d", a, b, c);

        scanner.close();
    }
}
