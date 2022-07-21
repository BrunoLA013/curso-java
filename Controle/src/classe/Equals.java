package classe;

import java.util.Date;

public class Equals {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Bruno Lucas";
        u1.email = "bruno.pasetto@agi.com.br";


        Usuario u2 = new Usuario();
        u2.nome = "Bruno Lucas";
        u2.email = "bruno.pasetto@agi.com.br";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));


        System.out.println(u1.equals(new Date()));
    }
}
