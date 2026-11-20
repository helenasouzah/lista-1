package ex7;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd = 6;
        String[] nomes = new String[qtd];
        double[] vendas = new double[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.print("Nome do vendedor " + (i + 1) + ": ");
            nomes[i] = sc.next();
            System.out.print("Total vendido por " + nomes[i] + ": ");
            vendas[i] = sc.nextDouble();
        }

        // ordenacao do maior para o menor (bubble sort simples)
        for (int i = 0; i < qtd - 1; i++) {
            for (int j = 0; j < qtd - 1 - i; j++) {
                if (vendas[j] < vendas[j + 1]) {
                    double tempVenda = vendas[j];
                    vendas[j] = vendas[j + 1];
                    vendas[j + 1] = tempVenda;

                    String tempNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempNome;
                }
            }
        }

        System.out.println("\n--- Ranking de Vendedores ---");
        for (int i = 0; i < qtd; i++) {
            System.out.printf("%d. %s - R$ %.2f%n", (i + 1), nomes[i], vendas[i]);
        }

        sc.close();
    }
}