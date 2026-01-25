import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("===Calcule o dobro e a Terça parte===");

        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um numero: ");
                double numero = scanner.nextDouble();
        scanner.close();

        double dobro = numero*2;
        double tercaParte = numero/3;

        System.out.println("O dobro do número digitado é: " + dobro);
        System.out.println("A terça parte do número digitado é: " + tercaParte);

        System.out.println("======Fim do programa======");
        System.out.println("===========================");


    }

}
