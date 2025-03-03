package EstruturaDeDados.estruturas.pilhaAndFila.exercicios.exercicio5;

public class Exercicio5 {

    public static void main(String[] args) {
        ProdutoManager produtoManager = new ProdutoManager();

        produtoManager.inserirTipo('c', 14);
        produtoManager.inserirTipo('a', 10);
        produtoManager.inserirTipo('b', 10);
        produtoManager.consultarTipos();
        produtoManager.inserirProduto('b', "Geladeira", 5000);
        produtoManager.inserirProduto('a', "Book 4", 3600);
        produtoManager.consultarProdutos();
        produtoManager.consultarPreco(2);
        produtoManager.removeTipo();
        produtoManager.consultarTipos();
        produtoManager.removeTipo();
        produtoManager.consultarTipos();
    }
}
