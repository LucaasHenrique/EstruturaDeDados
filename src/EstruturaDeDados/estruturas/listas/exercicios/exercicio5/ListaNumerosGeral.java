package EstruturaDeDados.estruturas.listas.exercicios.exercicio5;

public class ListaNumerosGeral {

    private static class LISTA {
        int num;
        LISTA proximo;
        LISTA anterior;

        public LISTA(int num) {
            this.num = num;
        }
    }

    LISTA inicio = null;
    LISTA fim = null;
    LISTA aux;

    public void adicionarNumeros(int num) {
        LISTA novo = new LISTA(num);

        if (inicio == null) {
            inicio = fim = novo;
            novo.proximo = null;
            novo.anterior = null;
        } else {
            aux = inicio;

            while (aux != null && novo.num > aux.num) {
                aux = aux.proximo;
            }

            if (aux == inicio) {
                novo.proximo = inicio;
                novo.anterior = null;
                inicio.anterior = novo;
                inicio = novo;
            } else if (aux == null) {
                fim.proximo = novo;
                novo.anterior = fim;
                fim = novo;
                fim.proximo = null;
            } else {
                novo.proximo = aux;
                aux.anterior.proximo = novo;
                novo.anterior = aux.anterior;
                aux.anterior = novo;
            }
        }
    }

    public void ordemCrescente() {
        if (inicio == null)
            System.out.println("Lista vazia!");

        aux = inicio;

        while (aux != null) {
            System.out.println("| " + "numero: " + aux.num + " | ");
            aux = aux.proximo;
        }
    }

    public void ordemDecrescente() {
        if (inicio == null)
            System.out.println("Lista vazia!");

        aux = fim;

        while (aux != null) {
            System.out.println("| " + "numero: " + aux.num + " | ");
            aux = aux.anterior;
        }
    }
}
