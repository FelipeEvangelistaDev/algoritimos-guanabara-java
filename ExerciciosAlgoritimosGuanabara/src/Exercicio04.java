import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("===Operações Aritimeticas==");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro para A: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite um numero inteiro para B: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        int resultadoAdicao = numero1 + numero2;
        int resultadoSubtracao = numero1-numero2;
        int resultMutiplicação = numero1*numero2;
        double resultDivisao = numero1/numero2;
        double resultModulo = numero1%numero2;
        
        System.out.println("O resultado da soma entre o numero A e o numero B é: "+ resultadoAdicao);
        System.out.println("O resultado da subtração entre o numero A e o numero B é: "+ resultadoSubtracao);
        System.out.println("O resultado da multiplicação entre o numero A e o numero B é: "+ resultMutiplicação);
        System.out.println("O resultado da divisão entre o numero A e o numero B é: "+ resultDivisao);
        System.out.println("O modulo do divisão entre o numero A e o numero B é: "+ resultModulo);



        System.out.println("======Fim do programa======");
        System.out.println("===========================");
    }
}
