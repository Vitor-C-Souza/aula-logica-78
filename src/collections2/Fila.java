package collections2;

import java.util.Collections;
import java.util.LinkedList;

public class Fila {
    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<>();

        Collections.addAll(fila, "Gabriel", "Priscila", "Matheus");

        System.out.println(fila);

        System.out.println("\nAdicionar novo Elemento: " + fila.add("Vítor"));
        System.out.println(fila);

        System.out.println("\nExibir o primeiro da fila: " + fila.peek());
        System.out.println(fila);

        System.out.println("\nRemover Elemento: " + fila.remove());
        System.out.println(fila);
    }
}
