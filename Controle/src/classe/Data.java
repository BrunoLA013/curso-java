package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    String obterDataFormatada() { //Como quero apresentar o formato dia/mes/ano o tipo de retorno é String
        return String.format("%d/%d/%d", dia, mes, ano); //Usando a função .format posso passar o argumento como passaria em um SOUF
    }
}
