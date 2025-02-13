package EstruturaDeDados.estruturas.listas.exercicios.exercicio2;

import EstruturaDeDados.estruturas.listas.exercicios.exercicio1.ListaProdutos;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaFuncionario lista = new ListaFuncionario();

        System.out.println("Cadastro de Funcionario");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Funcionario %d%n", i + 1);
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            lista.adicionarFuncionario(nome, salario);
        }

        lista.consultarElementos();
        lista.maiorSalario();
        lista.mediaSalario();
        lista.salarioMaiorQue(1500);
    }
}
