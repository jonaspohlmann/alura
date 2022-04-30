/*
* Escrever um programa que armazene um horário (hora, minuto e segundo) em variáveis, depois, determine e exiba a
* quantidade de segundos que se passaram desde as 0h00min0s e a quantidade de segundos que faltam para a meia-noite.
* */

package exercicios.faceis;

public class CalculaHorario {
    public static void main(String[] args) {
        int hora, minuto, segundo, segundosPassado, segundosFuturo;
        hora = 21;
        minuto = 2;
        segundo = 1;

        segundosPassado = (hora*3600) + (minuto*60) + segundo;
        segundosFuturo = 86400 - segundosPassado;

        System.out.println("Segundos passados: " + segundosPassado);
        System.out.println("Segundos futuros: " + segundosFuturo);

    }
}
