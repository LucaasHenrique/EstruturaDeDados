package EstruturaDeDados.estruturas.pilhaAndFila.exercicios.exercicio5;


public class Tipo {

    private char tipo;
    private double percentualImposto;

    public Tipo(char tipo, double percentualImposto) {
        this.tipo = tipo;
        this.percentualImposto = percentualImposto;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getPercentualImposto() {
        return percentualImposto;
    }

    public void setPercentualImposto(double percentualImposto) {
        this.percentualImposto = percentualImposto;
    }

    @Override
    public String toString() {
        return "Tipo{" +
                "tipo=" + tipo +
                ", percentualImposto=" + percentualImposto +
                '}';
    }
}
