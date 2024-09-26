import java.util.Scanner;

public class VerificaLetraA {
    public static void main(String[] args) {
        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita que o usuário digite uma string
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        
        // Converte a string para minúsculas para verificar ambas as letras 'a' e 'A'
        String lowerCaseInput = input.toLowerCase();
        
        // Conta a quantidade de 'a'
        int count = 0;
        for (char c : lowerCaseInput.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }

        // Verifica se a letra 'a' existe e exibe a quantidade
        if (count > 0) {
            System.out.println("A letra 'a' (ou 'A') ocorre " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
