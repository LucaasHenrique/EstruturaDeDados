package EstruturaDeDados.estruturas.pilhaAndFila;

public class Pilha {

    private static class PILHA {
        public int num;
        public PILHA prox;

        public PILHA(int num) {
            this.num = num;
        }
    }

    PILHA topo = null;
    PILHA aux;

    public void inserir(int num) {
        PILHA novo = new PILHA(num);

        novo.prox = topo;
        topo = novo;
    }

    public void consultarPilha() {
        if (topo == null)
            System.out.println("A pilha está vazia!");

        System.out.println("Consultando a pilha!");
        aux = topo;
        while (aux != null) {
            System.out.println(STR."\{aux.num} ");
            aux = aux.prox;
        }
    }

    public void remove() {
        if (topo == null)
            System.out.println("A pilha está vazia!");

        System.out.println("Numero: " + topo.num + " removido");
        topo = topo.prox;
    }

    public void esvaziarPilha() {
        if (topo == null)
            System.out.println("A pilha está vazia!");

        topo = null;
        System.out.println("Pilha esvaziada!");
    }
}
