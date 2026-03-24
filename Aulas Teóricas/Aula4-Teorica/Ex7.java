import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int a = scanner.nextInt();

        System.out.println("Digite o primeiro valor: ");
        int b = scanner.nextInt();

        System.out.println("Digite o primeiro valor: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            
            System.out.println("É possível formar um triângulo!");
            
        } else {

            System.out.println("Não possível formar um triângulo!");

        }
        
        scanner.close();
    }
}
