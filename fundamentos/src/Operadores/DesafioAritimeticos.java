package Operadores;

import java.util.Scanner;

public class DesafioAritimeticos {
    public static void main(String[] args) {

        int a = 6 * (3 + 2);
        int b = (int) Math.pow(a, 2);
        int c = b / (3*2);

        int d = ((1-5)*(2-7))/2;
        int e = (int) Math.pow(d, 2);

        int f = ((int) Math.pow(c-e, 3)) / ((int) Math.pow(10, 3));

        System.out.println(f);




    }
}
