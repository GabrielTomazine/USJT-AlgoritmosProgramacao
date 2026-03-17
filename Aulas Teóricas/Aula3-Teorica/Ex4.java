import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o valor (em reais) para a conversão em Dólar: \n");
        double vr = scanner.nextDouble();

        double vf = vr/5.00;

        System.out.printf("O valor da conversão é: %.2f", vf);

        scanner.close();
    }
}
