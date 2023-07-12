package Questão2;

import Questão1.ConsoleColors;

public class Circle extends FiguraGeometrica {
    private double raio, area, perimetro;
    public Circle(double raio) {
        this.raio = raio;

        this.area();
        this.perimetro();
    }

    @Override
    public void area() {
        this.area = Math.PI * raio * raio;
    }

    @Override
    public void perimetro() {
        this.perimetro = 2 * Math.PI * raio;
    }

    @Override
    public void toStringR() {
        System.out.println(" ");
        System.out.printf(ConsoleColors.CYAN_BOLD + "Círculo, área: %.2f perímetro: %.2f", this.area, this.perimetro);
        System.out.println(" ");
    }

}