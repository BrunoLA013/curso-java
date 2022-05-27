import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        /*
         * calcula a media de uma turma
         * usuario digita uma nota de 10 a 0
         *
         * armazenar a nota em total, e acrescentar em total a soma de todas as notas
         *
         * para sair digitar -1
         *
         *
         * */

        Scanner entrada = new Scanner(System.in);

        int quaditadeDeNotas= 0;
        double nota = 0;
        double total = 0;


        while (nota !=-1){
            System.out.print("Informe a nota (ou -1 para sair): ");
            nota = entrada.nextDouble();
            if (nota <= 10 && nota >=0) {
                total += nota;
                quaditadeDeNotas++;
            }else if (nota != -1){
                System.out.println("Nota invalida!!!");
            }
        }

        //Calcular a média

        double media = total / quaditadeDeNotas;
        System.out.println("A média dos alunos é: " + media);

        entrada.close();

    }

}
