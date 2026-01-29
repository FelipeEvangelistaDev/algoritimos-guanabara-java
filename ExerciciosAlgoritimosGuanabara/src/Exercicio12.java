import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("===Calcular desconto promocional===");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço de um produto para calcular seu desconto: ");
        double precoOriginal = scanner.nextDouble();

        System.out.print("Agora digite a Taxa: ");
        double taxaDesconto = scanner.nextDouble();


        scanner.close();

        double precoPromocional = precoOriginal-(precoOriginal*(taxaDesconto/100));
        System.out.println("O valor com desconto será de: R$" + precoPromocional);
        System.out.println("Parabens, você economizou: R$" + (precoOriginal-precoPromocional));


        System.out.println("======Fim do programa======");
        System.out.println("===========================");

    }
}
