package Controle;

import java.util.Scanner;

public class IfElseIF {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dígite a nota:");
        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("nota invalida");
        } else if (nota >= 8.1) {
            System.out.println("Conceito A");
        } else if (nota >= 6.1) {
            System.out.println("conceito B");
        } else if (nota >= 2.1) {
            System.out.println("conceito C");
        } else {
            System.out.println("conceito E");
        }
        System.out.println("Fim!!!");
        entrada.close();
    }
}
