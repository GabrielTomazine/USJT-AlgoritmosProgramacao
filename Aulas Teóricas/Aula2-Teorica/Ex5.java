import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o raio da praça: ");
        double rp = scanner.nextDouble();

        System.out.println("Informe o valor do metro quadrado do piso: ");
        double mq = scanner.nextDouble();

        double r = Math.pow(rp, 2);
        double a = Math.PI*r;  
        double c = a * mq;
        
        System.out.printf("A área total da praça: %.2f\nO custo total do material: %.2f", a, c);
    }
}
