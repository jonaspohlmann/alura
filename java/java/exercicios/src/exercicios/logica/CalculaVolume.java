/*
* Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A,
* em que as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
Vamos declarar as variáveis V, R e A como double e definir um valor qualquer para as variáveis de altura e de raio.
* Agora vamos escrever a fórmula, conforme dita no enunciado e, em seguida, exibir na tela uma mensagem contendo o
* resultado do volume encontrado.
*
* */

package exercicios.logica;

public class CalculaVolume {
    public static void main(String[] args) {
        final double PI = 3.1416;
        double raio = 3.2;
        double altura = 4.9;
        double volume = PI * Math.pow(raio, 2) * altura;

        System.out.println("O volume da lata de óleo é de " + volume + " m3");

    }







}
