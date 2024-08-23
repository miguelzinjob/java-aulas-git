package org.example;

import java.util.Scanner;

public class Atv5Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area, raio;

        // Entrada de dados
        System.out.print("Informe o raio da circunferência (cm): ");
        raio = scanner.nextDouble();

        // Cálculo da área
        area = Math.PI * Math.pow(raio, 2);

        // Arredondando para duas casas decimais
        area = Math.round(area * 100.0) / 100.0;

        // Exibição do resultado
        System.out.println("\nA área da circunferência é " + area + " cm²");

        scanner.close();
    }
}
