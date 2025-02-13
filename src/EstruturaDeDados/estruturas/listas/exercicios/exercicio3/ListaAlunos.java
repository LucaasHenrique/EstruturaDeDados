package EstruturaDeDados.estruturas.listas.exercicios.exercicio3;

//Lista duplamente encadeada e não ordenada
public class ListaAlunos {

    private static class Alunos {

        String nome;
        double notaFinal;
        Alunos proximo;
        Alunos anterior;

        public Alunos(String nome, double notaFinal) {
            this.nome = nome;
            this.notaFinal = notaFinal;
        }
    }

    Alunos inicio = null;
    Alunos fim = null;
    Alunos atual;

    public void inserirAluno(String nome, double notaFinal) {
        Alunos novo = new Alunos(nome, notaFinal);

        if (inicio == null) {
            inicio = fim = novo;
            novo.proximo = null;
            novo.anterior = null;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            novo.proximo = null;
            fim = novo;
        }
    }

    public void aprovados() {
        atual = inicio;
        int cont = 0;
        if (inicio == null) {
            System.out.println("Lista vazia!!");
        } else {
            System.out.println("Consultando a lista do inicio ao fim");
            atual = inicio;
            while (atual != null) {
                if (atual.notaFinal > 7) {
                    System.out.println("Nome: " + atual.nome + " Nota: " + atual.notaFinal + " Situação: aprovado");
                    cont += 1;
                }
                atual = atual.proximo;
            }

            if (cont == 0) {
                System.out.println("Nenhuma aluno aprovado!!");
            }
        }
    }
}
