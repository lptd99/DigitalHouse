package Sistema;

public class ProfessorTitular extends Professor{

    //PARTE D
    private String especialidade;


    public ProfessorTitular(String nome, String sobrenome, Integer codigoDeProfessor, String especialidade) {
        super(nome, sobrenome, 0, codigoDeProfessor);
        this.especialidade = especialidade;
    }

    //PARTE D
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
