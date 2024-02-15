import java.util.Scanner;
import java.util.Stack;

public class Etapa3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma expressão matemática: ");
        String expressao = scanner.nextLine();

        System.out.println("Expressão: " + expressao);
        System.out.println("Parênteses balanceados? " + checkBrackets(stringToStack(expressao)));
    }

    public static Stack<Character> stringToStack(String str) {
        int size = str.length();
        Stack<Character> stack = new Stack<>();

        for (int i = size - 1; i >= 0; i--) {
            stack.push(str.charAt(i));
        }

        return stack;
    }

    public static boolean checkBrackets(Stack<Character> s1) {
        int openCount = 0;

        while (!s1.isEmpty()) {
            char caractere = s1.pop();

            if (caractere == '(') {
                openCount++;
            } else if (caractere == ')') {
                // Verifica se há um parêntese de abertura correspondente
                if (openCount <= 0) {
                    return false;  // Violou a regra (2)
                }
                openCount--;
            }
            // Outros caracteres são ignorados
        }

        // Verifica se o número de parênteses à esquerda e à direita é igual
        return openCount == 0;
    }
}
