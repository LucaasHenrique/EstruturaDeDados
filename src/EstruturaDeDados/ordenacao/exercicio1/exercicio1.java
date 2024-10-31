package EstruturaDeDados.ordenacao.exercicio1;
import EstruturaDeDados.ordenacao.exercicio1.Funcionario;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio1 {

    private static Funcionario[] funcionarios = new Funcionario[5];
    private static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        cadastrarFuncionario();
        System.out.println(Arrays.toString(bubbleSort(funcionarios)));
        System.out.println(Arrays.toString(insertionSort(funcionarios)));
    }

    public static void cadastrarFuncionario() {
        for (int i = 0; i <= funcionarios.length - 1; i++) {

            System.out.print("informe o nome: ");
            String nome = in.nextLine();

            System.out.print("informe o salário: ");
            double salario = in.nextDouble();
            in.nextLine();

            funcionarios[i] = new Funcionario(nome, salario);
        }
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
}
