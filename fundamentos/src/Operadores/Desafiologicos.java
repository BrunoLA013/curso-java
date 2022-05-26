package Operadores;

public class Desafiologicos {
    public static void main(String[] args) {
        // TRabalho na Terça (v ou F)
        //Trabalho na quinta (v ou F)
        /*
        * Se só um trabalho der certo compra a TV 32polegadas
        * se os dois derem certo compra tv 50 polegadas
        * e em ambos casos de compra a familia toma sorvete no shopping
        *
        * Caso não trabalhe em nenhum dos dias, significa que a familia ficara em casa sem tv e sorvete
        */

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean tv50Pl = !trabalho1 && !trabalho2;
        System.out.println(tv50Pl + " Você comprou tv de 50pl e sua familia tomou sorvete");


        boolean tv32pl = trabalho1 ^ !trabalho2;
        System.out.println(tv32pl + " Você só trabalhou um dia, logo você comprou uma tv de 32 pl e sua familia tomou sorvete");

        boolean semCompra = trabalho1 || trabalho2;
        System.out.println(semCompra+" Você não trabalhou esta semana, sendo assim não vai comparr tv e a familia não vai tomar sorvete");





    }
}
