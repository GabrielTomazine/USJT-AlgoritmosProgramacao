import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha entre Celsius ou Fahrenheit para fazer a conversão: ");
        String temp = scanner.nextLine();

        switch (temp) {
            case "Celsius":
                
                System.out.println("Fazendo a conversão de Celsius para Fahrenheit. \nDigite a temperatura em Celsius:");
                double celsius = scanner.nextDouble();

                double convF = ((celsius * 9) /5) +32;
                System.out.println("°" + convF);

                break;
            
            case "Fahrenheit":
                
                System.out.println("Fazendo a conversão de Fahrenheit para Celsius. \nDigite a temperatura em Fahrenheit:");
                double Fahr = scanner.nextDouble();

                double convC = ((Fahr - 32) * 5) / 9;
                System.out.println("°" + convC);

                break;

            default:
                System.out.println("Resposta Inválida");
                break;
        }
        scanner.close();
    }
}
