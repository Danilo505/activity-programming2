package Questão3;

import Questão1.ConsoleColors;

import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Universidade universidade = new Universidade();
        int opcao;

        while (true){
            menu();

            System.out.print(ConsoleColors.CYAN_BOLD + "Qual a sua escolha: ");
            opcao = teclado.nextInt();
            do{
                if (opcao > 0 && opcao <= 5){
                    break;
                }else {
                    System.out.println(ConsoleColors.RED_BOLD + "Opção invalida! Tente novamente.");
                    System.out.print(ConsoleColors.CYAN_BOLD + "Qual a sua escolha: ");
                    opcao = teclado.nextInt();
                }

            }while (true);
            teclado.nextLine();

            switch (opcao) {
                case 1 -> addAluno(universidade);
                case 2 -> addCurso(universidade);
                case 3 -> addNota(universidade);
                case 4 -> filterAluno(universidade);
                case 5 -> listAluno(universidade);
            }
        }
    }

    private static void menu() {
        System.out.println(" ");
        System.out.println(ConsoleColors.GREEN_BOLD + "Escolha uma número das opções abaixo:\n ");
        System.out.println(ConsoleColors.YELLOW_BOLD + "1 - Adicionar novo aluno.");
        System.out.println(ConsoleColors.YELLOW_BOLD + "2 - Adicionar curso a um aluno.");
        System.out.println(ConsoleColors.YELLOW_BOLD + "3 - Promover nota a aluno.");
        System.out.println(ConsoleColors.YELLOW_BOLD + "4 - Lista alunos de um curso.");
        System.out.println(ConsoleColors.YELLOW_BOLD + "5 - Listar todos os alunos");
    }
    private static void addAluno(Universidade universidade){
        System.out.println(" ");
        System.out.println(ConsoleColors.GREEN_BOLD+ "-----Adicionar Aluno-----");
        System.out.println(" ");

        System.out.print(ConsoleColors.YELLOW_BOLD + "Digite o nome do Aluno:");
        universidade.addAluno(teclado.next());


    }
    private static void addCurso(Universidade universidade){
        String nomeAluno;
        System.out.println(" ");
        System.out.println(ConsoleColors.YELLOW_BOLD + "-----Adicionar Curso a Aluno-----");
        System.out.println(" ");

        System.out.print(ConsoleColors.YELLOW_BOLD + "Digite o nome do Aluno:");
        nomeAluno = teclado.next();
        teclado.nextLine();

        for (int i = 0; i < universidade.getAlunos().length; i++) {
            if (universidade.getAlunos()[i].getNome().equals(nomeAluno)){
                String nomeCurso;
                System.out.print(ConsoleColors.YELLOW_BOLD + "Digite o nome do Curso:");
                nomeCurso = teclado.nextLine();
                universidade.getAlunos()[i].addCurso(nomeCurso);

            }
        }
    }
    private static void addNota(Universidade universidade){
        String nomeAluno;
        System.out.println(" ");
        System.out.println(ConsoleColors.YELLOW_BOLD + "-----Adicionar Nota a Aluno-----");
        System.out.println(" ");

        System.out.print(ConsoleColors.CYAN_BOLD + "Digite o nome do Aluno:");
        nomeAluno = teclado.next();

        for (int i = 0; i < universidade.getAlunos().length; i++) {
            if (universidade.getAlunos()[i].getNome().equals(nomeAluno)){
                double nota;
                System.out.print(ConsoleColors.GREEN_BOLD + "Digite o a nota:");
                nota = teclado.nextDouble();
                universidade.getAlunos()[i].setNota(nota);
            }
        }
    }
    private static void filterAluno(Universidade universidade){
        String nomeCurso;
        System.out.println(" ");
        System.out.println(ConsoleColors.YELLOW_BOLD + "-----Buscar alunos de um Curso-----");
        System.out.println(" ");
        System.out.print(ConsoleColors.GREEN_BOLD + "Digite o nome do curso:");
        nomeCurso = teclado.nextLine();
        universidade.filter(nomeCurso);
    }
    private static void listAluno(Universidade universidade){
        System.out.println(" ");
        System.out.println(ConsoleColors.GREEN_BOLD + "Abaixo esta a lista de alunos: ");
        universidade.listAlunos();
        System.out.println(" ");
    }
}