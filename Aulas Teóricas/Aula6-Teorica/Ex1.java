import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        int i = 1;
        while (i <= 10){
            int tabuada = num * i;
            i++;
            if (tabuada %3 == 0) {
                System.out.println("\n" + tabuada);
                
            }

        }
        scanner.close();
    }
}