package org.example;

import java.util.Scanner;

public class Atv6Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] m = new double[4][4];
        double sl = 0.0, sc = 0.0, sub;

        // Leitura dos valores da matriz
        System.out.println("Informe os valores da matriz:");
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                m[l][c] = scanner.nextDouble();

                // Somando os elementos da primeira linha
                if (l == 0) {
                    sl += m[l][c];
                }

                // Somando os elementos da terceira coluna
                if (c == 2) {
                    sc += m[l][c];
                }
            }
        }

        // Calculando a subtração
        sub = sl - sc;

        // Exibindo a matriz
        System.out.println("\nMatriz:");
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                System.out.printf("[%.2f]", m[l][c]);
            }
            System.out.println();
        }

        // Exibindo os resultados
        System.out.printf("\nSoma da 1ª linha: %.2f\n", sl);
        System.out.printf("Soma da 3ª coluna: %.2f\n", sc);
        System.out.printf("Subtração da 1ª linha pela 3ª coluna: %.2f\n", sub);

        scanner.close();
    }
}
