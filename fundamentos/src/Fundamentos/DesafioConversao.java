package Fundamentos;

import javax.swing.*;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        /*desafio do curso, criar um programa que pegue os ultimos 3 salarios do funcionairo e divada por 3 para ter a média recebina nos ultimos 3 meses
        String salario1 =  JOptionPane.showInputDialog("" + "Coloque aqui seu primeiro salário: ");
        String salario2 =  JOptionPane.showInputDialog("" + "Coloque aqui seu segundo salário: ");
        String salario3 =  JOptionPane.showInputDialog("" + "Coloque aqui seu terceito salário: ");*/


        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu primeiro salario: ");
        double primeiroSalario = entrada.nextDouble();
        System.out.println("Digite seu segundo salario: ");
        double segundoSalario = entrada.nextDouble();
        System.out.println("Digite seu terceiro salario: ");
        double terceiroSalario = entrada.nextDouble();
        double soma = primeiroSalario + segundoSalario + terceiroSalario;
        System.out.println("A soma dos seu salários é: " + soma);
        System.out.println("A media recebida é: " + soma / 3);
        entrada.close();


        //Resolução do problema conforme aula

  /*      Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro salário: ");
        String valor1 = entrada.next().replace(",", ".");
        System.out.println("Informe o segundo salário: ");
        String valor2 = entrada.next().replace(",", ".");
        System.out.println("Informe o terceiro salário: ");
        String valor3 = entrada.next().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);
        double media = (salario1 + salario2 + salario3) / 3;

        System.out.println("A média do seu salario é: " + media);

        entrada.close();
*/
/*
* Informe o primeiro salário:
12567,90
Informe o segundo salário:
8123,56
Informe o terceiro salário:
7598,54
A média do seu salario é: 9430.0
* */


    }
}
