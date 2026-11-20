package ex8;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas vendas tem a filial 1? ");
        int n1 = sc.nextInt();
        double[] filial1 = new double[n1];
        System.out.println("Digite as vendas da filial 1 (ja ordenadas, ex: menor para maior):");
        for (int i = 0; i < n1; i++) {
            filial1[i] = sc.nextDouble();
        }

        System.out.print("Quantas vendas tem a filial 2? ");
        int n2 = sc.nextInt();
        double[] filial2 = new double[n2];
        System.out.println("Digite as vendas da filial 2 (ja ordenadas, ex: menor para maior):");
        for (int i = 0; i < n2; i++) {
            filial2[i] = sc.nextDouble();
        }

        double[] combinado = new double[n1 + n2];
        int i1 = 0;
        int i2 = 0;
        int k = 0;

        while (i1 < n1 && i2 < n2) {
            if (filial1[i1] <= filial2[i2]) {
                combinado[k] = filial1[i1];
                i1++;
            } else {
                combinado[k] = filial2[i2];
                i2++;
            }
            k++;
        }

        while (i1 < n1) {
            combinado[k] = filial1[i1];
            i1++;
            k++;
        }

        while (i2 < n2) {
            combinado[k] = filial2[i2];
            i2++;
            k++;
        }

        System.out.println("\nRelatorio combinado:");
        for (int i = 0; i < combinado.length; i++) {
            System.out.printf("%.2f ", combinado[i]);
        }
        System.out.println();

        sc.close();
    }
}