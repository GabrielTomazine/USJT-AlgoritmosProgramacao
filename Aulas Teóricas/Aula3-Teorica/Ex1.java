import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.printf("Nome: %s, Idade: %d, Altura: %.2f", nome, idade, altura);

        scanner.close();
    }
}
