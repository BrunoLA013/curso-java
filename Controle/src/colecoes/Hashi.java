package colecoes;

import java.util.HashSet;

public class Hashi {

    public static void main(String[] args) {

        HashSet<Usuarios> usuarios = new HashSet<>();

        usuarios.add(new Usuarios("Pedro"));
        usuarios.add(new Usuarios("Ana"));
        usuarios.add(new Usuarios("Guilherme"));

        boolean resultado = usuarios.contains(new Usuarios("Guilherme"));
        System.out.println(resultado);
    }
}
