public class Main {

//  Escrever o código do método Boolean cadeiasDeTextoDiferentes(String umTextoA, String umTextoB), que
//  deve analisar duas cadeias de texto e, caso sejam diferentes, retornar true, ou, caso sejam iguais, retornar
//  false.
//  Ajuda: Ver operador !

    public static void main(String[] args) {

        System.out.println(cadeiasDeTextoDiferentes("Carlo", "Carlos"));

    }

    private static Boolean cadeiasDeTextoDiferentes(String umTextoA, String umTextoB) {

        return !(umTextoA.equals(umTextoB));

    }

}