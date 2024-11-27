package EstruturaDeDados.ordenacao.exercicios.exercicio4;

public class Aluno {

    String name;
    double nota1;
    double nota2;

    public Aluno(String name, double nota1, double nota2) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return
                name  +
                ", [nota1=" + nota1 +
                ", nota2=" + nota2 + "]";
    }
}
