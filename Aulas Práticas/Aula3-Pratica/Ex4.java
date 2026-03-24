import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();

        int soma = ((num * 3) + 1) + ((num * 2) -1);

        System.out.println("Valor da soma: " + soma);

        scanner.close();
    }
}
