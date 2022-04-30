/*
* Faça um algoritmo para ler 50 números e armazenar em um vetor VET, verificar e escrever se existem números repetidos
* no vetor VET e em que posições se encontram.
* */
package exercicios.faceis;

import java.util.ArrayList;
import java.util.Random;

public class NumerosRepetidos {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        int quantidadePosicoes = 50;
        Integer random = 0;

        for (int i = 0; i < quantidadePosicoes; i++) {
            random = new Random().ints(1, 50)
                    .findFirst()
                    .getAsInt();
            System.out.println(random);
            numeros[i] = random;
            for (int j = 0; j < quantidadePosicoes; j++) {
                if (numeros[i] == numeros[j] && i != j) {
                    System.out.println("O número " + numeros[i] + " é repetido");
                    break;
                }
            }
        }
    }
}
