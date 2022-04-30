/*
* Número primo é aquele que só é divisível por ele mesmo e pela unidade. Fazer um algoritmo que determine e escreva
* os números primos compreendidos entre um intervalo fornecido pelo usuário.
* */
package exercicios.faceis;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, primo = 0;
        System.out.print("Digite intervalo entre dois números: ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        for (int i = n1; i <= n2; i++) {
            if (i % 2 != 0 || i == 2) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        primo++;
                    }

                }
                if (primo == 2) {
                    System.out.println("Número " + i + " é primo");
                }
                primo = 0;
            }
        }
    }
}
