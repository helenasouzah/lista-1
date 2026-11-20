package ex2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] estoque = new int[10];
        int qtdCriticos = 0;

        for (int i = 0; i < estoque.length; i++) {
            System.out.print("Quantidade do produto na posicao " + i + ": ");
            estoque[i] = sc.nextInt();
        }

        System.out.println("\nProdutos com menos de 5 unidades:");
        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i] < 5) {
                System.out.println("Posicao " + i + " -> " + estoque[i] + " unidades");
                qtdCriticos++;
            }
        }

        System.out.println("Total de produtos em estoque critico: " + qtdCriticos);

        sc.close();
    }
}