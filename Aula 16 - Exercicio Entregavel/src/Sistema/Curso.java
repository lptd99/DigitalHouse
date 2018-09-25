package Sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    //PARTE B
    private String nome;
    private Integer codigoDeCurso;
    //PARTE E
    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;
    private Integer numeroMaxDeAlunos;
    private List<Aluno> listaDeAlunosMatriculados = new ArrayList<>();



    //PARTE I
    public Curso(String nome, Integer codigoDeCurso, Integer numeroMaxDeAlunos) {
        this.nome = nome;
        this.codigoDeCurso = codigoDeCurso;
        this.numeroMaxDeAlunos = numeroMaxDeAlunos;
    }



    //PARTE I
    public boolean adicionarUmAluno(Aluno aluno){
        if(listaDeAlunosMatriculados.size()<numeroMaxDeAlunos){
            listaDeAlunosMatriculados.add(aluno);
            System.out.println("Aluno matriculado com sucesso.");
            return true;
        }
        else
            System.out.println("Não foi possível matricular o aluno.");
            return false;
    }
    public void excluirAluno(Aluno aluno){
        listaDeAlunosMatriculados.remove(aluno);
    }



    //PARTE B
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigoDeCurso, curso.codigoDeCurso);
    }
    @Override
    public int hashCode() {

        return Objects.hash(codigoDeCurso);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getCodigoDeCurso() {
        return codigoDeCurso;
    }
    public void setCodigoDeCurso(Integer codigoDeCurso) {
        this.codigoDeCurso = codigoDeCurso;
    }
    //PARTE E
    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }
    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }
    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }
    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }
    public Integer getNumeroMaxDeAlunos() {
        return numeroMaxDeAlunos;
    }
    public void setNumeroMaxDeAlunos(Integer numeroMaxDeAlunos) {
        this.numeroMaxDeAlunos = numeroMaxDeAlunos;
    }
    public List<Aluno> getListaDeAlunosMatriculados() {
        return listaDeAlunosMatriculados;
    }
    public void setListaDeAlunosMatriculados(List<Aluno> listaDeAlunos) {
        this.listaDeAlunosMatriculados = listaDeAlunos;
    }
}
