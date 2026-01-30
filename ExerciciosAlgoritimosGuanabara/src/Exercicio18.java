import java.util.Scanner;
import java.time.Year;

public class Exercicio18 {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("===Menor de idade não vota===="); 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento para verificar se você pode votar. \nAno nascimento: " );
            int idadeFulano = scanner.nextInt();

        scanner.close();

        int anoAtual = Year.now().getValue(); 

        int idadeVoto = anoAtual-idadeFulano;



        if (idadeVoto<16) {
            System.out.println("Você ainda não tem idade para votar");
        } else {
            System.out.println("Parabéns você já tem " +idadeVoto+ "anos. \nVocê já pode votar.");
        }




        System.out.println("======Fim do programa======");
        System.out.println("==========================="); 
    }
}
