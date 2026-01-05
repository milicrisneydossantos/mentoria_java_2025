package application;

import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int maiorIdade = idades[0];
        int posicao = 0;

        for (int i = 1; i < n; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                posicao = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomes[posicao]);

        sc.close();
    }
}

