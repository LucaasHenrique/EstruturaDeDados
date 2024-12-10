package EstruturaDeDados.estruturas.listas.exercicios.exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaProdutos lista = new ListaProdutos();

        System.out.println("Cadastro de Produtos");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Produto %d%n", i + 1);
            System.out.print("Código: ");
            int codigo = scanner.nextInt();
            System.out.print("Preço: ");
            double preco = scanner.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            lista.adicionarProduto(codigo, preco, quantidade);
        }

        System.out.print("Digite a taxa de desconto (em %): ");
        double taxaDesconto = scanner.nextDouble();

        lista.aplicarDesconto();
        lista.relatorio();
    }
}
