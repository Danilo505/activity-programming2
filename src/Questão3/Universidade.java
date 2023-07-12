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