import java.util.Scanner;

public class Ex6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int segundos = scanner.nextInt();

        int horas = segundos/3600;
        int minutos = (segundos%3600)%60;
        int segundosSaida = segundos%60;

        System.out.printf("%dh %dm %ds", horas, minutos, segundosSaida);
        
        scanner.close();
    }

}
