package ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dias = {"Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
        double[] vendas = new double[7];

        double total = 0;
        int indiceMaior = 0;

        for (int i = 0; i < 7; i++) {

            System.out.print("Faturamento de " + dias[i] + ": ");
            vendas[i] = sc.nextDouble();
            total += vendas[i];

            if (vendas[i] > vendas[indiceMaior]) {
                indiceMaior = i;
            }
        }

        double media = total / 7.0;

        System.out.printf("Total da semana: R$ %.2f%n", total);
        System.out.printf("Media diaria: R$ %.2f%n", media);
        System.out.printf("Dia que mais vendeu: %s (R$ %.2f)%n", dias[indiceMaior], vendas[indiceMaior]);

        sc.close();
    }
}
