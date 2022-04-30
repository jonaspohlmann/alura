/*
* Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários,
* e devolvendo a média salarial.
* */

package exercicios.logica;

public class CalculaMediaSalarial {
    public static void main(String[] args) {
        Double[] salarios = new Double[2];
        Double somaSalarios = 0.0;
        Double mediaSalarios = 0.0;

        salarios[0] = 1200.0;
        salarios[1] = 1200.0;

        for (Double salario : salarios) {
            somaSalarios += salario;
        }

        mediaSalarios = somaSalarios/salarios.length;

        System.out.println("Média de salários: " + mediaSalarios);

    }
}
