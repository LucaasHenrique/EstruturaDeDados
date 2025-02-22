package EstruturaDeDados.estruturas.listas.exercicios.exercicio4;

import EstruturaDeDados.ordenacao.exercicios.exercicio1.Funcionario;

import java.util.Scanner;

//Lista duplamente encadeada e ordenada
public class ListaFuncionarios {

    Funcionarios inicio = null;
    Funcionarios fim = null;
    Funcionarios aux;

    public void inserirFuncionario(String nome, double salario) {
        Funcionarios novo = new Funcionarios(nome, salario);

        if (inicio == null) {
            inicio = fim = novo;
            novo.proximo = null;
            novo.anterior = null;
        } else {
            aux = inicio;

            while (aux != null && novo.salario > aux.salario) {
                aux = aux.proximo;
            }

            if (aux == inicio) {
                novo.proximo = inicio;
                novo.anterior = null;
                inicio.anterior = novo;
                inicio = novo;
            } else if (aux == null) {
                /* o novo numero a ser inserido é menor que todos os numeros da lista,
                logo, sera inserido no ínicio.
                 */
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

    public void valorAReceber() {
        if (inicio == null)
            System.out.println("lista vazia");

        System.out.println("consultando a lista de funcionarios: ");
        aux = inicio;

        while (aux != null) {
            if (aux.salario <= 850) {
                System.out.println("| " + aux.nome + " | " + "isento de imposto" + " | " + aux.salario);
            } else if (aux.salario > 850 && aux.salario <= 1200) {
                double valorAreceber = aux.salario - (aux.salario * 0.1);
                System.out.println("| " + aux.nome + " | " + "10% de imposto" + " | " + valorAreceber);
            } else {
                double valorAreceber = aux.salario - (aux.salario * 0.2);
                System.out.println("| " + aux.nome + " | " + "20% de imposto" + " | " + valorAreceber);
            }
            aux = aux.proximo;
        }
    }

    public void nomePorLetra(char letra) {
        if (inicio == null)
            System.out.println("Lista vazia!");

        aux = inicio;
        int cont = 0;
        while (aux != null) {
            letra = Character.toUpperCase(letra);
            if (aux.nome.toUpperCase().charAt(0) == letra) {
                System.out.println("| " + "Nome: " + aux.nome + " | " + "Salario: " + aux.salario);
                cont += 1;
            }
            aux = aux.proximo;
        }
        if (cont == 0)
            System.out.println("Nenhum nome com a letra " + letra);
    }


    public void ordemCrescente() {
        if (inicio == null)
            System.out.println("Lista vazia!");

        aux = inicio;

        while (aux != null) {
            System.out.println("| " + "nome: " + aux.nome + " | "  + "Salario: " + aux.salario);
            aux = aux.proximo;
        }
    }

    public void ordemDecrescente() {
        if (inicio == null)
            System.out.println("Lista vazia");

        aux = fim;
        while (aux != null) {
            System.out.println("| " + "nome: " + aux.nome + " | "  + "Salario: " + aux.salario);
            aux = aux.anterior;
        }
    }
}
