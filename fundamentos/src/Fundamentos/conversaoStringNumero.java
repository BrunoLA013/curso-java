package Fundamentos;

import javax.swing.*;

import java.math.BigDecimal;

import static java.lang.System.*;

public class conversaoStringNumero {

    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("" +
                "Digite o primeiro número: ");
        String valor2 = JOptionPane.showInputDialog("" +
                "Digite o segundo número: ");

        System.out.println("o Valor é: " + valor1 + valor2); // aqui esta concatenando as Strings Valor1 e 2

        double numero1 = Double.parseDouble(valor1);// Linhas 15 e 16 está convertendo de string para double
        double numero2 = Double.parseDouble(valor2);
        double soma = numero1 + numero2; //somando os valores recebidos

        System.out.println("Agora o Valor é: " + soma); // apresentando a soma da conversão de String para Double
        System.out.println("A média é: " + soma / 2);


    }
}
