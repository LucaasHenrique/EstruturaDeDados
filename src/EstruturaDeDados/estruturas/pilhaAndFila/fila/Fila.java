package EstruturaDeDados.estruturas.pilhaAndFila.fila;

import java.util.ArrayList;
import java.util.List;

public class Fila<T> {

    public static class FILA<T> {
        T obj;
        FILA<T> prox;

        public FILA(T obj) {
            this.obj = obj;
        }
    }

    private FILA<T> inicio = null;
    private FILA<T> fim = null;
    private FILA<T> aux;

    public void inserir(T obj) {
        FILA<T> novo = new FILA<>(obj);
        novo.prox = null;

        if (inicio == null) {
            // vazia
            // num primeiro e ultimo
            inicio = fim = novo;
        } else {
            fim.prox = novo;
            fim = novo;
        }
    }

    public List<T> consultarFila() {
        if (inicio == null)
            System.out.println("Fila vazia!");

        System.out.println("Consultando a fila");
        aux = inicio;
        List<T> fila = new ArrayList<>();
        while (aux != null) {
            fila.add(aux.obj);
            aux = aux.prox;
        }
        System.out.println(fila);
        return fila;
    }

    public void remove() {
        if (inicio == null)
            System.out.println("Fila vazia!");

        System.out.println("Elemento: " + inicio.obj + " removido");
        inicio = inicio.prox;
    }

    public void esvaziarFila() {
        if (inicio == null)
            System.out.println("Fila vazia!");

        inicio = null;
        System.out.println("Fila esvaziada!");
    }
}
