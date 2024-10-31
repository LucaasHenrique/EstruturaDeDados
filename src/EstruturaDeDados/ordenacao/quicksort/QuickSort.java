package EstruturaDeDados.ordenacao.quicksort;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        int x[] = new int[10];
        int i;
        Scanner input = new Scanner(System.in);
        for (i=0; i<9; i++) {
            System.out.print("Digite o " + (i+1) + "° numero: ");
            x[i] = input.nextInt();
        }
        quickSort(x, 0, 9);
        System.out.println("Vetor ordenado");
        System.out.println(Arrays.toString(x));
    }

    public static void troca(int x[], int i, int j) {
        int aux;
        aux = x[i];
        x[i] = x[j];
        x[j] = aux;
    }

    public static int particicao(int x[], int p, int r) {
        int pivo, i, j;
        pivo = x[(p+r) / 2];
        i = p - 1;
        j = r + 1;
        while (i < j) {
            do {
                j -= 1;
            } while (x[j] > pivo);
            do {
                i += 1;
            } while (x[i] < pivo);
            if (i < j) troca(x, i, j);
        }
        return j;
    }

    public static void quickSort(int x[], int p, int r) {
        int q;
        if (p < r) {
            q = particicao(x, p, r);
            quickSort(x, p, q);
            quickSort(x, q+1, r);
        }
    }
}
