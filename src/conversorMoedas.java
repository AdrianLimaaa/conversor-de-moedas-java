import java.util.Scanner;

public class conversorMoedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            mostramenu();
            int escolha = scanner.nextInt();

            if (escolha == 4) {
                System.out.println("Saindo...");
                continuar = false;}

            else if (escolha >= 1 && escolha <= 3) {
                System.out.println("Digite o valor em Reais (BRL): ");
                double valorBRL = scanner.nextDouble();

                double valorConvertido = converterMoeda(escolha, valorBRL);
                String moeda = obterNomeMoeda(escolha);

                exibirResultadoMoeda(valorConvertido, moeda);
            } else {
                System.out.println("Opção invalida. Tente novamente.");
            }

        }
        scanner.close();
    }


    public static void mostramenu() {
        System.out.println("Escolha a moeda para a conversão:");
        System.out.println("1 - Dólar (USD)");
        System.out.println("2 - Euro (EUR)");
        System.out.println("3 - Bitcoin (BTC)");
        System.out.println("4 - Sair");

    }

    public static double converterMoeda(int escolha, double valorBRL) {
        switch (escolha) {
            case 1:
                return valorBRL * 0.20; //Dolar
            case 2:
                return valorBRL * 0.18; //Euro
            case 3:
                return valorBRL * 0.0000032; //Bitcoin
            default:
                return 0;
        }
    }
    public static String obterNomeMoeda(int escolha) {
        switch (escolha) {
            case 1:
                return "USD";
            case 2:
                return "EUR";
            case 3:
                return "BTC";
            default:
                return "";
        }
    }
    public static void exibirResultadoMoeda(double valorConvertido, String moeda) {
        System.out.println(String.format("Valor convertido: %.6f %s", valorConvertido, moeda));
    }
}
