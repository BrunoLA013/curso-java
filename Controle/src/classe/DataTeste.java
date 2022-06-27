package classe;

import java.util.Date;
import java.util.Scanner;

public class DataTeste {
    public static void main(String[] args) {

        Data data1 = new Data();
        data1.dia = 31;
        data1.mes = 5;
        data1.ano = 2022;


       Data data2 = new Data();
       data2.dia = 01;
       data2.mes = 06;
       data2.ano = 1990;
        //concatenar string **pesquisar

        System.out.println(data2.obterDataFormatada());
    }
}
