package org.example;

import java.util.Scanner;

public class Atv4Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] media = new double[10];
        int aprov = 0, reprov = 0;

        // Leitura das médias dos alunos e contagem de aprovados/reprovados
        for (int x = 0; x < 10; x++) {
            System.out.print("Informe a média do " + (x + 1) + "º aluno: ");
            media[x] = scanner.nextDouble();

            if (media[x] >= 6) {
                aprov++;
            } else {
                reprov++;
            }
        }

        // Exibição dos resultados
        System.out.println("\nO total de alunos aprovados é: " + aprov);
        System.out.println("O total de alunos reprovados é: " + reprov);

        scanner.close();
    }
}
