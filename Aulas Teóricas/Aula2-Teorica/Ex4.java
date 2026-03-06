import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme a potência do aparelho (em Watts): ");
        double p = scanner.nextDouble();

        System.out.println("Informe as horas de uso por dia: ");
        double h = scanner.nextDouble();

        System.out.println("Informe o preço do KWh cobrado pela concessionária: ");
        double preco = scanner.nextDouble();

        double c = p*h*30*preco/1000;

        System.out.printf("O custo mensal deste aparelho é: %.2f", c);
    }
}
