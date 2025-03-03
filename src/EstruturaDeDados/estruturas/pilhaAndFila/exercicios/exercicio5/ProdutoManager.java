package EstruturaDeDados.estruturas.pilhaAndFila.exercicios.exercicio5;

import EstruturaDeDados.estruturas.pilhaAndFila.fila.Fila;

import java.util.HashSet;

public class ProdutoManager {

    private static class GeradorMatricula {
        private static int ID = 1;

        private static int getProximaMatricula() {
            return ID++;
        }
    }

    Fila<Tipo> tipos = new Fila<>();
    Fila<Produto> produtos = new Fila<>();

    public void inserirTipo(char tipo, double percentualImposto) {
        char tipo1 = Character.toUpperCase(tipo);
        double newPercentualImposto = percentualImposto / 100;
        Tipo tipoProduto = new Tipo(tipo1, newPercentualImposto);
        tipos.inserir(tipoProduto);
    }

    public void consultarTipos() {
        tipos.consultarFila();
    }

    public void inserirProduto(char tipo, String nome, double preco) {
        char tipoProduto = Character.toUpperCase(tipo);

        boolean tipoCadastrado = false;
        for (Tipo tipo2: tipos.retornaFila()) {
            if (tipoProduto == tipo2.getTipo()) {
                tipoCadastrado = true;
                break;
            }
        }

        if (tipoCadastrado) {
            Produto produto = new Produto(GeradorMatricula.getProximaMatricula(), tipoProduto, nome, preco);
            produtos.inserir(produto);
        } else {
            System.out.println("Produto sem tipo cadastrado!");
        }
    }
    
    public void consultarProdutos() {
        produtos.consultarFila();
    }

    public void consultarPreco(int numero) {
        boolean numNaLista = false;
        Produto produtoNaLista = null;

        for (Produto produto: produtos.retornaFila()) {
            if (numero == produto.getNumero()) {
                numNaLista = true;
                produtoNaLista = produto;
                break;
            }
        }

        if (numNaLista) {
            for (Tipo tipo: tipos.retornaFila()) {
                if (produtoNaLista.getTipo() == tipo.getTipo()) {
                    double newPreco = produtoNaLista.getPreco() + (produtoNaLista.getPreco() * tipo.getPercentualImposto());
                    System.out.println("Produto: " + produtoNaLista.getNome() + " | Preço: " + newPreco);
                    break;
                }
            }
        } else {
            System.out.println("Produto não está na cadastrado!!");
        }
    }

    public void removeTipo() {
        Tipo tipoInicio = tipos.retornaInicio();

        boolean tipoEmProduto = false;
        for (Produto produto: produtos.retornaFila()) {
            if (tipoInicio.getTipo() == produto.getTipo()) {
                tipoEmProduto = true;
                break;
            }
        }

        if (tipoEmProduto) {
            System.out.println("Tipo com produto cadastrado! remoçao proibida");
        } else {
            tipos.remove();
        }
    }
}
