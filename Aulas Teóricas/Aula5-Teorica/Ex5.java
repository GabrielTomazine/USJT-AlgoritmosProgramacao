import java.util.Scanner;

public class Ex5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite um símbolo de operação: ");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                double ad = num1 + num2;
                System.out.println(ad);
                break;
            
            case '-':
                double sub = num1 - num2;
                System.out.println(sub);
                break;

            case '*':
                double mult = num1 * num2;
                System.out.println(mult);
                break;
            
            case '/':
                double div = num1 / num2;
                System.out.println(div);
                break;

            default:
                System.out.println("Operação não disponível");
                break;
        }

        scanner.close();
    }
}
