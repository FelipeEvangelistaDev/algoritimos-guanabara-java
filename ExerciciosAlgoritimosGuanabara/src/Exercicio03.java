import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("========================");
        System.out.println("===Salário de um funcionário==");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o seu nome? " );
        String userName = scanner.nextLine();

        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble();

        scanner.close();
        
        System.out.println("O funcionario " + userName + ", tem um salário de: " + salario);

        System.out.println("======Fim do programa======");
        System.out.println("===========================");

    }

}
