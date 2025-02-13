package EstruturaDeDados.estruturas.listas.exercicios.exercicio3;

import EstruturaDeDados.estruturas.listas.exercicios.exercicio2.ListaFuncionario;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaAlunos alunos = new ListaAlunos();

        System.out.println("Cadastro de Aluno");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Aluno %d%n", i + 1);
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Nota: ");
            double nota = scanner.nextDouble();
            alunos.inserirAluno(nome, nota);
        }

        alunos.aprovados();
    }
}
