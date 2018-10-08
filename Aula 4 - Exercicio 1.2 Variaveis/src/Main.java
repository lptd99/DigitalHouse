public class Main {

//    Escrever um programa que faça o seguinte:
//        Declarar uma variável “umNumeroA” do tipo Integer.
//        Declarar uma variável “umNumeroB” do tipo Double.
//        Declarar uma variável “umaCadeiaDeTexto” do tipo String.
//        Atribuir um valor a cada variável e, em seguida, imprimir na tela:
//            O valor de cada variável.
//            A soma de “numeroA” + “numeroB”.
//            A diferença entre “numeroA” - “numeroB”.

    public static void main(String[] args) {

        Integer umNumeroA = 30;

        Double umNumeroB = 10.7;

        String umaCadeiaDeTexto = "-> Cadeia de texto <-";

        System.out.println("umNumeroA: " + umNumeroA + "\numNumeroB: " + umNumeroB + "\numaCadeiaDeTexto: " + umaCadeiaDeTexto);

        System.out.println("\numNumeroA + umNumeroB: " + (umNumeroA + umNumeroB));

        System.out.println("\numNumeroA - umNumeroB: " + (umNumeroA - umNumeroB));

    }


}
