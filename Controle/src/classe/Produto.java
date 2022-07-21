package classe;

public class Produto {


    // Atributos
    String nome;
    double  preco;
    static double  desconto = 0.25;

    Produto(){

    }

    Produto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto() {
        return preco * ( 1 - desconto);
    }
    //Criei uma classe, apartir dessa classe o momento que chamar o construtor, instanciar novos objetos, os objetos criados terão estes mesmo objetos

    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}