/*
* Escreva um programa para determinar a quantidade de cavalos necessários para se levantar uma massa de m
* quilogramas a uma altura de h metros em t segundos. Considere cavalos = (m * h / t) / 745,6999
* */

package exercicios.faceis;

public class QuantidadeCavalos {
    public static void main(String[] args) {
        Double m = 5.0;
        Double h = 6.0;
        Double t = 9.0;

        Double quantidadeCavalos = (m * h / t) * 745.6999;

        System.out.println("Quantidade de cavalos necessários é : " + quantidadeCavalos);

    }
}
