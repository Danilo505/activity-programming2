package Questão2;

import Questão1.ConsoleColors;

public class ScleneTriangle extends Triangle{
    public ScleneTriangle(double base, double Lado1, double Lado2) {
        super(base, Lado1, Lado2);
    }
    @Override
    public void toStringR() {
        System.out.println(" ");
        System.out.printf(ConsoleColors.YELLOW_BOLD + "Triangulo Escaleno, área: %.2f perímetro: %.2f", area, perimetro);
        System.out.println(" ");

    }
}
