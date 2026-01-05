package application;

import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double menor, maior;
        double somaMulheres = 0.0;
        int contMulheres = 0;
        int contHomens = 0;

        System.out.print("Altura da 1a pessoa: ");
        double altura = sc.nextDouble();
        System.out.print("Genero da 1a pessoa: ");
        char genero = sc.next().charAt(0);

        menor = maior = altura;

        if (genero == 'F') {
            somaMulheres += altura;
            contMulheres++;
        } else {
            contHomens++;
        }

        for (int i = 2; i <= n; i++) {
            System.out.print("Altura da " + i + "a pessoa: ");
            altura = sc.nextDouble();
            System.out.print("Genero da " + i + "a pessoa: ");
            genero = sc.next().charAt(0);

            if (altura < menor) menor = altura;
            if (altura > maior) maior = altura;

            if (genero == 'F') {
                somaMulheres += altura;
                contMulheres++;
            } else {
                contHomens++;
            }
        }

        System.out.println("Menor altura = " + menor);
        System.out.println("Maior altura = " + maior);

        if (contMulheres > 0) {
            double mediaMulheres = somaMulheres / contMulheres;
            System.out.printf("Media das alturas das mulheres = %.2f\n", mediaMulheres);
        }

        System.out.println("Numero de homens = " + contHomens);

        sc.close();
    }
}
