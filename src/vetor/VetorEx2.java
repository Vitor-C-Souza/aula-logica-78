package vetor;

import java.util.Arrays;
import java.util.Scanner;

public class VetorEx2 {
    public static void main(String[] args) {
        var read = new Scanner(System.in);
        int[] vetorInteiros = new int[5];

        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero: ");
            vetorInteiros[i] = read.nextInt();
        }
        System.out.println("\n");
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.println((i + 1) + "º elemento: " + vetorInteiros[i]);
        }
        System.out.println("\n");
        System.out.println("tamanho do vetor: " + vetorInteiros.length);

        Arrays.sort(vetorInteiros);

        System.out.println("\n");
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.println((i + 1) + "º elemento: " + vetorInteiros[i]);
        }
    }
}
