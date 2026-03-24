import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("A categoria do nadador é adulta!");
        } else{
            System.out.println("A categotia do nadador é infantil!");
        }

        scanner.close();
    }
}
