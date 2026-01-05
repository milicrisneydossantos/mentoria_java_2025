package application;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        int soma = 0;
        int cont = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();

            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                cont++;
            }
        }

        if (cont == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double media = (double) soma / cont;
            System.out.printf("MEDIA DOS PARES = %.1f\n", media);
        }

        sc.close();
    }
}
