package EstruturaDeDados.estruturas.listas.exercicios.exercicio1;

// Lista simplesmente encadeada e não ordenada
public class ListaProdutos {

    Produto inicio = null;

    public ListaProdutos() {
        this.inicio = null;
    }

    public void adicionarProduto(int codigo, double preco, int quantidade){
        Produto novo = new Produto(codigo, preco, quantidade);
        if (inicio == null) {
            inicio = novo;
        } else {
            Produto atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    public void aplicarDesconto() {
        Produto atual = inicio;
        while (atual != null) {
            atual.preco = desconto(atual.preco);
            atual = atual.proximo;
        }
    }

    public void relatorio() {
        Produto atual = inicio;
        int qtde = 0;

        while (atual != null) {
            System.out.println("Codigo: " + atual.codigo + ", Preço: " + atual.preco);
            if (atual.quantidade > 500) {
                qtde += 1;
            }
            atual = atual.proximo;
        }
        System.out.printf("Quantidade de produtos com estoque superior a 500: %d%n", qtde);
    }

    public double desconto(double preco) {
        return preco * 0.9;
    }
}
