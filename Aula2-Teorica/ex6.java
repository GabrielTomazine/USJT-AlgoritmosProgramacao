import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do primeiro cateto: ");
        double cr1 = scanner.nextDouble();

        System.out.println("Insira o valor do segundo cateto: ");
        double cr2 = scanner.nextDouble();

        double c1 = Math.pow(cr1, 2);
        double c2 = Math.pow(cr2, 2);
        double h = c1 + c2;
        
        System.out.printf("Valor da hipotenusa: %.2f",Math.sqrt(h));

    }
}
