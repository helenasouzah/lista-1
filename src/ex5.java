package ex5;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[10];
        int[] contagem = new int[11]; // notas de 0 a 10

        for (int i = 0; i < 10; i++) {
            int nota;
            do {
                System.out.print("Cliente " + (i + 1) + " - nota (0 a 10): ");
                nota = sc.nextInt();
            } while (nota < 0 || nota > 10);

            notas[i] = nota;
            contagem[nota]++;
        }

        System.out.println("\nQuantidade por nota:");
        int maisVotada = 0;
        for (int nota = 0; nota <= 10; nota++) {
            System.out.println("Nota " + nota + ": " + contagem[nota] + " voto(s)");
            if (contagem[nota] > contagem[maisVotada]) {
                maisVotada = nota;
            }
        }

        System.out.println("Nota mais votada: " + maisVotada + " (" + contagem[maisVotada] + " votos)");

        sc.close();
    }
}