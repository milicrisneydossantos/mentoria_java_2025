package application;

import entities.Pessoa;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];
        double somaAlturas = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);
            somaAlturas += altura;
        }

        double media = somaAlturas / n;
        System.out.printf("Altura média: %.2f\n", media);

        int contMenores = 0;
        for (Pessoa p : pessoas) {
            if (p.getIdade() < 16) {
                contMenores++;
            }
        }

        double porcentagem = contMenores * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);

        for (Pessoa p : pessoas) {
            if (p.getIdade() < 16) {
                System.out.println(p.getNome());
            }
        }

        sc.close();
    }
}

