package EstruturaDeDados.ordenacao.bubblesort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortMelhorado2 {
    public static void main(String[] args) {

        int[] x = new int[5];
        int n, i, aux, troca;


        Scanner input = new Scanner(System.in);

        for (i =0; i<=4; i++) {
            System.out.print("digite o " + (i+1) + " numero: ");
            x[i] =input.nextInt();
        }

        System.out.println("antes do BUBBLE SORT: " + Arrays.toString(x));

        // ordenado de forma decrescente, laço com a quantidade de elementos do vetor e enquanto houver trocas
        n = 1;
        troca = 1;
        while (n <= x.length && troca == 1) {
            troca = 0;
            for (i=0; i<=3; i++) {
                if (x[i] < x[i+1]) {
                    troca = 1;
                    aux = x[i];
                    x[i] = x[i+1];
                    x[i+1] = aux;
                }
            }
            n += 1;
        }

        /*for (i=0; i<x.length; i++) {
            System.out.println((i+1) + " numero: " + x[i]);
        }*/

        System.out.println("depois do BUBBLE SORT: " + Arrays.toString(x));
    }
}
