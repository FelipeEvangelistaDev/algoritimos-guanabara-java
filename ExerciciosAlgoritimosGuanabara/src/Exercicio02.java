import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("========================");
        System.out.println("===Boas vindas ao java==");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeIndividuo = scanner.nextLine();
        
        scanner.close();

        System.out.println("Olá, " + nomeIndividuo + ", seja bem vindo as aulas de algoritmo.");


        System.out.println("Fim do programa");
        System.out.println("===========================");



    }
}
