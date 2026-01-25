import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("===Conversor de distancia==");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma distancia em metros: ");
            double distanciaMetros = scanner.nextDouble();
        scanner.close();
        
        double distanciaKm = distanciaMetros/1000;
        double distanciaHm = distanciaMetros/100;
        double distanciaDam = distanciaMetros/10;
        double distanciaDm = distanciaMetros*10;
        double distanciaCm = distanciaMetros*100;
        double distanciaMm = distanciaMetros*1000;

        System.out.println("A distancia em Kilometros é: " + distanciaKm);
        System.out.println("A distancia em hectometros é: " + distanciaHm);
        System.out.println("A distancia em decametros é: " + distanciaDam);
        System.out.println("A distancia em decimetros é: " + distanciaDm);
        System.out.println("A distancia em centimetros é: " + distanciaCm);
        System.out.println("A distancia em milimetros é: " + distanciaMm);

        System.out.println("======Fim do programa======");
        System.out.println("===========================");
    }
}
