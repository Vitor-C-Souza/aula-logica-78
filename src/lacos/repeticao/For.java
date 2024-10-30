package lacos.repeticao;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Até qual tabuada fazer:");
        int tabuadaMax = read.nextInt();

        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= tabuadaMax; j++) {
                String calculo = String.format("%s x %s = %s                ", j, i, (i * j));
                System.out.print(calculo.substring(0, 20));
            }
            System.out.println("\n");
        }

    }
}
