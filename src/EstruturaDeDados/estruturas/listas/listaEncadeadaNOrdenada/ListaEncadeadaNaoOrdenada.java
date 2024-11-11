package EstruturaDeDados.estruturas.listaEncadeadaNOrdenada;

import java.util.Scanner;

// melhorar a legibilidade desse codigo
// autor maluco
public class ListaEncadeadaNaoOrdenada {

    private static class LISTA {
        public int num;
        public LISTA prox;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LISTA inicio = null;
        LISTA fim = null;
        LISTA aux;
        LISTA anterior;

        int op, numero, achou;

        do {
            System.out.println("\nMENU DE OPÇÕES\n");
            System.out.println("1 Inserir no início da lista");
            System.out.println("2 Inserir no fim da lista");
            System.out.println("3 Consultar toda a - lista");
            System.out.println("4 - Remover da lista");
            System.out.println("5 Esvaziar a lista");
            System.out.println("6 Sair");
            System.out.print("Digite sua opção: ");
            op = in.nextInt();
            if (op < 1 || op > 6) {
                System.out.println("Opçao invalida!");
            }

            if (op == 1) {
                System.out.println("digite o numeoro a ser inserido no inicio da lista");
                LISTA novo = new LISTA();
                novo.num = in.nextInt();

                if (inicio == null) {
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                } else {
                    novo.prox = inicio;
                    inicio = novo;
                }
                System.out.println("numero inserido no inicio da lista!");
            }
            if (op == 2) {
                System.out.println("digite o numeoro a ser inserido no fim da lista");
                LISTA novo = new LISTA();
                novo.num = in.nextInt();

                if (inicio == null) {
                    // lista vazia
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                } else {
                    // lista ja contem elementos
                    fim.prox = novo;
                    fim = novo;
                    fim.prox = null;
                }
                System.out.println("numero inserido no fim da lista!");
            }

            if (op == 3) {
                if (inicio == null) {
                    // lista vazia
                    System.out.println("a lista está vazia");
                } else {
                    // lista ja contem elementos
                    System.out.println("\n consultado toda a lista");
                    aux = inicio;
                    while (aux != null) {
                        System.out.println(aux.num+" ");
                        aux = aux.prox;
                    }
                }
            }
            if (op == 4) {
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

            if (op == 5) {
                if (inicio == null) {
                    System.out.println("lista vazia");
                } else {
                    // a lista sera esvaziada
                    inicio = null;
                    System.out.println("lista esvaziada!");
                }
            }
        } while (op != 6);
    }
}
