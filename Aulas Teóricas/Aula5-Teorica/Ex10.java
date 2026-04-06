import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas de x e y:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Quadrante I: (Positivo, Positivo)");
        } else if (x < 0  && y > 0) {
            System.out.println("Quadrante II: (Negativo, Positivo)");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante III: (Negativo, Negativo)");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante IV: (Positivo, Negativo)");
        } else {
            System.out.println("Não pertence a nenhum quadrante: (0,0)");
        }

        scanner.close();
    }
}
