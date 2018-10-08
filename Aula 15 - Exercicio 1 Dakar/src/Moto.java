public class Moto extends Veiculo {

    public Moto() {
        setPeso(300F);
        setRodas(2);
    }

    public Moto(Float velocidade, Float aceleracao, Float diametroDeGiro, String placa) {
        setVelocidade(velocidade);
        setAceleracao(aceleracao);
        setDiametroDeGiro(diametroDeGiro);
        setPlaca(placa);
        setPeso(300F);
        setRodas(2);
    }
}
