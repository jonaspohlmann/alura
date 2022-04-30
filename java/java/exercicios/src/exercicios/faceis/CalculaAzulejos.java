/*
* Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede)
* precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo)
* e la (largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima
* quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.
* */

package exercicios.faceis;

public class CalculaAzulejos {
    public static void main(String[] args) {
        Double alturaParede = 10.0;
        Double larguraParede = 10.0;

        Double alturaAzulejo = 2.0;
        Double larguraAzulejo = 2.0;

        Double quantidadeAzulejos = (alturaParede * larguraParede) / (alturaAzulejo * larguraAzulejo);
        System.out.println("Quantidade de azulejos para a parede: " + quantidadeAzulejos);
    }
}
