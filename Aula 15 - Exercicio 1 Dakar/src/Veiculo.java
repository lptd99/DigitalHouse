public class Veiculo {

    //1. Criar a classe veículo que tenha os seguintes atributos:
    //  - Velocidade
    //  - Aceleração
    //  - DiametroDeGiro
    //  - Placa
    //  - Peso
    //  - Rodas

    private Float velocidade;
    private Float aceleracao;
    private Float diametroDeGiro;
    private String placa;
    private Float peso;
    private Integer rodas;

    public Veiculo() {
    }

    public Float getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(Float velocidade) {
        this.velocidade = velocidade;
    }
    public Float getAceleracao() {
        return aceleracao;
    }
    public void setAceleracao(Float aceleracao) {
        this.aceleracao = aceleracao;
    }
    public Float getDiametroDeGiro() {
        return diametroDeGiro;
    }
    public void setDiametroDeGiro(Float diametroDeGiro) {
        this.diametroDeGiro = diametroDeGiro;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public Float getPeso() {
        return peso;
    }
    public void setPeso(Float peso) {
        this.peso = peso;
    }
    public Integer getRodas() {
        return rodas;
    }
    public void setRodas(Integer rodas) {
        this.rodas = rodas;
    }
}
