import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade >= 5 && idade <= 10) {
            System.out.println("Infantil");

        } else if (idade >= 11 && idade <= 17) {
            System.out.println("Juvenil");

        } else if (idade >= 18) {
            System.out.println("Sênior");     

        } else {
            System.out.println("Não Classificado");

        }
        scanner.close();
    }
}
