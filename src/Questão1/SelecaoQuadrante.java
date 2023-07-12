package Questão1;

import java.util.Scanner;

public class SelecaoQuadrante {
    Scanner teclado = new Scanner(System.in);
    private int numberX, numberY;


    public SelecaoQuadrante() {
        System.out.print(ConsoleColors.YELLOW_BOLD + "Digite um número inteiro de x(-1000 à 1000): ");
        this.numberX = teclado.nextInt();
        do{
            if ( this.numberX >= -1000 && this.numberX <= 1000 && this.numberX != 0){
                break;
            }else{
                System.out.println(ConsoleColors.RED_BOLD + "Número invalido! Tente novamente");
                System.out.print(ConsoleColors.YELLOW_BOLD + "Digite um número inteiro de x(-1000 à 1000): ");
                this.numberX = teclado.nextInt();
            }

        }while (true);

        System.out.print(ConsoleColors.YELLOW_BOLD + "Digite um número inteiro de y(-1000 à 1000): ");
        this.numberY = teclado.nextInt();
        do{
            if ( this.numberY >= -1000 && this.numberY <= 1000 && this.numberY != 0){
                break;
            }else{
                System.out.println(ConsoleColors.RED_BOLD + "Número invalido! Tente novamente");
                System.out.print(ConsoleColors.YELLOW_BOLD + "Digite um número inteiro de y(-1000 à 1000): ");
                this.numberY = teclado.nextInt();
            }

        }while (true);
        quadrante();
    }

    public void quadrante(){
        if (this.numberX < 0){
            if (this.numberY < 0){
                System.out.println(ConsoleColors.WHITE_BOLD + "Quadrante 3");
            }else{
                System.out.println(ConsoleColors.WHITE_BOLD + "Quadrante 1");
            }
        }else{
            if (this.numberY < 0){
                System.out.println(ConsoleColors.WHITE_BOLD + "Quadrante 4");
            }else{
                System.out.println(ConsoleColors.WHITE_BOLD + "Quadrante 2");
            }
        }
    }

}
