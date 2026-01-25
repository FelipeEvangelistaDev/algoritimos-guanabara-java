import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("===Calculadora de compra de dolar==");

        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite quantos reais você tem na carteira - R$: ");
            double reaisCarteira = scanner.nextDouble();

            System.out.print("Digite quanto está a cotação do dolar - U$: ");
            double cotacaoDolar = scanner.nextDouble();

        scanner.close(); 
        
        
        double quantidadeDolar = reaisCarteira/cotacaoDolar;

        
        System.out.println("Voce pode comprar U$ " + quantidadeDolar + " dolares.");
        
        
        System.out.println("======Fim do programa======");
        System.out.println("==========================="); 
    }
}
