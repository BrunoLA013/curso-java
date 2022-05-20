public class Wrappers {
    public static void main(String[] args) {

        //byte
        Byte b = 100;
        Short s = 1000;


        //Integer i = Integer.parseInt(entrada.next());
        Integer i = 10000; // int
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123.10F;
        System.out.println(f);

        double d = 1324.56789;
        System.out.println(d);


        Boolean bo = Boolean.parseBoolean("true"); //que em cima do valor String ele faz um parseBoolean para retornar um valor booleano
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#'; // qual a diferenca entre Character e String?
        System.out.println(c + "...");


        /*
        * por que varchar?
        * Char?
        * String?
        * Caracter?
        */
    }
}
