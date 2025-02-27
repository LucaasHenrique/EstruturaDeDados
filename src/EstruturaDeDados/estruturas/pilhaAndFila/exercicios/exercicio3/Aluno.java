package EstruturaDeDados.estruturas.pilhaAndFila.exercicios.exercicio3;

import java.util.List;

public class Aluno {

    private int numero;
    private String nome;

    public Aluno(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
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

    @Override
    public String toString() {
        return STR."Aluno{numero=\{numero}, nome='\{nome}'";
    }
}
