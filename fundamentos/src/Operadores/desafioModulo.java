package Operadores;

import java.util.Scanner;

public class desafioModulo {
    public static void main(String[] args) {

        //ler num1
        //ler nem 2
        // + - * / %

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double num1 = entrada.nextDouble();
        System.out.println("Digite o operador: ");
        String oper = entrada.next();
        System.out.println("Digite o segundo numero: ");
        double num2 = entrada.nextDouble();

        //logica
        double resultado = "+".equals(oper) ? num1 + num2 : 0;
        resultado = "-".equals(oper) ? num1 - num2 : resultado;
        resultado = "*".equals(oper) ? num1 * num2 : resultado;
        resultado = "/".equals(oper) ? num1 / num2 : resultado;
        resultado = "%".equals(oper) ? num1 % num2 : resultado;

       System.out.printf("%.2f %s %.2f = %.2f", num1 , oper, num2, resultado);


        entrada.close();


    }
}
