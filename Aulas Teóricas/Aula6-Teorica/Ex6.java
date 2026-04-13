import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaalt = 0;
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;

        for (int i = 1; i<=10; i++){
            System.out.println("Digite a altura do bloco " +i+ ":");
            double altura = scanner.nextDouble();
            somaalt += altura;

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }
        }

        double media = somaalt / 10;
        

        System.out.printf("Altura média dos blocos de concreto: %.2f\nA maior altura é: %.2f\nA menor altura é: %.2f", media, maiorAltura, menorAltura);
        scanner.close();
    }
}
