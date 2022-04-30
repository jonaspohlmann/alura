/*
* Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K),
* Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas:
* F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
* */

package exercicios.faceis;

import java.util.Scanner;

public class ConverterTemperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura em Cº: ");
        double celsius = teclado.nextDouble();

        double fahrenheit = celsius*1.8+32;
        double kelvin = celsius+273.15;
        double reaumur = celsius*0.8;
        double rankine = celsius*1.8+32+459.67;

        System.out.println("Kelvin: " + kelvin + "\n"
                            + "Réaumur: " + reaumur + "\n"
                            + "Rankine: " + rankine + "\n"
                            + "Fahrenheit: " + fahrenheit);
    }
}
