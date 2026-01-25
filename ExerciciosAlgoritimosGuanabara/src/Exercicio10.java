import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("===Calculo de Tinta==="); 

            Scanner scanner = new Scanner(System.in);
                System.out.print("Digite a largura da parede: ");
                double larguraParede = scanner.nextDouble();
            
                System.out.print("Digite a altura da parede: ");
                double alturaParede = scanner.nextDouble();     
            
                System.out.print("Digite o rendimento da tinta descrito na lata, em metros: ");
                int rendimento = scanner.nextInt();

                System.out.print("Digite a quantidade de demãos: ");
                int numeroDemaos = scanner.nextInt();
           
           
            scanner.close();

        double metroQuadradoParede = alturaParede*larguraParede;
        double calculoDeTinta = (metroQuadradoParede*numeroDemaos)/rendimento;

        System.out.println("Sua area total em metros quadrados é: " + metroQuadradoParede);
        System.out.println("Você vai precisar de: " + calculoDeTinta + " litros de tinta");
        
        System.out.println("======Fim do programa======");
        System.out.println("==========================="); 

    }

}
