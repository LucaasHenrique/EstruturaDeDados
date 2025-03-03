package EstruturaDeDados.estruturas.pilhaAndFila.exercicios.exercicio5;

public class Produto {

    private int numero;
    private char tipo;
    private String nome;
    private double preco;

    public Produto(int numero, char tipo, String nome, double preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.nome = nome;
        this.preco = preco;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "numero=" + numero +
                ", tipo=" + tipo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
