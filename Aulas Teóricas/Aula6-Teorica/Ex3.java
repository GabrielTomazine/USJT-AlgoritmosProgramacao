import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp;
        int vezes = 1;
        int somatemp = 0;

        do{
            System.out.println("Digite a temperatura:");
            temp = scanner.nextInt();
            somatemp += temp;
            vezes++;
        } while (temp != 999);

        int mediatemp = somatemp - 999;
        int media = mediatemp / vezes;
        System.out.println(media);

        scanner.close();
    }
}
