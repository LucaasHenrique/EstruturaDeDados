package EstruturaDeDados.estruturas.pilhaAndFila.exercicios.exercicio1;

import EstruturaDeDados.estruturas.pilhaAndFila.fila.Fila;
import EstruturaDeDados.estruturas.pilhaAndFila.pilha.Pilha;

public class exercicio1 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        Pilha<Integer> pilha = new Pilha<>();

        pilha.inserir(4);
        pilha.inserir(6);
        pilha.inserir(10);
        pilha.inserir(3);
        pilha.inserir(12);

        fila.inserir(5);
        fila.inserir(15);
        fila.inserir(132);
        fila.inserir(21);
        fila.inserir(243);

        pilha.consultarPilha();
        fila.consultarFila();
    }
}
