package exercicios.poo.forma;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainForma {

    public static void main(String[] args) {
        Quadrado q = new Quadrado("Quadrado", 4);
        System.out.println(q.area());

        Triangulo t = new Triangulo("Triângulo", 12,8);
        System.out.println(t.area());

        Circulo c = new Circulo("Circulo", 5);
        BigDecimal bd = new BigDecimal(c.area()).setScale(2, RoundingMode.HALF_UP);
        System.out.println(bd.doubleValue());
    }
}
