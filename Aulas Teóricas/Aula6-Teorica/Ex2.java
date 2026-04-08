import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Números entre eles (ordem crescente): ");

        if (a > b) {
            
            while (a > b) {
                b++;
                System.out.println(b);
            }

        } else {

            while (b > a){
                a++;
                System.out.println(a);
            }

        }

        scanner.close();
    }
}
