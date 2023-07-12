package Questão2;

import Questão1.ConsoleColors;

public class Square extends Rectangle {
    private double comprimentoLado, perimetro;


    public Square(double comprimentoLado) {
        super(comprimentoLado,comprimentoLado );
        this.comprimentoLado = comprimentoLado;
        this.perimetro();
    }

    @Override
    public void perimetro() {
        this.perimetro = 4 * comprimentoLado;
    }

    @Override
    public void toStringR() {
        System.out.println(" ");
        System.out.printf(ConsoleColors.WHITE_BOLD + "Quadrado, área: %.2f perímetro: %.2f", area, this.perimetro);
        System.out.println(" ");
    }
}