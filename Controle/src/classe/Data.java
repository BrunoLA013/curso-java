package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    public Data() {
        //dia = 1;
        //mes = 1;
        //ano = 1970;
    this(1, 1, 1970);
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() { //Como quero apresentar o formato dia/mes/ano o tipo de retorno é String
        final String formato = "%d/%d/%d";
        return String.format(formato, this.dia, this.mes, this.ano); //Usando a função .format posso passar o argumento como passaria em um SOUF
    }

    void imprimirDataFormatada(){
        System.out.println(this.obterDataFormatada());
    }
}
