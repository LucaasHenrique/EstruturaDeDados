package EstruturaDeDados.ordenacao.exercicios.exercicio1;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class exercicio1 {

    private static Funcionario[] funcionarios = {
            new Funcionario("Carlos", 2500.0),
            new Funcionario("Ana", 3000.0),
            new Funcionario("Bruno", 2000.0),
            new Funcionario("Alice", 4000.0),
            new Funcionario("Lucas", 1200.0)
    };
    private static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(funcionarios)));
        System.out.println(Arrays.toString(insertionSort(funcionarios)));
        System.out.println(Arrays.toString(ordemAlfabetica(funcionarios)));
    }


    public static Funcionario[] bubbleSort(Funcionario[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int n = 0; n < array.length - i - 1; n++) {
                if (array[n].salario > array[n + 1].salario) {
                    Funcionario aux = array[n];
                    array[n] = array[n + 1];
                    array[n + 1] = aux;
                }
            }
        }
        return array;
    }

    // ordenaçao decrescente

    public static Funcionario[] insertionSort(Funcionario[] array) {
        for (int i = 1; i<array.length; i++) {
            Funcionario eleito = array[i];
            int j;

            for (j = i-1; (j>=0) && (array[j].salario < eleito.salario); j--) {
                array[j+1] = array[j];
            }
            array[j+1] = eleito;
        }

        return array;
    }

    public static Funcionario[] ordemAlfabetica(Funcionario[] array) {
        int n = array.length;
        for (int i = 0;  i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (comparaNomes(array[j].nome, array[j + 1].nome) > 0) {
                    Funcionario temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /*public static int numAscii(char caractere) {
        int valorAscii = (int) caractere;
        return valorAscii;
    }*/

    public static int comparaNomes(String nome1, String nome2) {
        int len = Math.min(nome1.length(), nome2.length());

        for (int i = 0; i < len; i++) {
            char char1 = nome1.charAt(i);
            char char2 = nome2.charAt(i);
            if (char1 != char2) {
                return char1 - char2;
            }
        }

        return nome1.length() - nome2.length();
    }
}
