package ex3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd = 5;
        int[] codigos = new int[qtd];
        double[] precos = new double[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o codigo do produto " + (i + 1) + ": ");
            codigos[i] = sc.nextInt();
            System.out.print("Digite o preco do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
        }

        System.out.print("\nDigite o codigo para consultar: ");
        int busca = sc.nextInt();

        boolean achou = false;
        for (int i = 0; i < qtd; i++) {
            if (codigos[i] == busca) {
                System.out.printf("Preco: R$ %.2f%n", precos[i]);
                achou = true;
                break;
            }
        }

        if (!achou) {
            System.out.println("Produto nao cadastrado");
        }

        sc.close();
    }
}