package EstruturaDeDados.estruturas.pilhaAndFila.fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        fila.add(10);
        fila.add(20);
        fila.add(5);
        fila.add(60);
        fila.add(100);

        System.out.println("Fila: " + fila);

        // Remove o elemento da frente da fila (dequeue)
        int elementoRemovido = fila.poll();
        System.out.println("Elemento removido: " + elementoRemovido);

        // Exibe a fila após a remoção
        System.out.println("Fila após remoção: " + fila);

        // Acessa o elemento da frente da fila sem removê-lo (peek)
        int elementoNoInicio = fila.peek();
        System.out.println("Elemento no inicio: " + elementoNoInicio);

        // Verifica se a fila está vazia
        boolean estaVazia = fila.isEmpty();
        System.out.println("A fila está vazia? " + estaVazia);

        // Tamanho da fila
        int tamanho = fila.size();
        System.out.println("Tamanho da fila: " + tamanho);
    }
}
