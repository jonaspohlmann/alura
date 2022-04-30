package exercicios.poo.forma;

public class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return (this.base * this.altura)/2;
    }
}
