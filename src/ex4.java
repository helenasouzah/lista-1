package ex4;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] antes = new double[8];
        double[] depois = new double[8];
        double aumentoTotal = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Salario do funcionario " + (i + 1) + ": ");
            antes[i] = sc.nextDouble();

            double reajustado = antes[i] * 1.10;
            if (reajustado > 5000.0) {
                reajustado = 5000.0;
            }

            depois[i] = reajustado;
            aumentoTotal += (depois[i] - antes[i]);
        }

        System.out.println("\n--- Resultado ---");
        for (int i = 0; i < 8; i++) {
            System.out.printf("Func %d -> Antes: R$ %.2f | Depois: R$ %.2f%n", (i + 1), antes[i], depois[i]);
        }

        System.out.printf("Aumento total da folha: R$ %.2f%n", aumentoTotal);

        sc.close();
    }
}