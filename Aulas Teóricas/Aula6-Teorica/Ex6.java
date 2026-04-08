import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaalt = 0;

        for (int i = 1; i<=10; i++){
            System.out.println("Digite a altura do bloco " +i+ ":");
            double altura = scanner.nextDouble();
            somaalt += altura;
        }

        double media = somaalt / 10;
        

        System.out.println(media);
    }
}
