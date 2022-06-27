package Controle;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String texto = "";
        do {
            System.out.println("você precisa falar " + "\nas palavras mágicas...");
            System.out.print("Quer sair? ");
            texto = entrada.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado");
        entrada.close();
    }
}
