import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("===Descubra o antecessor e o sucessor==");

        Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um numero: ");
                int numero = scanner.nextInt();
          
        scanner.close();

        int antecessor = --numero;
        int sucessor = ++numero;

        System.out.println("O antecessor do numero digitado é: "+antecessor);
        System.out.println("O sucessor do numero digitado é: "+sucessor);




        System.out.println("======Fim do programa======");
        System.out.println("===========================");
        

    }
}
