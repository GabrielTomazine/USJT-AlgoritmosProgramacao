/* Exercício 6 

Leia o ano de nascimento de uma pessoa e o ano atual.
Informe se ela já tem idade para votar (16 anos ou mais) e se possui
idade para dirigir (18 anos ou mais). */

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano em que nasceu: ");
        int anoN = scanner.nextInt();

        int idade = anoN - 2026;

        if (idade >= 16 && idade >= 18) {
            
            System.out.println("A sua idade está apta a votar e dirigir");

        } else if (idade >= 16 && idade < 18) {

            System.out.println("A sua idade está apta a votar, mas não dirigir");

        } else {

            System.out.println("A sua idade não está apta a votar e nem dirigir");

        }

        scanner.close();
    }
}
