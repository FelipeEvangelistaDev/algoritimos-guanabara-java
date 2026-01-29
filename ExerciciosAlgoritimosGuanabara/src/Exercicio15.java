import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("===Calculo salário==="); 

        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Digite o numero de dias trabalhados: ");
        int diasTrabalhados = scanner.nextInt();


        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = scanner.nextInt();

        scanner.close();

        int horasTrabalhada = 8;
        
        double salarioBruto = diasTrabalhados*(valorHora*horasTrabalhada);

        System.out.println("Você receberá de salário: R$" + salarioBruto);

        System.out.println("======Fim do programa======");
        System.out.println("===========================");

    }
}
