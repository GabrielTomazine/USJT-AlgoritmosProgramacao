import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um número: ");
        int num = scanner.nextInt();
        
        // for(int i = 0; i<=num; ++i)
        //     if(i%2 == 0)
        //         System.out.println(i);

        System.out.printf("\nSucessor: %d\nAntecessor: %d", num+1, num-1);

        scanner.close();
    }
}
