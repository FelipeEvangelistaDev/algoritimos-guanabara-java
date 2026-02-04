import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("===Media Aluno===="); 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira Nota: ");
        double nota1 = scanner.nextDouble();        

        System.out.print("Digite a primeira Nota: ");
        double nota2 = scanner.nextDouble();

        scanner.close();
        
        double media = (nota1+nota2)/2;

        if (media>=7) {
            System.out.println("Parabéns " + nome + ", você foi aprovado, \npois obteve media: " + media);
        } else {
            System.out.println("Você foi reprovaado, precisa fazerdependencia.");
        }

        System.out.println("======Fim do programa======");
        System.out.println("==========================="); 
    }
}
