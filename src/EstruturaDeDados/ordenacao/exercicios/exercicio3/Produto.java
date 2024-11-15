package EstruturaDeDados.ordenacao.exercicios.exercicio3;

public class Produto {

    int codigo;
    String descricao;
    double preco;

    public Produto(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
   }

    @Override
    public String toString() {
        return "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco;
    }
}
