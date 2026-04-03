import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        switch (letra) {
            case 'a':
                System.out.println("Vogal");
                break;
        
            case 'e':
                System.out.println("Vogal");
                break;
            
            case 'i':
                System.out.println("Vogal");
                break;

            case 'o':
                System.out.println("Vogal");
                break;

            case 'u':
                System.out.println("Vogal");
                break;
                
            default:
                System.out.println("Consoante");
                break;
        }

        scanner.close();
    }
}
