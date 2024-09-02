package EstruturaDeDados.bubblesort;
import java.util.*;


public class BubbleSort {
    public static void main(String[] args) {

        int[] x = new int[5];
        int n, i, aux;


        Scanner input = new Scanner(System.in);

        for (i =0; i<=4; i++) {
            System.out.print("digite o " + (i+1) + " numero: ");
            x[i] =input.nextInt();
        }

        System.out.println("antes do BUBBLE SORT: " + Arrays.toString(x));

        // ordenando de forma crescente
        for (n=1; n<=x.length; n++) {
            // laço que pecorre da primeira a ultima posição do vetor
            for (i=0; i<=3; i++) {
                if (x[i] > x[i+1]) {
                    aux = x[i];
                    x[i] = x[i+1];
                    x[i+1] = aux;
                }
            }
        }

        /*for (i=0; i<x.length; i++) {
            System.out.println((i+1) + " numero: " + x[i]);
        }*/

        System.out.println("depois do BUBBLE SORT: " + Arrays.toString(x));
    }
}
