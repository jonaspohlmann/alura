package exercicios.poo.forma;

public class Circulo extends Forma {
    private final double PI = 3.1416;
    private double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI*Math.pow(this.raio, 2);
    }
}
