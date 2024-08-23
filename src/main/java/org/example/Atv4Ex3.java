package org.example;

import java.util.Scanner;

public class Atv4Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valor = new double[5];
        double valorEstoque = 0.0;

        // Leitura dos valores e cálculo do valor total do estoque
        for (int x = 0; x < 5; x++) {
            System.out.print("Informe o " + (x + 1) + "º valor: R$ ");
            valor[x] = scanner.nextDouble();
            valorEstoque += valor[x];
        }

        // Exibição do valor total em estoque
        System.out.println("\nO valor do estoque é de R$ " + valorEstoque);

        scanner.close();
    }
}
