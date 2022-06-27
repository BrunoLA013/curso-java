package classe;

import java.util.Scanner;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("notebook"); // criando nova instancia do Produto
        //p1.nome = "notebook";
        p1.preco = 4356.98;
        Produto.desconto = 0.25;


        var p2 = new Produto("caneta");
       // p2.nome = "caneta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        double precoFinal1 = p1.precoComDesconto();

        System.out.println(p2.nome);
        System.out.printf("O preço final do produto é R$%.2f", precoFinal1);


    }
}
