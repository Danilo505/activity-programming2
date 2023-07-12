package Questão2;

import Questão1.ConsoleColors;

public class IsoscelesTriangle extends Triangle{
    public IsoscelesTriangle(double base, double Lado1, double Lado2) {
        super(base, Lado1, Lado2);
    }

    @Override
    public void toStringR() {
        System.out.println(" ");
        System.out.printf(ConsoleColors.YELLOW_BOLD + "Triangulo Isósceles, área: %.2f perímetro: %.2f", area, perimetro);
        System.out.println(" ");

    }
}
