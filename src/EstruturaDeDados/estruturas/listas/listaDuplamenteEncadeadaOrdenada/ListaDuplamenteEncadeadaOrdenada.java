package EstruturaDeDados.estruturas.listaDuplamenteEncadeadaOrdenada;

import java.util.Scanner;

public class ListaDuplamenteEncadeadaOrdenada {

    private static class LISTA {
        public int num;
        public LISTA prox;
        public LISTA ant;
    }

    private static LISTA inicio = null;
    private static LISTA fim = null;
    private static LISTA aux;
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
            System.out.println("2 - Consultar a lista do ínicio ao fim");
            System.out.println("3 - Consultar a lista do fim ao ínicio");
            System.out.println("4 - Remover da lista");
            System.out.println("5 - Esvaziar a lista");
            System.out.println("6 - Sair");

            System.out.print("Digite sua opção: ");
            op = in.nextInt();

            switch (op){
                case 1 -> Inserir();
                case 2 -> consultarElementosInicioFim();
                case 3 -> consultarElementosFimInicio();
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
            novo.prox = null;
            novo.ant = null;
        } else {
            aux = inicio;

            while (aux != null && novo.num > aux.num) {
                aux = aux.prox;
            }
            if (aux == inicio) {
                /* o novo numero a ser inserido é menor que todos os numeros da lista,
                logo, sera inserido no ínicio.
                 */
                novo.prox = inicio;
                novo.ant = null;
                inicio.ant = novo;
                inicio = novo;
            } else if (aux == null) {
                /* o novo numero a ser inserido é maior que todos os numeros da lista,
                logo, sera inserido no fim.
                 */
                fim.prox = novo;
                novo.ant = fim;
                fim = novo;
                fim.prox = null;
            } else {
                novo.prox = aux;
                aux.ant.prox = novo;
                novo.ant = aux.ant;
                aux.ant = novo;
            }
        }
        System.out.println("Número inserido na lista!!");
    }

    public static void consultarElementosInicioFim() {
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

    public static void consultarElementosFimInicio() {
        if (inicio == null) {
            System.out.println("lista vazia");
        } else {
            System.out.println("Consultando toda a lista do fim ao ínicio \n");
            aux = fim;

            while (aux != null) {
                System.out.println(aux.num+" ");
                aux = aux.ant;
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
            achou = 0;

            while (aux != null) {
                if (aux.num == numero) {
                    achou += 1;
                    if (aux == inicio) {
                        inicio = aux.prox;
                        if (inicio != null) {
                            inicio.ant = null;
                        }
                        aux = inicio;
                    } else if (aux == fim) {
                        fim = fim.ant;
                        fim.prox = null;
                        aux = null;
                    } else {
                        aux.ant.prox = aux.prox;
                        aux.prox.ant = aux.ant;
                        aux = aux.prox;
                    }
                } else {
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
