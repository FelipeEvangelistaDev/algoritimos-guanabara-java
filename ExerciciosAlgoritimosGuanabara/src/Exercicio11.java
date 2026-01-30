import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("===Equação do primeiro grau==="); 

        System.out.println("Uma equação do 2º grau, tem a forma geral ax²+bx+c=0, para fazer o calculo,  primeiro devemos encontrar o discriminante (delta), e após isso calculamos o valor de x.");
        System.out.println("Onde (a,b,c) são números reais e (a diferente de 0). A incógnita (x) possui expoente máximo 2, e a solução é obtida usando a Fórmula de Bhaskara");
        System.out.println("O valor de delta é dado pela seguinte expressão: delta = b²-4ac,   em que a, b e c são coeficientes da equação e delta é o discriminante.");
        System.out.println("A formula de baskara é x = (-b ± raiz de delta)/2a");
        System.out.println("Lembrando que, Se (delta>0), a equação possui duas raízes reais e distintas (diferentes). Se (delta=0), a equação possui uma única raiz real (ou duas raízes reais e iguais). Se (delta<0), a equação não possui raízes reais. Nesse caso, as raízes pertencem ao conjunto dos números complexos. ");

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero para o  coeficiente quadrático (A): ");
        double coeficienteA = scanner.nextDouble();

        System.out.print("Digite um numero para o  coeficiente linear (B): ");
        double coeficienteB = scanner.nextDouble();


        System.out.print("Digite um numero para a constante (C): ");
        double coeficienteC = scanner.nextDouble();

        scanner.close();
        
        if (coeficienteA!=0){
            double delta = Math.pow(coeficienteB, 2)-(4*coeficienteA*coeficienteC);
            System.out.println("O valor de delta é: "+ delta);
            
            if (delta<0){
                System.out.println("Delta menor que zero. Não há raízes reais.");
            } else {
                double xUm = (-coeficienteB-(Math.sqrt(delta)))/(2*coeficienteA);
                double xDois = (-coeficienteB+(Math.sqrt(delta)))/(2*coeficienteA);
                System.out.println("O valor de x': " + xUm);
                System.out.println("O valor de x'': " + xDois);
            }          
        } else {
            System.out.println("Erro: O coeficiente 'a' não pode ser zero (a ≠ 0) para uma equação do 2º grau.");
        };
      

        System.out.println("x''======Fim do programa======");
        System.out.println("===========================");

    }
}
