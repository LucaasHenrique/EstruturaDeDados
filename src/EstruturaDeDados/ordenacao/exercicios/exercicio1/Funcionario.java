package EstruturaDeDados.ordenacao.exercicios.exercicio1;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
      return "Nome: " + nome + ", Salário: " + salario;
    }
}
