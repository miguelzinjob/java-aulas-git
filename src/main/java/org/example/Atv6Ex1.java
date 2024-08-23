package org.example;

import java.util.Scanner;

public class Atv6Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int soma = 0;

        // Leitura dos valores da matriz e cálculo da soma
        System.out.println("Informe os valores da matriz:");
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                matriz[l][c] = scanner.nextInt();
                soma += matriz[l][c];
            }
        }

        // Exibindo a matriz
        System.out.println("\nMatriz:");
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                System.out.printf("[%d] ", matriz[l][c]);
            }
            System.out.println();
        }

        // Exibindo a soma dos elementos
        System.out.printf("\nA soma dos elementos é %d\n", soma);

        scanner.close();
    }
}
