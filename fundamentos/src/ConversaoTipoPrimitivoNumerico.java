public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {
        double a = 1; //conversão implcita
        System.out.println(a);

        float b = (float) 1.12345; //conversão explicita "declara o tipo de conversão que voce quer ou no final coloca "F" que representa a conversão explicita"
        System.out.println(b);

        int c = 4;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.99999;
        int f = (int) e; //explicita (cast)
        System.out.println(f);
    }
}
