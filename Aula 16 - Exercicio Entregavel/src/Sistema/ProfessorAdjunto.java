package Sistema;

public class ProfessorAdjunto extends Professor {

    //PARTE D
    private Integer horasDeMonitoria;

    //PARTE I


    public ProfessorAdjunto(String nome, String sobrenome, Integer codigoDeProfessor, Integer horasDeMonitoria) {
        super(nome, sobrenome, 0, codigoDeProfessor);
        this.horasDeMonitoria = horasDeMonitoria;
    }

    //PARTE D
    public Integer getHorasDeMonitoria() {
        return horasDeMonitoria;
    }
    public void setHorasDeMonitoria(Integer horasDeMonitoria) {
        this.horasDeMonitoria = horasDeMonitoria;
    }
}
