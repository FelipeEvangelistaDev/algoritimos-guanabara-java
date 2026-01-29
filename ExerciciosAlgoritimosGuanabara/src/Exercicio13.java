import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("===Cauculo de Aumento de salário==="); 
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salario: R$");
        double salarioInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de aumento: ");
        double taxaAumento = scanner.nextDouble();

        scanner.close();

        double aumentoSalario = salarioInicial+(salarioInicial*(taxaAumento/100));

        System.out.println("Seu novo salário será: R$" + aumentoSalario);
        System.out.println("Seu aumento de "+taxaAumento+"% rendeu R$" +(aumentoSalario-salarioInicial)+ " reais de aumento");


        System.out.println("======Fim do programa======");
        System.out.println("===========================");

    }
}
