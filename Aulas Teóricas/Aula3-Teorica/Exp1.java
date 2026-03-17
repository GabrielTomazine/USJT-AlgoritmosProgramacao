import java.util.Scanner;

public class Exp1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        double desc = preco - (preco * 0.10);
        System.out.println("Valor do produto com 10% de desconto: " + desc);

        scanner.close();
    }
    
}