package org.example;

import java.util.Scanner;

public class Atv5Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A, B, C, R, S, D;

        // Entrada de dados
        System.out.print("Informe o valor A: ");
        A = scanner.nextDouble();
        System.out.print("Informe o valor B: ");
        B = scanner.nextDouble();
        System.out.print("Informe o valor C: ");
        C = scanner.nextDouble();

        // Cálculos
        R = calculaR(A, B);
        S = calculaS(B, C);
        D = calculaD(R, S);

        // Exibição do resultado
        System.out.println("O valor de D é: " + D);

        scanner.close();
    }

    // Função que calcula o valor de R
    public static double calculaR(double a, double b) {
        return Math.pow(a + b, 2.0);
    }

    // Função que calcula o valor de S
    public static double calculaS(double b, double c) {
        return Math.pow(b + c, 2.0);
    }

    // Função que calcula o valor de D
    public static double calculaD(double r, double s) {
        return (r + s) / 2;
    }
}
