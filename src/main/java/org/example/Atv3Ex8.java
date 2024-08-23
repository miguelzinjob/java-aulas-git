package org.example;

import java.util.Scanner;

public class Atv3Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nro, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        for (int cont = 1; cont <= 50; cont++) {
            System.out.print("Informe o " + cont + "º número: ");
            nro = scanner.nextInt();

            if (nro > maior) {
                maior = nro;
            }

            if (nro < menor) {
                menor = nro;
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
