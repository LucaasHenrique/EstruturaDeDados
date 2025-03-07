package EstruturaDeDados.estruturas.Heaps.heapMaximo;

import java.text.MessageFormat;

public class HeapMaximo {

    int[] vet = new int[11];
    int tam = 0, ind;

    public void inserir(int num) {
        if (tam < vet.length - 1) {
            tam++;
            ind = tam;
            while (ind > 1 && vet[pai(ind)] < num) {
                vet[ind] = vet[pai(ind)];
                ind = pai(ind);
            }
            vet[ind] = num;
            System.out.println("Número inserido");
        } else System.out.println("Lista de prioridades lotadas");
    }

    public void consultarElementoMaiorPrioridade() {
        if (tam == 0)
            System.out.println("Lista de prioridades vazia!!");

        System.out.println("Elemento de maior prioridade: " + vet[1]);
    }

    public void remover() {
        if (tam == 0)
            System.out.println("Lista de prioridades vazia!!");

        int maior_priori = vet[1];
        vet[1] = vet[tam];
        tam--;
        heap_fica(1, tam);
    }

    public void consultarLista() {
        if (tam == 0)
            System.out.println("Lista de prioridades vazia!!");

        System.out.println("Todos os elementos da lista de prioridades!!");
        for (int j = 1; j < tam; j++) {
            System.out.println(MessageFormat.format("{0} ", vet[j]));
            System.out.println();
        }
    }

    public int pai(int x) {
        return x/2;
    }

    public void heap_fica(int i, int qtde) {
        int f_esq, f_dir, maior, aux;

        maior = i;
        if (2 * i + 1 < qtde) {
            // o nó q esta sendo analisado
            // tem filhos p/esquerda e direita
            f_esq = 2*i+1;
            f_dir = 2*i;
            if (vet[f_esq] >= vet[f_dir] && vet[f_esq] > vet[i]) {
                maior = 2 * i + 1;
            } else if (vet[f_dir] > vet[f_esq] && vet[f_dir] > vet[i]) {
                maior = 2 *i;
            }
        } else if (2 * i <= qtde) {
            // filhos apenas para a esquerda
            f_dir = 2 * i;
            if (vet[f_dir] > vet[i]) {
                maior = 2 * i;
            }
        }

        if (maior != i) {
            aux = vet[i];
            vet[i] = vet[maior];
            vet[maior] = aux;
            heap_fica(maior, qtde);
        }
    }
}
