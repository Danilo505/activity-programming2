package Questão1;

import java.util.Scanner;

public class FatorialLD {
    Scanner teclado = new Scanner(System.in);
    private int quantidade;


    public FatorialLD() {
        System.out.print(ConsoleColors.YELLOW_BOLD + "Digite o número de casos de prova: ");
        this.quantidade = teclado.nextInt();

        do{
            if (this.quantidade > 1 && this.quantidade < 10){
                break;
            }else{
                System.out.println(ConsoleColors.RED_BOLD + "Você digitou um número de casos invalidos");
                System.out.print(ConsoleColors.GREEN_BOLD + "Digite o número de casos de prova t(2 à 9): ");
                this.quantidade = teclado.nextInt();
            }
        }while (true);

        int[] numbers = new int[this.quantidade];

        for (int i = 0; i < numbers.length; i++) {
            int numberCaso;
            System.out.print(ConsoleColors.WHITE_BOLD + "Digite um número: ");
            numberCaso = teclado.nextInt();

            numbers[i] = numberCaso ;
        }

        this.ultimo_digits(numbers);

    }

    public void ultimo_digits(int[] numbers){
        int[] calcs = new int[this.quantidade];
        int calcIndex = 0;

        for (int number : numbers ) {
            int fatorial = 1;
            for (int i = 1; i <= number ; i++) {
                fatorial *= i;
            }
            calcs[calcIndex] = fatorial;
            calcIndex += 1;
        }

        for (int calc: calcs ) {
            String calcString = String.valueOf(calc);
            int index = calcString.length();
            System.out.println(calcString.charAt(index - 1));
        }
    }
}