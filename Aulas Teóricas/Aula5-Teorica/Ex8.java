import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int anoNasc = scanner.nextInt();

        if (anoNasc >= 1001 && anoNasc <= 2000) {
            System.out.println("Século XX");
        } else if (anoNasc >= 2001 && anoNasc <= 3000) {
            System.out.println("Século XX!");
        } else {
            System.out.println("Não está disponível");
        }
        scanner.close();
    }
}
