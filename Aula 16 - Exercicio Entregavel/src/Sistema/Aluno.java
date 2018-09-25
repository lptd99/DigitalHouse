package Sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

    //PARTE A
    private String nome;
    private String sobrenome;
    private Integer codigoDeAluno;
    private List<Curso> listaDeCursos = new ArrayList<>();



    //PARTE A
    public Aluno(String nome, String sobrenome, Integer codigoDeAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoDeAluno = codigoDeAluno;
    }



    //PARTE I
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public Integer getCodigoDeAluno() {
        return codigoDeAluno;
    }
    public void setCodigoDeAluno(Integer codigoDeAluno) {
        this.codigoDeAluno = codigoDeAluno;
    }
    //PARTE A
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(codigoDeAluno, aluno.codigoDeAluno);
    }
    @Override
    public int hashCode() {
        return Objects.hash(codigoDeAluno);
    }





    public List<String> printNomesCursos(){
        List<String> nomeCursos = new ArrayList<>();
        for (Curso curso : listaDeCursos) {
            nomeCursos.add(curso.getNome());
        }
        return nomeCursos;
    }
    public List<Curso> getListaDeCursos() {
        return listaDeCursos;
    }
    public void setListaDeCursos(List<Curso> listaDeCursos) {
        this.listaDeCursos = listaDeCursos;
    }
}
