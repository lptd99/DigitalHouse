import java.util.ArrayList;
import java.util.List;

public class Corrida {
    //Modelar a classe Corrida que tenha os seguintes atributos:
    //  - Distância
    //  - PremioEmDolares
    //  - Nome
    //  - QuantidadeDeVeiculosPermitidos
    //  - Lista de Veículos

    private Float distancia;
    private Float premioEmDolares;
    private String nome;
    private Integer qtdeDeVeiculosPermitidos;
    private List<Veiculo> listaDeVeiculos = new ArrayList<>();

    public void InscreverCarro(Float velocidade,Float aceleracao,Float diametroDeGiro, String placa){
        if (listaDeVeiculos.size()<qtdeDeVeiculosPermitidos){
            listaDeVeiculos.add(new Carro(velocidade, aceleracao, diametroDeGiro, placa));
        }
    }
    public void InscreverMoto(Float velocidade,Float aceleracao, Float diametroDeGiro, String placa){
        if (listaDeVeiculos.size()<qtdeDeVeiculosPermitidos){
            listaDeVeiculos.add(new Moto(velocidade, aceleracao, diametroDeGiro, placa));
        }

    }


    public void eliminarVeiculo(Veiculo veiculo){
        listaDeVeiculos.remove(buscarVeiculo(veiculo));
    }
    public void eliminarVeiculoComPlaca(String umaPlaca){
        listaDeVeiculos.remove(buscarVeiculoPorPlaca(umaPlaca));
    }
    public Veiculo buscarVeiculo(Veiculo veiculo){
        Veiculo veiculoBuscado = null;
        for (Veiculo veiculoDoFor : listaDeVeiculos) {
            if (veiculoDoFor.equals(veiculo)){
                veiculoBuscado = veiculoDoFor;
            }
        }
        return veiculoBuscado;
    }
    public Veiculo buscarVeiculoPorPlaca(String placa){
        Veiculo veiculoBuscado = null;
        for (Veiculo veiculo : listaDeVeiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)){
                veiculoBuscado = veiculo;
            }
        }
        return veiculoBuscado;
    }



    public Float getDistancia() {
        return distancia;
    }
    public void setDistancia(Float distancia) {
        this.distancia = distancia;
    }
    public Float getPremioEmDolares() {
        return premioEmDolares;
    }
    public void setPremioEmDolares(Float premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getQtdeDeVeiculosPermitidos() {
        return qtdeDeVeiculosPermitidos;
    }
    public void setQtdeDeVeiculosPermitidos(Integer qtdeDeVeiculosPermitidos) {
        this.qtdeDeVeiculosPermitidos = qtdeDeVeiculosPermitidos;
    }
    public List<Veiculo> getListaDeVeiculos() {
        return listaDeVeiculos;
    }
    public void setListaDeVeiculos(List<Veiculo> listaDeVeiculos) {
        this.listaDeVeiculos = listaDeVeiculos;
    }
}
