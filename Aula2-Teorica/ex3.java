import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme o raio da base do silo: ");
        double rp = scanner.nextDouble();

        System.out.println("Informe a altura do silo (em metros): ");
        double h = scanner.nextDouble();
        
        double r = Math.pow(rp, 2);
        double v = Math.PI*r*h;

        System.out.println("\nO Volume do Silo é: " + v);

    }

}
