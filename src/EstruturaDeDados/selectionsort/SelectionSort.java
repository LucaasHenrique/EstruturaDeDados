package EstruturaDeDados.selectionsort;
import java.util.*;

// Ordenação por inserção
public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] x = new int[5];
        int i, j, eleito, menor, pos;

        for (i=0; i<x.length; i++) {
            System.out.print("numero " + (i+1) +": ");
            x[i] = input.nextInt();
        }

        System.out.println("array não ordenado: " + Arrays.toString(x));
        /*Ordenando de forma crescente, laço que pecorre da 1 posição à penultima posição do vetor
        * elegendo um numero para ser comparado*/
        for (i=0; i<=x.length-1; i++) {
            eleito = x[i];
            //encontrando o menor numero à direita do eleito com sua respectiva posição
            //posiçao do eleito = 1, primeiro numero à direita do eleito na posição = x + 1
            menor = x[i+1];
            pos = i + 1;
            //laço que pecorre os elementos que estão à direita do numero eleito, retornando o menor numero à direita
            // é sua posição

            for (j=i+2; j<=x.length; j++) {
                if (x[j] < menor) {
                    menor = x[j];
                    pos = j;
                }
            }

            if (menor < eleito) {
                x[i] = x[pos];
                x[pos] = eleito;
            }
        }

        System.out.println("array ordenado: " + Arrays.toString(x));
    }
}
