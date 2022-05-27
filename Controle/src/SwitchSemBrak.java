public class SwitchSemBrak {
    public static void main(String[] args) {
        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("seio Bassai-dai...");
            case "marrom":
                System.out.println("sei o Tekki shodan");
            case "roxo":
                System.out.println("sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
            default:
 //               System.out.println("Não sei de nada...");
        }
    }
}
