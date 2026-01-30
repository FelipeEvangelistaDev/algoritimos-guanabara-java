import java.util.Scanner;

public class Exercicio16Desafio {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("===Expectativa de Vida de Fumante==="); 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de cigarros por dia: ");
        int cigarrosDia = scanner.nextInt();

        System.out.print("Ha qantos anos você fuma: ");
        int anosFumante = scanner.nextInt();

        scanner.close();

        double anosEmDia = anosFumante*365.0;
        double reducaoVida = 10.0/1440.0;

        double totalVida = anosEmDia*cigarrosDia*reducaoVida;
      
        System.out.println("Sua expectativa de vida é: " + totalVida);

        System.out.println("======Fim do programa======");
        System.out.println("==========================="); 

    }
}
