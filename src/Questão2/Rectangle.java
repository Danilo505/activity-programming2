package Questão2;

import Questão1.ConsoleColors;

public class Rectangle extends FiguraGeometrica {
    protected double area;
    private double base,altura, perimetro;

    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;

        this.area();
        this.perimetro();
    }

    @Override
    public void area() {
        this.area = base * altura;
    }

    @Override
    public void perimetro() {
        this.perimetro = 2 * (base + altura);
    }

    @Override
    public void toStringR() {
        System.out.println(" ");
        System.out.printf(ConsoleColors.RED_BOLD + "Retângulo, área: %.2f perímetro: %.2f", this.area, this.perimetro);
        System.out.println(" ");
    }
}