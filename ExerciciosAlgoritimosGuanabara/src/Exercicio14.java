import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("===Calculo de preço de aluguel de carro==="); 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para calcular o preço do seu aluguel.");

        System.out.print("Digite a quantidade de Km percorridos: ");
        double kmPercorrido = scanner.nextDouble();

        System.out.print("Digite a quantidade de dias que permaneceu com o carro: ");
        double diasAlugados = scanner.nextDouble();


        scanner.close();

        double custoDia = 90;
        double custoKm = 0.20; 

        double precoAluguel = (kmPercorrido*custoKm)+(diasAlugados*custoDia);

        System.out.println("O aluguel do carro custou: R$"+precoAluguel);



        System.out.println("======Fim do programa======");
        System.out.println("===========================");

    }
}
