package EstruturaDeDados.ordenacao.exercicios.exercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Produto[] produtos = {
                new Produto(102, "Notebook", 3500.00),
                new Produto(101, "Mouse", 50.00),
                new Produto(105, "Teclado", 150.00),
                new Produto(104, "Monitor", 1200.00),
                new Produto(109, "Impressora", 800.00),
                new Produto(103, "Headset", 200.00),
                new Produto(107, "Smartphone", 2500.00),
                new Produto(106, "Cadeira Gamer", 600.00),
                new Produto(111, "SSD", 400.00),
                new Produto(110, "Placa de Vídeo", 1500.00),
                new Produto(108, "Fonte de Alimentação", 300.00),
                new Produto(112, "Gabinete", 450.00)
        };

        System.out.println("Produtos ordenados: "+Arrays.toString(insertionSort(produtos)));
        buscaSequencial(produtos, 102);
        System.out.println("Codigo do produto a ser buscado: ");
        int item = in.nextInt();
        binarySearch(produtos, item);
    }

    public static Produto[] insertionSort(Produto[] produtos) {
        for (int i = 1; i<produtos.length; i++){
            Produto eleito = produtos[i];
            int j;

            for (j = i - 1; (j >= 0) && (produtos[j].codigo > eleito.codigo); j--) {
                produtos[j+1] = produtos[j];
            }
            produtos[j+1] = eleito;
        }
        return produtos;
    }

    public static void binarySearch(Produto[] produtos, int item) {
        int baixo = 0;
        int alto = produtos.length - 1;
        int cont = 0;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = produtos[meio].codigo;

            if (chute == item) {
                System.out.println("Produto buscado: " + produtos[meio]);
                System.out.println("Posição no vetor: " + meio);
            } if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
            cont += 1;
        }
        System.out.println("Quantidade de comparaçoes: " + cont);
    }

    public static void buscaSequencial(Produto[] produtos, int item) {
        int achou = 0;

        for (int i = 0; i <= produtos.length-1; i++) {
            if (produtos[i].codigo == item) {
                System.out.println("Numero encontrado na posição " + (i+1));
                System.out.println("Quantidade de comparações: " + i);
                break;
            }
        }
    }
}
