package Sistema;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    //PARTE G
    private List<Aluno> listaDeAlunos = new ArrayList<>();
    private List<Professor> listaDeProfessores = new ArrayList<>();
    private List<Curso> listaDeCursos = new ArrayList<>();
    private List<Matricula> listaDeMatriculas = new ArrayList<>();



    //PARTE I
    public void registrarCurso (String nome, Integer codigoDoCurso, Integer qtdeMaxDeAlunos){
        listaDeCursos.add(new Curso(nome, codigoDoCurso, qtdeMaxDeAlunos));
    }

    public void excluirCurso(Integer codigoDoCurso){
        listaDeCursos.remove(buscarCursoPorCodigo(codigoDoCurso));
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){
        listaDeProfessores.add(new ProfessorAdjunto(nome, sobrenome, codigoProfessor, quantidadeDeHoras));
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){
        listaDeProfessores.add(new ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade));
    }

    public void excluirProfessor(Integer codigoProfessor){
        listaDeProfessores.remove(buscarProfessorPorCodigo(codigoProfessor));
    }

    public void registrarAluno(String nome, String sobrenome, Integer codigoAluno){
        listaDeAlunos.add(new Aluno(nome, sobrenome, codigoAluno));
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
        if (buscarCursoPorCodigo(codigoCurso).adicionarUmAluno(buscarAlunoPorCodigo(codigoAluno))){
            buscarAlunoPorCodigo(codigoAluno).getListaDeCursos().add(buscarCursoPorCodigo(codigoCurso));
            listaDeMatriculas.add(new Matricula(buscarCursoPorCodigo(codigoCurso),buscarAlunoPorCodigo(codigoAluno)));
        }
    }
    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        buscarCursoPorCodigo(codigoCurso).setProfessorTitular((ProfessorTitular) buscarProfessorPorCodigo(codigoProfessorTitular));
        buscarCursoPorCodigo(codigoCurso).setProfessorAdjunto((ProfessorAdjunto) buscarProfessorPorCodigo(codigoProfessorAdjunto));
    }



    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }
    public List<Professor> getListaDeProfessores() {
        return listaDeProfessores;
    }
    public List<Curso> getListaDeCursos() {
        return listaDeCursos;
    }
    public List<Matricula> getListaDeMatriculas() {
        return listaDeMatriculas;
    }
    public Curso buscarCursoPorCodigo(Integer codigoDoCurso){
        Curso cursoBuscado=null;
        for (Curso curso: listaDeCursos) {
            if (curso.getCodigoDeCurso().equals(codigoDoCurso)) {
                cursoBuscado = curso;
            }
        }
        return cursoBuscado;
    }
    public Professor buscarProfessorPorCodigo(Integer codigoDoProfessor){
        Professor professorBuscado=null;
        for (Professor professor: listaDeProfessores) {
            if (professor.getCodigoDeProfessor().equals(codigoDoProfessor)) {
                professorBuscado = professor;
            }
        }
        return professorBuscado;
    }
    public Aluno buscarAlunoPorCodigo(Integer codigoDoAluno){
        Aluno alunoBuscado=null;
        for (Aluno aluno : listaDeAlunos) {
            if (aluno.getCodigoDeAluno().equals(codigoDoAluno)){
                alunoBuscado = aluno;
            }
        }
        return alunoBuscado;
    }
}
