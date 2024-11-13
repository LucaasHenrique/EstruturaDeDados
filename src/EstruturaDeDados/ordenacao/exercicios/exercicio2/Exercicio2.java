package EstruturaDeDados.ordenacao.exercicios.exercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i=0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = in.nextInt();
        }

        System.out.println("números não ordenados "+Arrays.toString(numeros));
        System.out.println("números ordenados: "+ Arrays.toString(insertionSort(numeros)));
        menor(numeros);
        maior(numeros);
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int eleito = array[i];
            int j;
            for (j = i - 1; (j >= 0) && (array[j] > eleito); j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = eleito;
        }
        return array;
    }


    public static void menor(int[] array) {
        int menor = array[0];
        int cont = 0;

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num < menor) {
                menor = num;
                cont = 1; // primeira aparição do menor númeoro
            } else if (num == menor) {
                cont += 1;
            }
        }
        System.out.println("menor: " + menor + ", quantas vezes apareceu: " + cont);
    }

    public static void maior(int[] array) {
        int maior = array[0];
        int cont = 0;

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num > maior) {
                maior = num;
                cont = 1;
            } else if (num == maior) {
                cont += 1;
            }
        }
        System.out.println("maior: " + maior + ", quantas vezes apareceu: " + cont);
    }
}
