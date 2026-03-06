import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInsira a Distância Percorrida (Em Km): \n");
        double dp  = scanner.nextDouble();

        System.out.println("Insira o Tempo Gasto (Em Horas): \n");
        double tg = scanner.nextDouble();

        double vm = dp/tg;

        System.out.println("A velocidade média é: " + vm);
    }

}