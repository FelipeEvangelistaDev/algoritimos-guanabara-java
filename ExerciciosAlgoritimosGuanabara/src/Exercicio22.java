import java.util.Scanner;
import java.time.Year;

public class Exercicio22 {
    public static void main(String[] args) {
        System.out.println("======Alistamento Militar======");
        System.out.println("==========================="); 
        
        Scanner scanner = new Scanner(System.in);

        String anoNascimento; // Define a string que receberá os dados digitados
        boolean anoValido = false; // inicia a variavel do tipo booleana

        do {
            System.out.print("Digite o ano de seu nascimento: \nTodos os 4 digitos: ");
            anoNascimento = scanner.nextLine(); // Atribui a variavel o que o usuario digitar
            
            if (anoNascimento.length()!=4) { //Seta que se o que foi digitado for diferente de 4 digitos dá o erro abaixo
                System.out.println("ERRO: O número de caracteres deve ser exatamente 4. Tente novamente.");
                continue; 
            }
            try { // Converte a classe Wrapper em inteiro se bem sucedido
                Integer.parseInt(anoNascimento);
                anoValido = true; // Define como true para sair do loop
                
            } catch (NumberFormatException e) { // Se a conversão falhar dá a mensagem abaixo, anoValido continua false o loop continua
                System.out.println("ERRO: A entrada deve conter apenas dígitos numéricos. Tente novamente.");
            }   

        } while(!anoValido); //O Loop continua enquanto o anoValido não for verdadeiro
            System.out.println("Entrada válida! Você digitou: " + anoNascimento); 
           
        scanner.close();

        int anoAtual = Year.now().getValue(); //Traz o valor do ano vigente como inteiro
        int anoNascimentoINT = Integer.parseInt(anoNascimento); // Converte a variavel encapsulada de Interger para tipo primitivo int

        int idadeServir = anoAtual-anoNascimentoINT; //
        int passaramAnos = idadeServir-18;
        int faltamAnos = 18-idadeServir;

        if (idadeServir>=18) {
            System.out.println("Você deve procurar um posto de alistamento.");
            System.out.println("Passaram-se "+passaramAnos+ " anos da idade de servir.");
        } else {
            System.out.println("Você ainda não tem idade para se alistar.");
            System.out.println("Faltam "+faltamAnos+ "anos da idade de servir.");
         
        }

        

        System.out.println("======Fim do programa======");
        System.out.println("==========================="); 
    }
}
