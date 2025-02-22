package EstruturaDeDados.estruturas.listas.exercicios.exercicio4;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListaFuncionarios listaFuncionarios = new ListaFuncionarios();

        System.out.println("Cadastro de Aluno");

        listaFuncionarios.inserirFuncionario("Lucas", 1900 );
        listaFuncionarios.inserirFuncionario("Joao", 800);
        listaFuncionarios.inserirFuncionario("Felipe", 1200);
        listaFuncionarios.inserirFuncionario("Marcos", 2000);
        listaFuncionarios.inserirFuncionario("Maria", 2800);

        listaFuncionarios.valorAReceber();
        System.out.println();
        listaFuncionarios.nomePorLetra('m');
        System.out.println();
        listaFuncionarios.ordemCrescente();
        System.out.println();
        listaFuncionarios.ordemDecrescente();
    }
}
