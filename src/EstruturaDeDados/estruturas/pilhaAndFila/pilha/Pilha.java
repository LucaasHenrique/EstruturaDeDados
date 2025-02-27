package EstruturaDeDados.estruturas.pilhaAndFila.pilha;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {

    private static class PILHA<T> {
        public T obj;
        public PILHA<T> prox;

        public PILHA(T obj) {
            this.obj = obj;
        }
    }

    PILHA<T> topo = null;
    PILHA<T> aux;

    public void inserir(T obj) {
        PILHA<T> novo = new PILHA<>(obj);

        novo.prox = topo;
        topo = novo;
    }

    public void consultarPilha() {
        if (topo == null)
            System.out.println("A pilha está vazia!");

        System.out.println("Consultando a pilha!");
        aux = topo;
        List<T> pilha = new ArrayList<>();
        while (aux != null) {
            pilha.add(aux.obj);
            aux = aux.prox;
        }
        System.out.println(pilha);
    }

    public List<T> retornaPilha() {
        if (topo == null)
            System.out.println("A pilha está vazia!");

        aux = topo;
        List<T> pilha = new ArrayList<>();
        while (aux != null) {
            pilha.add(aux.obj);
            aux = aux.prox;
        }

        return pilha;
    }


    public void remove() {
        if (topo == null)
            System.out.println("A pilha está vazia!");

        System.out.println("Elemento: " + topo.obj + " removido");
        topo = topo.prox;
    }

    public void esvaziarPilha() {
        if (topo == null)
            System.out.println("A pilha está vazia!");

        topo = null;
        System.out.println("Pilha esvaziada!");
    }
}
