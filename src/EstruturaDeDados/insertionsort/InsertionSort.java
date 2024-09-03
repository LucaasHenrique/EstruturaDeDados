package EstruturaDeDados.insertionsort;
import java.util.*;

// ALGORITMO DE ORDENAÇAO POR INSERÇÃO
public class InsertionSort {
    public static void main(String[] args) {
        int[] x = new int[5];
        int i, j, eleito;

        Scanner input = new Scanner(System.in);

        for (i=0; i<x.length; i++) {
            System.out.print("digite o " + (i+1) + " numero: ");
            x[i] = input.nextInt();
        }

        System.out.println("vetor não ordenado: " + Arrays.toString(x));
        //ordenando de forma crescente
        // laço com a quantidae de elementos do vetor -1

        for (i=1; i<=x.length-1; i++) {
            eleito = x[i];
            j = i - 1;
            /* laço que pecorre os elementos à esquerda do numero eleito ou até encontrar a posição para realocaçao
            do numero eleito respeitando a ordenação procurada
             */
            while (j >= 0 && x[j] > eleito) {
                x[j+1] = x[j];
                j -= 1;
            }
            x[j+1] = eleito;
        }

        System.out.println("vetor ordenado: " + Arrays.toString(x));
    }
}
