
public class TiposPrimitivos {

    public static void main(String[] args) {
        //Informações do funcionario

        // tipos numéricos inteiro
        byte anosDeempresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 9123845223L;

        //Tipos numérifcos reias
        float salario = 11_445.44F; //F é um literal que representa o tipo float
        double vendasAcumuladas = 2_991_797_103.01;


        //tipo booleano
        boolean estaDeFerias = true; // java não aceita 0 ou 1

        //tipo caractere
        char status = 'A'; //ativo


        //dias de empresa dofuncionario

        System.out.println(anosDeempresa * 365);

        //numero de viagens
        System.out.println(numeroDeVoos / 2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);
        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " +estaDeFerias);
        System.out.println("status: " + status);
    }
}
