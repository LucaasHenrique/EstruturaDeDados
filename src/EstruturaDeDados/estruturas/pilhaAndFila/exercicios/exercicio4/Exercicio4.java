package EstruturaDeDados.estruturas.pilhaAndFila.exercicios.exercicio4;

import EstruturaDeDados.estruturas.pilhaAndFila.fila.Fila;
import EstruturaDeDados.estruturas.pilhaAndFila.pilha.Pilha;

import java.util.Scanner;

public class Exercicio4 {

    static Pilha<Integer> numeros = new Pilha<>();
    static Fila<Integer> pares = new Fila<>();
    static Fila<Integer> impares = new Fila<>();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        inserirNumeros();
        numeros.consultarPilha();
        dividirNumeros();
        pares.consultarFila();
        impares.consultarFila();
    }

    public static void inserirNumeros() {
        int num = 0;
        do {
            System.out.print("Digite um número: ");
            num = in.nextInt();
            numeros.inserir(num);
            System.out.println("Numero inserido!");
        } while (num > 0);
    }

    public static void dividirNumeros() {
        for (int num: numeros.retornaPilha()) {
            if (num % 2 == 0) {
                pares.inserir(num);
            } else {
                impares.inserir(num);
            }
        }
    }
}
