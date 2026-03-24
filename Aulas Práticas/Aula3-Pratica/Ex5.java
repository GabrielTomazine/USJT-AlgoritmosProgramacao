import java.util.Scanner;

public class Ex5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o cateto a: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o cateto b: ");
        double b = scanner.nextDouble();

        double aQuad = Math.pow(a,2);
        double bQuad = Math.pow(b,2);
        double h = Math.sqrt(aQuad + bQuad);

        System.out.println("Valor da hipotenusa: " + h);

        scanner.close();
    }
}