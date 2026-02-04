import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        System.out.println("==========================="); 
        System.out.println("======Par ou impar======");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro, para saber se é um numero par ou impar. \nNumero: ");
        int numero = scanner.nextInt();
        
        scanner.close();

        if (numero%2==0) {
            System.out.println("O número "+numero+ " que você digitou é PAR.");
        } else {
            System.out.println("O número "+numero+ " que você digitou é IMPAR.");
        }

        System.out.println("======Fim do programa======");
        System.out.println("==========================="); 
       
    }
}
