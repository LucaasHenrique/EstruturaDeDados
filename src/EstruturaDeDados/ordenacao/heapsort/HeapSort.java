package EstruturaDeDados.ordenacao.heapsort;

import java.util.Arrays;
import java.util.Scanner;

/*public class HeapSort {

     static int x[] = new int[11];
     static Scanner input = new Scanner(System.in);

     public static void main(String[] args) {
         int i;
         for (i = 1; i <= 10; i++) {
             System.out.print("digite o " +i+"° numero: ");
             x[i] = input.nextInt();
         }
         // tranforma o vetor digitado em um heap
         // cada no pai é maior que seus filhos
         transforma_heap(x.length - 1);
         //ordena de forma crescente
         ordena(x.length - 1);
         System.out.println("array ordenado: " + Arrays.toString(x));
     }

     public static void transforma_heap(int qtde) {
         int i, pai, aux;
         for (i=qtde/2; i>=1; i--) {
	        heap_fica(i, qtde);
         }
     }

     public static void heap_fica(int i, int qtde) {
     	int f_esq, f_dir, maior, aux;
         maior = i;
         if (2*i+1 <= qtde) {
             // o no que esta sendo analisado
             // tem filhos para esquerda e direita
             f_esq = 2 * i + 1;
             f_dir = 2 * i;
             if (x[f_esq] >= x[f_dir] && x[f_esq] > x[i]) {
                 maior = 2*i+1;
             } else if (x[f_dir] >= x[f_esq] && x[f_dir] > x[i]) {
                 maior = 2*i;
             } else if (2*i <= qtde) {
                 // o no que esta sendo analisado
                 // tem filho apenas para a direita
                 f_dir = 2*i;
                 if (x[f_dir] > x[i]) {
                     maior = 2 * i;
                 }
             }
             if (maior != i) {
                 aux = x[i];
                 x[i] = x[maior];
                 x[maior] = aux;
                 heap_fica(maior, qtde);
             }
         }
     }

     public static void ordena(int qtde) {
         int i, aux, ultima_posi;

         for (i = qtde; i >= 2; i--) {
             aux = x[i];
             x[1] = x[i];
             x[i] = aux;
             ultima_posi = i - 1;
             heap_fica(1, ultima_posi);
         }
     }
}*/

public class HeapSort {

    static int x[] = new int[10];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° numero: ");
            x[i] = input.nextInt();
        }

        // Transforma o vetor digitado em um heap
        transforma_heap(x.length);

        // Ordena de forma crescente
        ordena(x.length);

        System.out.println("Array ordenado: " + Arrays.toString(x));
    }

    public static void transforma_heap(int qtde) {
        for (int i = qtde / 2 - 1; i >= 0; i--) {
            heap_fica(i, qtde);
        }
    }

    public static void heap_fica(int i, int qtde) {
        int maior = i;
        int f_esq = 2 * i + 1;
        int f_dir = 2 * i + 2;

        if (f_esq < qtde && x[f_esq] > x[maior]) {
            maior = f_esq;
        }

        if (f_dir < qtde && x[f_dir] > x[maior]) {
            maior = f_dir;
        }

        if (maior != i) {
            int aux = x[i];
            x[i] = x[maior];
            x[maior] = aux;
            heap_fica(maior, qtde);
        }
    }

    public static void ordena(int qtde) {
        for (int i = qtde - 1; i > 0; i--) {
            int aux = x[0];
            x[0] = x[i];
            x[i] = aux;
            heap_fica(0, i);
        }
    }
}

