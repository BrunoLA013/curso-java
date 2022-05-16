package Calculadora;

public class Temperatura {
    public static void main(String[] args) {
        double fahrenheit = 56;
        int diferenca = 32;
        double OP02 = 5;
        double OP03 = 9;

        double cels = (fahrenheit - diferenca) * (OP02/OP03);

        System.out.printf("A temperatuda de fahrenheit em celcius é de: " + "%.1f", cels);
     }
}


//formula de cal: (f° -32) x 5/9 = c°
