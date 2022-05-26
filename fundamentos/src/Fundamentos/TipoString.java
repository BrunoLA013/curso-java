package Fundamentos;

import java.util.Locale;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá Mundo!!".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("Boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Bruno";
        var sobrenome = "Santos";
        var idade = 32;
        var salario = 3500.00;

        System.out.println("Nome " + nome + "\nSobrenome" + sobrenome + " \nIdade " + idade + "\nSalario" + salario + "\n\n");

        System.out.printf("nome: %s %s tem %d. E ganha R$ %.2f", nome, sobrenome, idade, salario);

    }
}
