package Questão2;

import Questão1.ConsoleColors;

public class Triangle extends FiguraGeometrica {
    private double base, lado1, lado2;
    protected double area, perimetro;

    public Triangle(double base, double Lado1, double Lado2) {
        this.base = base;
        this.lado1 = Lado1;
        this.lado2 = Lado2;

        this.area();
        this.perimetro();
    }

    @Override
    public void area() {
        double semiperimmetro = (base + lado1 + lado2) / 2;
        // Usamos a fórmula de Heron para calcular a área
        this.area = Math.sqrt(semiperimmetro*(semiperimmetro - base)*(semiperimmetro - lado1)*(semiperimmetro - lado2));
    }

    @Override
    public void perimetro() {
        this.perimetro = base + lado1 + lado2 ;
    }

    @Override
    public void toStringR() {
        System.out.println(" ");
        System.out.printf(ConsoleColors.YELLOW_BOLD + "Triangulo, área: %.2f perímetro: %.2f", this.area, this.perimetro);
        System.out.println(" ");

    }
}
