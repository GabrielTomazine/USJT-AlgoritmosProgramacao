import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Kelvin, a temperatura final a ser atingida e o passo (incremento): ");
        double k = scanner.nextDouble();
        double kf = scanner.nextDouble();
        double passo = scanner.nextDouble();
        k -= passo;
        
        while (kf > k) {
            k += passo;
            double c = k - 273.15;

            System.out.printf("%.2f°K\t%.2f°C\n",k,c);
        }

        scanner.close();
    }
}