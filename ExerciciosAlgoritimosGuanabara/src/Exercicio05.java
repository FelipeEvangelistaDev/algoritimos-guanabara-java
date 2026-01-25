import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("===Media do ano létivo==");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota do 1º Bimestre: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite sua nota do 2º Bimestre: ");
        double nota2 = scanner.nextDouble();

        
        System.out.print("Digite sua nota do 3º Bimestre: ");
        double nota3 = scanner.nextDouble();

        
        System.out.print("Digite sua nota do 4º Bimestre: ");
        double nota4 = scanner.nextDouble();

        scanner.close();

        double media = (((nota1+nota2)*1)+((nota3+nota4)*2))/2;

        System.out.println("O calculo  dá média de nossa escola é feito assim (N1+N2)*1 pois tem peso 1,(N3+N4)*2 pois tem peso 2. Somam-se o resultado das notas do 1º e 2º semestre e divide por 2.");
        System.out.println("Logo sua média final é: " + media);

        System.out.println("======Fim do programa======");
        System.out.println("===========================");



    }
}
