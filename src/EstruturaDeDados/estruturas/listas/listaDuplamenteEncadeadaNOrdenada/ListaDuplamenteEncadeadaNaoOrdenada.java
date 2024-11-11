package EstruturaDeDados.estruturas.listas.listaDuplamenteEncadeadaNOrdenada;

import java.util.Scanner;

public class ListaDuplamenteEncadeadaNaoOrdenada {

    private static class LISTA {
        public int num;
        public LISTA prox;
        public LISTA ant;
    }

    private static Scanner in = new Scanner(System.in);
    private static LISTA inicio = null;
    private static LISTA fim = null;
    private static LISTA aux;
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
            System.out.println("3 - Consultar a lista do inicio ao fim");
            System.out.println("4 - Consultar a lista do fim ao ínicio");
            System.out.println("5 - Remover da lista");
            System.out.println("6 - Esvaziar a lista");
            System.out.println("7 - Sair");


            System.out.print("Digite sua opção: ");
            op = in.nextInt();

            switch (op){
                case 1 -> Inserir();
                case 2 -> InserirFim();
                case 3 -> consultarElementosInicioFim();
                case 4 -> consultarElementosFimInicio();
                case 5 -> removerDaLista();
                case 6 -> esvaziarLista();
                case 7 -> System.out.println("bye...");
                default -> System.out.println("Opção invalida!");
            }

        } while (op != 7);
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
            novo.prox = inicio;
            inicio.ant = novo;
            novo.ant = null;
            inicio = novo;
        }
        System.out.println("Número inserido no ínicio da lista");
    }

    public static void InserirFim() {
        System.out.println("digite o numeoro a ser inserido no fim da lista");
        LISTA novo = new LISTA();
        novo.num = in.nextInt();

        if (inicio == null) {
            inicio = fim = novo;
            novo.prox = null;
            novo.ant = null;
        } else {
            fim.prox = novo;
            novo.ant = fim;
            novo.prox = null;
            fim = novo;
        }
        System.out.println("Número inserido no fim da lista");
    }

    public static void consultarElementosInicioFim() {
        if (inicio == null) {
            System.out.println("lista vazia");
        } else {
            System.out.println("Consultando a lista do ínicio ao fim!");
            aux = inicio;
            while (aux != null) {
                System.out.println(aux.num + " ");
                aux = aux.prox;
            }
        }
    }

    public static void consultarElementosFimInicio() {
        if (inicio == null) {
            System.out.println("lista vazia");
        } else {
            System.out.println("Consultando a lista do fim ao ínicio!");
            aux = fim;
            while (aux != null) {
                System.out.println(aux.num + " ");
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
