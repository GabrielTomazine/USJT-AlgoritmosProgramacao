import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da premiação: ");
        double premiacao = scanner.nextDouble();

        double primG = premiacao * 0.46;
        double segunG = premiacao * 0.32;
        double terceG = premiacao * 0.22;

        System.out.println(primG + ", " + segunG + ", " + terceG);

        scanner.close();
    }
}
