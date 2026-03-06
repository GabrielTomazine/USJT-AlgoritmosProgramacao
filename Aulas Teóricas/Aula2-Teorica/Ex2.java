import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o valor (em reais) para a conversão em Dólar: \n");
        double vr = scanner.nextDouble();

        double vf = vr/5.28;

        System.out.println("O valor da conversão é: " + vf);

    }
}
