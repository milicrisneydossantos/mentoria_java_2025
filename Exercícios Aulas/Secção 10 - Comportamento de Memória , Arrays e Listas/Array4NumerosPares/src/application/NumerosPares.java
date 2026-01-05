package application;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        int cont = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES:");
        for (int v : vetor) {
            if (v % 2 == 0) {
                System.out.print(v + " ");
                cont++;
            }
        }

        System.out.println("\nQUANTIDADE DE PARES = " + cont);

        sc.close();
    }
}
