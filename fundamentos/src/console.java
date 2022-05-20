import java.util.Scanner;

public class console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia\n");
        System.out.println("Bom");
        System.out.println("Dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d \n", 1,2,3,5,4,6);
        System.out.printf("Sálario: %.2f \n", 1234.54679);

        Scanner entrada = new Scanner(System.in);
        int anoAtual = 2022;
        System.out.print("Digite o ano de nascimento: ");
        int nome = entrada.nextInt();
        int calcIdade = anoAtual - nome;
        System.out.println("Voce tem : " + calcIdade + " Anos");
        entrada.close();


/*
nextLine / int
* */


    }
}
