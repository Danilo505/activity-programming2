package Questão1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao;

        System.out.println(ConsoleColors.GREEN_BOLD + "Escolha uma das opções  abaixo: \n");
        System.out.println(ConsoleColors.YELLOW_BOLD + "1 - Seleção de Quadrante");
        System.out.println(ConsoleColors.YELLOW_BOLD + "2 - Último digito fatorial \n");
        System.out.print(ConsoleColors.CYAN_BOLD + "Digite 1 ou 2: ");
        opcao = teclado.nextInt();

        do {
            if (opcao > 0 && opcao <= 2){
                break;
            }else{
                System.out.println(ConsoleColors.RED_BOLD + "Sua opção é invalida!");
                System.out.print(ConsoleColors.CYAN_BOLD + "Escolha o número 1 ou 2: ");
                opcao = teclado.nextInt();
            }
        }while (true);

        if (opcao == 1){
            SelecaoQuadrante quadrante = new SelecaoQuadrante();
        }else{
            FatorialLD fatorial = new FatorialLD();
        }

    }
}