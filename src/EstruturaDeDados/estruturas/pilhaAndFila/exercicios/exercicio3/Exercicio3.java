package EstruturaDeDados.estruturas.pilhaAndFila.exercicios.exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
        SistemaEscolar sistemaEscolar = new SistemaEscolar();

        sistemaEscolar.cadastrarAluno("Lucas");

        sistemaEscolar.cadastrarAluno("Gabriel");
        sistemaEscolar.cadastrarAluno("Felipe");
        sistemaEscolar.cadastrarAluno("Maria");

        sistemaEscolar.cadastrarNota(3, 8, 9, 4, 8);
        sistemaEscolar.cadastrarNota(2, 7, 9, 9, 3);
        sistemaEscolar.cadastrarNota(1, 5, 8, 2, 10);
        sistemaEscolar.removeNota();
    }
}
