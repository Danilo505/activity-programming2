
# OOP Combinada com Matriz Simples

Resolução do problema da terceira questão do Lab Week1.


## Funcionalidades

No código que criei ele tem 5 funcionalidade, elas são:

- Adicionar aluno a aniversidade;
- Adicionar curso ao aluno;
- Adicionar nota ao aluno;
- Lista o nome dos alunos de um determinado curso;
- Listar todos os alunos da universidade;

Abaixo está as imagens que mostra o uso de todas essas funcionabilidade comentadas acima. Escolhi 2 exemplos para demonstrar melhor.

### Adicionar aluno a universidade
![Image01](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o3/Imagens3/AdicionarAlunoUniversidade1.jpeg)

### Adicionar segundo aluno universidade
![Image01.2](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o3/Imagens3/AdicionarAlunoUniversidade1.2.jpeg)

### Adicionar curso ao aluno
![Image02](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o3/Imagens3/AdicionarCursoAluno1.jpeg)

### Adicionar curso ao segundo aluno
![Image02.2](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o3/Imagens3/AdicionarCursoAluno1.2.jpeg)

### Adicionar nota ao aluno
![Image03](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o3/Imagens3/AdicionarNotaAluno1.jpeg)

### Adicionar nota ao segundo aluno
![Image03.2](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o3/Imagens3/AdicionarNotaAluno1.2.jpeg)

### Lista o nome dos alunos de um determinado curso.
![Image04.1](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o3/Imagens3/ListarAlunos1.jpeg)


![Image04.2](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o3/Imagens3/ListarAlunos1.2.jpeg)

### Listar todos os alunos da universidade
![Image05](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o3/Imagens3/ListarTodosAlunos.jpeg)

## Código
Abaixo tem todo o código de cada classe usada.

#### Class Aluno

    package Questão3;

    public class Aluno {
        private String nome;
        private double nota;
        private String[] cursos = new String[1];

        public void addCurso(String curso){
            int index = cursos.length;

            if (cursos[index - 1] == null){
                cursos[index - 1] = curso;
            }else{
                cursos = aumentarArray(cursos, index);
                cursos[index] = curso;
            }
            System.out.println(" ");
            System.out.printf("Curso: %s. Foi adicionado ao aluno %s", curso, nome);
            System.out.println(" ");
        }

        public static String[] aumentarArray(String[] cursos, int index){
            String[] newCursos = new String[index + 1];
            System.arraycopy(cursos, 0, newCursos, 0, cursos.length);
            return newCursos;
        }


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getNota() {
            return nota;
        }

        public void setNota(double nota) {
            this.nota = nota;
            System.out.println(" ");
            System.out.printf("Nota: %.2f. Foi adicionado ao aluno %s", nota, nome);
            System.out.println(" ");
        }

        public String[] getCursos() {
            return cursos;
        }

    }

    #### Class main

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

#### Class Universidade

    package Questão3;

    import java.util.Arrays;

    public class Universidade {
        private Aluno[] alunos = new Aluno[1];

        public void addAluno(String nome){
            int index = alunos.length;
            Aluno aluno = new Aluno();
            aluno.setNome(nome);

            if (alunos[index - 1] == null){
                alunos[index - 1] = aluno;
            }else{
                alunos = aumentarArray(alunos, index);
                alunos[index] = aluno;
            }

            System.out.println(" ");
            System.out.printf("Aluno: %s adicionado", nome);
            System.out.println(" ");


        }

        public static Aluno[] aumentarArray(Aluno[] alunos, int index){
            Aluno[] newAlunos = new Aluno[index + 1];
            System.arraycopy(alunos, 0, newAlunos, 0, alunos.length);
            return newAlunos;
        }
        public static String[] aumentarArray(String[] alunosString, int index){
            String[] newAlunosString = new String[index + 1];
            System.arraycopy(alunosString, 0, newAlunosString, 0, alunosString.length);
            return newAlunosString;
        }

        public Aluno[] getAlunos() {
            return alunos;
        }

        public  void listAlunos(){
            for (Aluno aluno : alunos) {
                System.out.println(" ");
                System.out.printf("Nome: %s, Nota: %.2f, Cursos: %s", aluno.getNome(), aluno.getNota(), Arrays.toString(aluno.getCursos()));
                System.out.println(" ");
            }
        }

        public void filter(String curso){
            String[] alunosString = new String[1];
            int index = alunosString.length;

            for (Aluno aluno: alunos) {
                for (int i = 0; i < aluno.getCursos().length; i++) {
                    if (aluno.getCursos()[i] == null){
                        continue;
                    }
                    if (aluno.getCursos()[i].equals(curso)){
                        if (alunosString[index - 1] == null){
                            alunosString[index - 1] = aluno.getNome();
                        }else{
                            alunosString = aumentarArray(alunosString, index);
                            alunosString[index] = aluno.getNome();
                        }
                    }
                }

            }
            System.out.println(" ");
            System.out.printf("Os alunos matriculados em %s são:",curso );
            System.out.println(Arrays.toString(alunosString));
            System.out.println(" ");


        }
    }

### Resultado da execução

O resultado da execução desse código foi demontrado no tópico de Funcionalidades, neste tópico apenas mostrarei o final.

![Image05](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o3/Imagens3/ListarTodosAlunos.jpeg)

### Diagrama de classes

![Diagrama de classes](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o3/Imagens3/DiagramaDeClasses3.jpeg)

### Fluxograma

![Fluxograma](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o3/Imagens3/Fluxograma3.jpeg)