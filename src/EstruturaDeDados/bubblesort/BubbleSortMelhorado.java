package EstruturaDeDados.bubblesort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortMelhorado {
    public static void main(String[] args) {

        int[] x = new int[5];
        int j, i, aux;


        Scanner input = new Scanner(System.in);

        for (i =0; i<=4; i++) {
            System.out.print("digite o " + (i+1) + " numero: ");
            x[i] =input.nextInt();
        }

        System.out.println("antes do BUBBLE SORT: " + Arrays.toString(x));

        for (j=1; j<=x.length - 1; j++) {
            for (i=4; i>=j; i--) {
                if (x[i] < x[i-1]) {
                    aux = x[i];
                    x[i] = x[i-1];
                    x[i-1] = aux;
                }
            }
        }

        /*for (i=0; i<x.length; i++) {
            System.out.println((i+1) + " numero: " + x[i]);
        }*/

        System.out.println("depois do BUBBLE SORT: " + Arrays.toString(x));
    }
}
