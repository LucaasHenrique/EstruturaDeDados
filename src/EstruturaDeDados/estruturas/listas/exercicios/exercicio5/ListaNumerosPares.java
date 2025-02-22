package EstruturaDeDados.estruturas.listas.exercicios.exercicio5;

import java.util.ArrayList;
import java.util.List;

// lista simplesmente encadeada não ordenada
public class ListaNumerosPares {

    private static class LISTA {
        int num;
        LISTA proximo;

        public LISTA(int num) {
            this.num = num;
        }
    }

    LISTA inicio = null;
    LISTA aux;

    public void adicionarNumeroPar(int numPar) {
        LISTA novo = new LISTA(numPar);

        if (inicio == null) {
            inicio = novo;
        } else {
            aux = inicio;
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novo;
        }
    }

    public void mostrarNumeros() {
        if (inicio == null)
            System.out.println("a lista está vazia");

        System.out.println("\n consultado toda a lista");
        aux = inicio;
        while (aux != null) {
            System.out.println(aux.num + " ");
            aux = aux.proximo;
        }
    }

    public List<Integer> retornaNumero() {
        if (inicio == null)
            System.out.println("a lista está vazia");
        List<Integer> numeros = new ArrayList<>();

        aux = inicio;
        while (aux != null) {
            numeros.add(aux.num);
            aux = aux.proximo;
        }
        return numeros;
    }
}
