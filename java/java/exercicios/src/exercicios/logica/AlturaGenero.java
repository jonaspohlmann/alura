/*
* Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
* Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
* */

package exercicios.logica;

import java.util.Scanner;

public class AlturaGenero {
    public static void main(String[] args) {
        Scanner teclado;
        Double[] alturas = new Double[10];
        String[] generos = new String[10];

        Double menorAltura = null;
        Double maiorAltura = null;
        Double mediaAlturaHomens = 0.0;
        Integer numeroMulheres = 0;
        Integer numeroHomens = 0;

        for (int i = 0; i < 10; i++) {
            teclado = new Scanner(System.in);

            System.out.println("Digite a altura: ");
            alturas[i] = Double.parseDouble(teclado.nextLine());

            System.out.println("Digite o genero "
                                + "\n M - Masculino"
                                + "\n F - Feminino");
            generos[i] = teclado.nextLine();

            //Número mulheres
            if (generos[i].equals("F")) {
                numeroMulheres++;
            //Média altura homens
            } else if (generos[i].equals("M")) {
                numeroHomens++;
                mediaAlturaHomens += alturas[i];
            }

            //Maior Altura
            if (maiorAltura == null) {
                maiorAltura = alturas[i];
            } else if (maiorAltura < alturas[i]) {
                maiorAltura = alturas[i];
            }

            //Menor Altura
            if (menorAltura == null) {
                menorAltura = alturas[i];
            } else if (menorAltura > alturas[i]) {
                menorAltura = alturas[i];
            }
        }

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Média de altura dos homens: " + mediaAlturaHomens/numeroHomens);
        System.out.println("Número de mulheres: " + numeroMulheres);
    }

}
