package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuarios> lista = new ArrayList<>();

        Usuarios u1 = new Usuarios("Ana");
        lista.add(u1);
        lista.add(new Usuarios("Carlos"));
        lista.add(new Usuarios("Lia"));
        lista.add(new Usuarios("Bia"));
        lista.add(new Usuarios("Manu"));

        System.out.println(lista.get(3)); // acessa pelo índice

        System.out.println(">>>> " + lista.remove(1).nome);
        System.out.println(lista.remove(new Usuarios("Manu")));

        System.out.println("Tem? " + lista.contains(new Usuarios("Lia")));
        for (Usuarios u : lista) {
            System.out.println(u.nome);
        }
    }
}
