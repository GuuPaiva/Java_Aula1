package oo.composicao;

public class  CursoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Sabrina");
        Aluno aluno2 = new Aluno ("Gustavo");
        Aluno aluno3 = new Aluno ( "Fatima");

        Curso curso1 = new Curso("Programação");
        Curso curso2 = new Curso ("Moda");
        Curso curso3 = new Curso ("Publicidade e Propaganda");

        curso1.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno1);
        curso3.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso2);
        aluno2.adicionarCurso(curso1);
        aluno3.adicionarCurso(curso3);

        for(Aluno aluno: curso1.alunos){
            System.out.println("Estou matriculado no curso " + curso1.nome + " e meu nome é " + aluno.nome);
            //System.out.println("E meu nome é " + aluno.nome);
        }
    }
}
