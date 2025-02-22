package EstruturaDeDados.estruturas.pilhaAndFila.pilha;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(20);
        pilha.push(10);
        pilha.push(50);
        pilha.push(90);

        System.out.println(pilha);

        int numRemovido = pilha.pop();
        System.out.printf("num removido: %d\n", numRemovido);

        System.out.println(pilha);

        int numTopo = pilha.peek();
        System.out.printf("Numero no topo: %d\n",  numTopo);

        boolean pilhaVazia = pilha.empty();
        System.out.println("vazia? " + pilhaVazia);

        int tamanho = pilha.size();
        System.out.println("Tamanho da pilha: " + tamanho);
    }

}
