package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        //offer e add -> adiciona elementos na fila
        // diferença é o comportamento quando a fila está cheia
        //quando fila está cheia
        fila.add("Ana"); // retorna false
        fila.offer("Bia"); // lança uma exeção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        //Peak e Element -> obter o proximo elemntos da fila sem remover
        // diferença é o comportamento quando a fila está cheia
        //quando fila está vazia
        System.out.println(fila.peek());// retorna false
        System.out.println(fila.element()); // lsnça ums exeção


    //         fila.contains();
    //        fila.size();
    //        fila.clear();
    //fila.isEmpty();


        //Poll e Remove -> oobter o proximo elemnto da fila sem remover
        // diferença é o comportamento quando a fila está cheia
        //quando fila está vazia
        System.out.println(fila.poll());// retorna null
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());// lança ums exeção..,


    }
}
