package EstruturaDeDados.estruturas.pilhaAndFila.exercicios.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Nota {

    private int numero;
    private List<Double> notas;

    public Nota(int numero) {
        this.numero = numero;
        this.notas = new ArrayList<>();
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void addNota(double nota) {
        notas.add(nota);
    }

    @Override
    public String toString() {
        return "Nota{" +
                "numero=" + numero +
                ", notas=" + notas +
                '}';
    }
}
