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