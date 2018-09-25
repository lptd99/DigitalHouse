package Sistema;

import java.util.Date;

public class Matricula {

    //PARTE F
    private Curso curso;
    private Aluno aluno;
    private Date dataDeMatricula;

    //PARTE F
    public Matricula(Curso curso, Aluno aluno) {
        this.curso = curso;
        this.aluno = aluno;
        this.dataDeMatricula = new Date();
    }



    public Curso getCurso() {
        return curso;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public Date getDataDeMatricula() {
        return dataDeMatricula;
    }
}
