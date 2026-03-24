/* Exercício 4 

Receba duas notas, calcule a média aritmética entre as
notas e imprima o resultado:

"Aprovado" (média >= 6.0); ou
"Exame" (média < 6.0). */ 

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2;

        if (media >= 6.0) {
            System.out.println("Aprovado!");
        } if (media < 6.0) {
            System.out.println("Exame!");
        }

        scanner.close();
    }
}
