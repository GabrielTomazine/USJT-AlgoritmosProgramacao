import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto:");
        double valor = scanner.nextDouble();

        if (valor <= 50) {
            System.out.println("Barato");
        } else if (valor <= 100){
            System.out.println("Médio");
        } else {
            System.out.println("Caro");
        }
        scanner.close();
    }
}
