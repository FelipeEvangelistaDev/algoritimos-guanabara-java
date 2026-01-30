import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("======Calcular Multa ========="); 

        Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a velocidade do carro: ");
                double velocidadeCarro = scanner.nextDouble();

        scanner.close();

        double velocidadePermitida = 80.0;
        double precoMulta = 5.0;

        if (velocidadeCarro<=80.0) {
            System.out.println("Siga sua viagem. \n Tenha um bom dia.");
        } else {
            double multa = (velocidadeCarro-velocidadePermitida)*precoMulta;
            System.out.println("Devido sua velocidade ser: "+velocidadeCarro+ "km/h, \n você foi multado em: R$ " + multa+" reais");
        }

        System.out.println("======Fim do programa======");
        System.out.println("==========================="); 
    }
}
