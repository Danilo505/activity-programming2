package Questão2;

import Questão1.ConsoleColors;

public class EquillateralTriangle extends Triangle{
    public EquillateralTriangle(double base) {
        super(base, base, base);

    }
    @Override
    public void toStringR() {
        System.out.println(" ");
        System.out.printf(ConsoleColors.YELLOW_BOLD + "Triangulo Equilatero, área: %.2f perímetro: %.2f", area, perimetro);
        System.out.println(" ");

    }
}