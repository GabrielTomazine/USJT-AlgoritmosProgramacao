import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a base e um número:");
        int base = scanner.nextInt();
        int num = scanner.nextInt();
        int resultnum = 0;
        int i = 1;
        while (resultnum <=1) {
            resultnum = base/num;
            System.out.println(i);
            i++;
        } 

        scanner.close();
    }
}
