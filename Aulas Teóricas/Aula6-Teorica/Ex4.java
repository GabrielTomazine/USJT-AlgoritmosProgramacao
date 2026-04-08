import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número positivo: ");
        int num = scanner.nextInt();

        while (num > 0){
            num--;
            System.out.println("Sistema operando. T-menos " +num+ " segundos");
        }
        scanner.close();
    }
}
