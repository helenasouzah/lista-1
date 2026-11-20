package ex6;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho = 10;
        int[] senhas = new int[tamanho];
        boolean[] idoso = new boolean[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Senha da posicao " + (i + 1) + ": ");
            senhas[i] = sc.nextInt();
            System.out.print("E idoso? (true/false): ");
            idoso[i] = sc.nextBoolean();
        }

        for (int atendimento = 1; atendimento <= 3; atendimento++) {
            int posEscolhida = -1;

            // procura o primeiro idoso
            for (int i = 0; i < tamanho; i++) {
                if (senhas[i] != 0 && idoso[i]) {
                    posEscolhida = i;
                    break;
                }
            }

            // se nao tiver idoso, pega o primeiro da fila
            if (posEscolhida == -1) {
                for (int i = 0; i < tamanho; i++) {
                    if (senhas[i] != 0) {
                        posEscolhida = i;
                        break;
                    }
                }
            }

            System.out.println("\n--- Atendimento " + atendimento + " ---");
            if (posEscolhida != -1) {
                System.out.println("Senha chamada: " + senhas[posEscolhida] + (idoso[posEscolhida] ? " (Idoso)" : ""));

                // anda quem esta atras uma posicao
                for (int i = posEscolhida; i < tamanho - 1; i++) {
                    senhas[i] = senhas[i + 1];
                    idoso[i] = idoso[i + 1];
                }
                senhas[tamanho - 1] = 0;
                idoso[tamanho - 1] = false;
            } else {
                System.out.println("Fila vazia.");
            }

            System.out.print("Fila atual: ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(senhas[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}