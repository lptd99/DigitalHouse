public class Carro extends Veiculo {

    public Carro() {
        setPeso(1000F);
        setRodas(4);
    }

    public Carro(Float velocidade, Float aceleracao, Float diametroDeGiro, String placa) {
        setVelocidade(velocidade);
        setAceleracao(aceleracao);
        setDiametroDeGiro(diametroDeGiro);
        setPlaca(placa);
        setPeso(1000F);
        setRodas(4);
    }
}
