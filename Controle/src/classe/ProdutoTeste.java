package classe;

import java.util.Scanner;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("notebook", 4356.86); // criando nova instancia do Produto
        var p2 = new Produto();
        p2.nome = "caneta preta";
        p2.preco = 12.56;

        Produto.desconto = 0.50;

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precofinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precofinal2) / 2;

        System.out.printf("Média do carrinho = R$%,2f.", mediaCarrinho);

    }
}
