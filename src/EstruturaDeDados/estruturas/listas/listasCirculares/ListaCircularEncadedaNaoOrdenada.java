package EstruturaDeDados.estruturas.listas.listasCirculares;

import java.util.Scanner;

public class ListaCircularEncadedaNaoOrdenada {

    private static class LISTA {
        public int num;
        public LISTA prox;
    }

    private static LISTA inicio = null;
    private static LISTA fim = null;
    private static LISTA aux;
    private static LISTA anterior;
    private static Scanner in = new Scanner(System.in);
    private static int numero, achou;

    public static void main(String[] args) {
        menu();
    }

    public static void menu () {
        int op;
        do {
            System.out.println("\nMENU DE OPÇÕES\n");
            System.out.println("1 - Inserir no ínicio da lista");
            System.out.println("2 - Inserir no fim da lista");
            System.out.println("3 - Consultar toda a lista");
            System.out.println("4 - Remover da lista");
            System.out.println("5 - Esvaziar da lista");
            System.out.println("6 - Sair");

            System.out.print("Digite sua opção: ");
            op = in.nextInt();

            switch (op){
                case 1 -> Inserir();
                case 2 -> InserirFim();
                case 3 -> consultarElementos();
                case 4 -> removerDaLista();
                case 5 -> esvaziarLista();
                case 6 -> System.out.println("bye...");
                default -> System.out.println("Opção invalida!");
            }

        } while (op != 6);
    }

    public static void Inserir() {
        System.out.println("digite o numeoro a ser inserido no inicio da lista");
        LISTA novo = new LISTA();
        novo.num = in.nextInt();

        if (inicio == null) {
            inicio = fim = novo;
            fim.prox = inicio;
        } else {
            novo.prox = inicio;
            inicio = novo;
            fim.prox = inicio;
        }
        System.out.println("Número inserido na lista");
    }

    public static void InserirFim() {
        System.out.println("digite o numeoro a ser inserido no inicio da lista");
        LISTA novo = new LISTA();
        novo.num = in.nextInt();

        if (inicio == null) {
            inicio = fim = novo;
            fim.prox = inicio;
        } else {
            fim.prox = novo;
            fim = novo;
            fim.prox = inicio;
        }
        System.out.println("Número inserido na lista");
    }

    public static void consultarElementos() {
        if (inicio == null) {
            System.out.println("lista vazia");
        } else {
            System.out.println("Consultando toda a lista \n");
            aux = inicio;

            do {
               System.out.println(aux.num+"");
               aux = aux.prox;
            } while (aux != inicio);
        }
    }

    public static void removerDaLista() {
        if (inicio == null) {
            // lista vazia
            System.out.println("lista vazia");
        } else {
            // lista ja contem elementos
            System.out.println("informe o numero a ser removido!");
            numero = in.nextInt();

            aux = inicio;
            anterior = null;
            achou = 0;
            // descobrindo a quantidade de elementos na lista
            int quantidade = 0;

            do {
                quantidade = quantidade + 1;
                aux = aux.prox;
            } while (aux != inicio);

            int elemento = 1;

            do {
                //se a lista possui apenas um elemento
                if (inicio == fim && inicio.num == numero){
                    inicio = null;
                    achou = achou + 1;
                } else {
                    if (aux.num == numero) {
                        // o númeoro digitado foi encontrado na lista sera removido
                        achou += 1;
                        if (aux == inicio) {
                            // o número a ser removido é primeiro da lista
                            inicio = aux.prox;
                            fim.prox = inicio;
                            aux = inicio;
                        } else if (aux == fim) {
                            // o número a ser removido é o ultimo da lista
                            fim = anterior;
                            fim.prox = inicio;
                            aux = aux.prox;
                        } else {
                            // o númeoro a ser removido está no meio da lista
                            anterior.prox = aux.prox;
                            aux = aux.prox;
                        }
                    } else {
                        anterior = aux;
                        aux = aux.prox;
                    }
                }
                elemento += 1;
            } while (elemento <= quantidade);

            if (achou == 0) {
                System.out.println("Numero nao encontrado!");
            } else if (achou == 1) {
                System.out.println("numero removido 1 vez");
            } else {
                System.out.println("numero removido " + achou + " vezes");
            }
        }
    }

    public static void esvaziarLista() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
        } else {
            inicio = null;
            System.out.println("Lista esvaziada");
        }
    }

}
