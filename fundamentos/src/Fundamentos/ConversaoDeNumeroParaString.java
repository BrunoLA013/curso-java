package Fundamentos;

public class ConversaoDeNumeroParaString {

    public static void main(String[] args) {
        Integer num1 = 10000;
        System.out.println(num1.toString().length()); //.toString converte em String,length informa a quandidade de caracteres que estão na string

        int num2 = 100000;
        System.out.println(Integer.toString(num2)); //

        System.out.println(("" + num2).length());
    }
}
