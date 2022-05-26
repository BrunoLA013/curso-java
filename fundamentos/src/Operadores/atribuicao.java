package Operadores;

public class atribuicao {
    public static void main(String[] args) {
        int a =61;
        int b = a;
        int c = a + b;

        c+=b;//c = c +b;
        System.out.println(c);

        c-=b;//c = c -b;
        System.out.println(c);

        c*=b;//c = c * b;
        System.out.println(c);

        c/=a;//c = c / a;
        System.out.println(c);


        c%=2; //c=c%2;
        if (c == 0){
            System.out.println(c + " o numero é par");
        }else {
        System.out.println(c + " o valor e Impar");
        }
    }
}
