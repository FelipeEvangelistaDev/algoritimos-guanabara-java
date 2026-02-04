import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        System.out.println("======Ano Bissexto======");
        System.out.println("==========================="); 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano para calcular se é bissesto ou não: ");
        int ano = scanner.nextInt();

        scanner.close();

        if ((ano%4==0 && ano%100 !=0) || (ano%400==0) ) {
            System.out.println("O ano de "+ano+", que você digitou é bissexto.");
        } else {
            System.out.println("O ano de "+ano+", que você digitou NÃO é bissexto.");
        }

        System.out.println("======Fim do programa======");
        System.out.println("==========================="); 

    }


}
