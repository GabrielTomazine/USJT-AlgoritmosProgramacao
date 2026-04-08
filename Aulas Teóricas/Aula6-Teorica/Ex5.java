import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma senha: ");
        int senha = scanner.nextInt();
        int tentativas = 1;
        int senhaI = 0;

        while (senhaI != senha && tentativas <= 3){
            System.out.println("Qual é a senha?");
            senhaI = scanner.nextInt();
            tentativas++;
        }

        if (senhaI == senha) {
            System.out.println("Acesso Liberado!");
        } else {
            System.out.println("Acesso Bloqueado!");
        }

        scanner.close();
    }
}
