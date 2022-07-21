package classe.desafioComida;

public class jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 0.180);
        Comida c2 = new Comida("Feijão", 0.300);

        Pessoa p = new Pessoa("Bruno", 99.8);

        System.out.println(p.Apresentar());
        p.Comer(c1);
        System.out.println(p.Apresentar());
        p.Comer(c2);
        System.out.println(p.Apresentar());
    }
}
