package collections2;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        pilha.push("Prato Verde");
        pilha.push("Prato Azul");
        pilha.push("Prato Branco");
        pilha.push("Prato Amarelo");
        pilha.push("Prato Vermelho");
        pilha.push("Prato Roxo");

        System.out.println("\nElementos da pilha: " + pilha);

        System.out.println("\nRetirar elemento: " + pilha.pop());

        System.out.println("\nElementos da pilha: " + pilha);

        pilha.push("Prato Laranja");

        System.out.println("\nElementos da pilha: " + pilha);
    }
}
