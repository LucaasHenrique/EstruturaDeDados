package EstruturaDeDados.estruturas.listas.listaEncadeadaOrdenada;

import java.util.Scanner;

public class ListaEncadeadaOrdenada {

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
            System.out.println("1 - Inserir na lista");
            System.out.println("2 - Consultar toda a lista");
            System.out.println("3 - Remover da lista");
            System.out.println("4 - Esvaziar a lista");
            System.out.println("5 - Sair");

            System.out.print("Digite sua opção: ");
            op = in.nextInt();

            switch (op){
                case 1 -> Inserir();
                case 2 -> consultarElementos();
                case 3 -> removerDaLista();
                case 4 -> esvaziarLista();
                case 5 -> System.out.println("bye...");
                default -> System.out.println("Opção invalida!");
            }

        } while (op != 5);
    }

    public static void Inserir() {
        System.out.println("digite o numeoro a ser inserido no inicio da lista");
        LISTA novo = new LISTA();
        novo.num = in.nextInt();

        if (inicio == null) {
            inicio = fim = novo;
            novo.prox = null;
        } else {
            anterior = null;
            aux = inicio;

            while (aux != null && novo.num > aux.num) {
                anterior = aux;
                aux = aux.prox;
            }
            if (anterior == null) {
                /* o novo numero a ser inserido é menor que todos os numeros da lista,
                logo, sera inserido no ínicio.
                 */
                novo.prox = inicio;
                inicio = novo;
            } else if (aux == null) {
                /* o novo numero a ser inserido é maior que todos os numeros da lista,
                logo, sera inserido no fim.
                 */
                fim.prox = novo;
                fim = novo;
                fim.prox = null;
            } else {
                anterior.prox = novo;
                novo.prox = aux;
            }
        }
        System.out.println("Número inserido na lista");
    }

    public static void consultarElementos() {
        if (inicio == null) {
            System.out.println("lista vazia");
        } else {
            System.out.println("Consultando toda a lista \n");
            aux = inicio;

            while (aux != null) {
                System.out.println(aux.num+" ");
                aux = aux.prox;
            }
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

            while (aux != null) {
                if (aux.num == numero) {
                    achou += 1;
                    if (aux == inicio) {
                        inicio = aux.prox;
                        aux = inicio;
                    } else if (aux == fim) {
                        anterior.prox = null;
                        fim = anterior;
                        aux = null;
                    } else {
                        anterior.prox = aux.prox;
                        aux = aux.prox;
                    }
                } else {
                    anterior = aux;
                    aux = aux.prox;
                }
            }
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
