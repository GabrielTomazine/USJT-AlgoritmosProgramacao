import java.util.Scanner;

public class AttScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
    
        System.out.println("\nAtividade de como utilizar o Scanner");

        //Scanner com String
        System.out.println("Scanner com String");
        String texto = scanner.nextLine();
        System.out.println("O que você escreveu: " + texto);

        //Scanner com Int
        System.out.println("Scanner com Int");
        int inteiro = scanner.nextInt();
        System.out.println("O número inteiro que você escreveu: " + inteiro);

        //Scanner com Float
        System.out.println("Scanner com Float");
        float real = scanner.nextFloat();
        System.out.println("O número real que você escreveu: " + real);

        //Scanner com Double
        System.out.println("Scanner com Double");
        double duplo = scanner.nextDouble();
        System.out.println("O que você escreveu: " + duplo);
        
        //Scanner com Boolean
        System.out.println("Scanner com Boolean (Escreva verdadeiro (true) ou falso (false))");
        Boolean vf = scanner.nextBoolean();
        System.out.println("O que você escreveu: " + vf);

        scanner.close();
    }
}