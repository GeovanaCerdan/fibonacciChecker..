import java.util.ArrayList;
import java.util.List;

public class FibonacciCheck {
    public static void main(String[] args) {
        int numberToCheck = 100;

        // Lista para armazenar a sequência de Fibonacci
        List<Integer> fibonacciSequence = new ArrayList<>();

        // Gerando a sequência de Fibonacci
        fibonacciSequence.add(0);
        fibonacciSequence.add(1);

        while (true) {
            int nextNumber = fibonacciSequence.get(fibonacciSequence.size() - 1) + fibonacciSequence.get(fibonacciSequence.size() - 2);
            if (nextNumber > numberToCheck) {
                break;
            }
            fibonacciSequence.add(nextNumber);
        }

        // Verificando se o número pertence à sequência
        if (fibonacciSequence.contains(numberToCheck)) {
            System.out.println(numberToCheck + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numberToCheck + " não pertence à sequência de Fibonacci.");
        }

        // Exibindo a sequência de Fibonacci gerada
        System.out.println("Sequência de Fibonacci gerada: " + fibonacciSequence);
    }
}
