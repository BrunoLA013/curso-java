package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        // domingo -> 1
        // quarta -> 4
        // terça -> 3
        // Segunda -> 2
        // Sexta -> 6
        // Sabado -> 7

        String segunda = "segunda";
        String terca = "terça";
        String quarta = "Quarta;";
        String quinta = "quinta";
        String sexta = "Sexta";
        String sabado = "Sábado";
        String domingo = "domingo";

        Scanner entrada = new Scanner(System.in);
        System.out.println("que dia da semana estamos?");
        String dia = entrada.next();

        if (dia.equalsIgnoreCase("domingo")) {
            System.out.println(1);
        } else if (dia.equalsIgnoreCase(segunda)) {
            System.out.println(2);
        } else if (dia.equalsIgnoreCase(terca)) {
            System.out.println(3);
        } else if (dia.equalsIgnoreCase(quarta)) {
            System.out.println(4);
        } else if (dia.equalsIgnoreCase(quinta)) {
            System.out.println(5);
        } else if (dia.equalsIgnoreCase(sexta)) {
            System.out.println(6);
        }else if (dia.equalsIgnoreCase(sabado)) {
            System.out.println(7);
        }else {
            System.out.println("Dia invalido!!!");
        }

        entrada.close();
    }
}
