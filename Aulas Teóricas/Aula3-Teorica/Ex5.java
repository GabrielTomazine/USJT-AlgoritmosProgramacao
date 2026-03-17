import java.util.Scanner;

public class Ex5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        double a = Math.pow(altura,2);

        double imc = peso / a;
        System.out.printf("O IMC é: %.2f", imc);


        scanner.close();
    }

}
