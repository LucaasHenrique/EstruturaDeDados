package EstruturaDeDados.estruturas.pilhaAndFila;

import java.util.List;

public class PilhaMain {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.inserir(2);
        pilha.inserir(5);
        pilha.inserir(3);
        pilha.inserir(8);
        pilha.inserir(10);

        pilha.consultarPilha();
        pilha.remove();
        pilha.consultarPilha();
        pilha.esvaziarPilha();
        pilha.consultarPilha();
    }
}
