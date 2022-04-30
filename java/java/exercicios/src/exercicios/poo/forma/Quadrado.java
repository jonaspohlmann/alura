package exercicios.poo.forma;

public class Quadrado extends Forma {
    private double lado;

    public Quadrado(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.pow(this.lado, 2);
    }
}
