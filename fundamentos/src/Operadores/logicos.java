package Operadores;

public class logicos {

    public static void main(String[] args) {
            boolean condicao1 = true;
            boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2); // tabela and = && = e
        System.out.println(condicao1 || condicao2); // tabela or = || = ou
        System.out.println(condicao1 ^ condicao2); // tabela verdade do OU EXCLISIVO
        System.out.println(!condicao1); // ! negação, se é verdadeiro nego e digo que é falso
        System.out.println(!condicao2);// ! negação, se é falso nego e digo que é verdaderio

        //tabela verdade do E
        System.out.println("Tabela verdade E");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        //tabela verdade do ou
        System.out.println("Tabela verdade ou");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);


        //tabela verdade do Ou exclusivo
        System.out.println("Tabela verdade ou Exclusivo");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        //tabela verdade do NOt
        System.out.println("Tabela verdade NOT");
        System.out.println(!true);
        System.out.println(!!false);
    }
}
