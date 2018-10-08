public class Main {

//    Escrever o código do método Integer maiorDeTresNumeros(Integer umNumeroA, Integer umNumeroB, Integer umNumeroC),
//    que deve analisar três números inteiros e retornar o maior deles

    public static void main(String[] args) {

        System.out.println(maiorDeTresNumeros(2,7,5));

    }

    public static Integer maiorDeTresNumeros(Integer umNumeroA, Integer umNumeroB, Integer umNumeroC){

        if (umNumeroA >= umNumeroB && umNumeroA >=umNumeroC){
            return umNumeroA;
        } else if (umNumeroB >= umNumeroC){
            return umNumeroB;
        } else return umNumeroC;

    }

}
