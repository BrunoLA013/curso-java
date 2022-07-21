package oo.composicao;

public class CompraTeste {

    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente =  "Joâo";
        c1.adicionarItem("Caneta", 20, 7.45);
        c1.adicionrItem(new Item("Borracha", 12, 13.89));
        c1.adicionrItem(new Item("Caderno", 3, 18.79));

        System.out.println(c1.itens.size());
        System.out.println(c1.getValorTotal());

        double total = c1.itens.get(0).compra.itens.get(1).compra.getValorTotal();
        System.out.println("O total é R$ " + total);

    }
}
