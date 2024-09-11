package EstruturaDeDados.mergesort;
import java.util.*;

//Algoritmo de ordenação por intercalação
public class MergeSort {
    public static void main(String[] args) {
        int x[] = new int[10];
        int i;
        Scanner input = new Scanner(System.in);

        for (i=0; i<x.length; i++) {
            System.out.print("numero " + (i+1) +": ");
            x[i] = input.nextInt();
        }

        merge(x, 0, x.length - 1);

        System.out.println("array ordenado: " + Arrays.toString(x));
    }

    public static void merge (int x[], int inicio, int fim) {
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            merge(x, inicio, meio);
            merge(x, meio+1, fim);
            intercala(x, inicio, fim, meio);
        }
    }

    public static void intercala (int x[], int inicio, int fim, int meio) {
        int poslivre, inicioVetor1, inicioVetor2, i;
        int aux[] = new int[10];
        inicioVetor1 = inicio;
        inicioVetor2 = meio + 1;
        poslivre = inicio;

        while (inicioVetor1 <= meio && inicioVetor2 <= fim) {
            if (x[inicioVetor1] <= x[inicioVetor2]) {
                aux[poslivre] = x[inicioVetor1];
                inicioVetor1 = inicioVetor1 + 1;
            } else {
                aux[poslivre] = x[inicioVetor2];
                inicioVetor2 += 1;
            }

            poslivre += 1;
        }
        //se ainda existem numeros no primeiro vetor  que nao foram intercalados
        for (i = inicioVetor1; i <= meio; i++) {
            aux[poslivre] = x[i];
            poslivre += 1;
        }
        //se ainda existem numeros no segundo vetor  que nao foram intercalados
        for (i = inicioVetor2; i <= fim; i++) {
            aux[poslivre] = x[i];
            poslivre += 1;
        }

        for (i = inicio; i <= fim; i++) {
            x[i] = aux[i];
        }
    }
}
