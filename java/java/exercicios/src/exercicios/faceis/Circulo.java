/*
* Elabore um programa para armazenar uma medida de raio em metros, determinar e exibir o perímetro e a
* área de um círculo com esse raio, através das fórmulas: perímetro = 2 x 3.14159 x raio; área = 3.14159 x raio².
* */
package exercicios.faceis;


public class Circulo {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double raio, perimetro, area;
        raio = 5.0;

        perimetro = 2 * PI * raio;
        area = PI * Math.pow(raio, 2);

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
    }
}
