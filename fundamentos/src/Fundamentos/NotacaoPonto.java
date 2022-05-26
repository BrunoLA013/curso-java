package Fundamentos;

import java.util.Locale;

public class NotacaoPonto {
    public static void main(String[] args) {


        double a = 2.3;
        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!!!");

        System.out.println(s);
        System.out.println("Bruno".toUpperCase(Locale.ROOT));

        String y = "Bom dia X"
                .replace("X", "Gui").toUpperCase().concat("!!!!!!");
        System.out.println(y);


        //Tipos primitivos não tem o operador "."
        
    }
}
