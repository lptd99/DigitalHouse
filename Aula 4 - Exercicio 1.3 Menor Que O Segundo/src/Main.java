public class Main {

//    Escrever o código do método Boolean menorQueOSegundo (Integer umNumeroA, Integer umNumeroB),
//    que deve analisar dois números inteiros e, se o primeiro número for menor que o segundo número,
//    retornar true, caso contrário, retornar false.

    public static void main(String[] args) {

        System.out.println(menorQueOSegundo(89, 57));

    }

    private static boolean menorQueOSegundo(Integer umNumeroA, Integer umNumeroB) {

        if (umNumeroA < umNumeroB){
            return true;
        } else {
            return false;
        }

    }

}
