import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        int sequencia = 0;
        int a=0, b=1;
        
        while (sequencia < num){
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
            sequencia++;
        }


        scanner.close();
    }
}
