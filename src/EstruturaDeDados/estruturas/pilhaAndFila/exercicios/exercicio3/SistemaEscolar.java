package EstruturaDeDados.estruturas.pilhaAndFila.exercicios.exercicio3;

import EstruturaDeDados.estruturas.pilhaAndFila.fila.Fila;
import EstruturaDeDados.estruturas.pilhaAndFila.pilha.Pilha;

import java.text.MessageFormat;
import java.util.*;

public class SistemaEscolar {

    private static class GeradorMatricula {
        private static int ID = 1;

        private static int getProximaMatricula() {
            return ID++;
        }
    }

    private final Pilha<Aluno> alunos = new Pilha<>();
    private final Fila<Nota> notas = new Fila<>();

    public void cadastrarAluno(String nome) {
        Aluno novoAluno = new Aluno(GeradorMatricula.getProximaMatricula(), nome);
        alunos.inserir(novoAluno);
        System.out.println("Aluno cadastrado!");
    }

    public void consultarAlunos() {
        alunos.consultarPilha();
    }

    // cadastrar o id e nota do aluno
    // muito feio esse codigo
    public void cadastrarNota(int id, double... notasAluno) {
        Optional<Aluno> aluno = alunos.retornaPilha().stream()
                .filter(a -> a.getNumero() == id)
                .findFirst();

        if (aluno.isPresent()) {
            var alunoId = aluno.get().getNumero();
            Nota notaAluno = new Nota(alunoId);
            for (double nota: notasAluno) {
                notaAluno.addNota(nota);
            }

            notas.inserir(notaAluno);
        } else {
            System.out.println("Nota não cadastrada");
            System.out.println("Aluno não encontrado!\n");
        }

//        aluno.ifPresentOrElse(
//                a -> {
//                    Nota notaAluno = new Nota(a.getNumero());
//                    for (double nota : notasAluno) {
//                        notaAluno.addNota(nota);
//                    }
//                    notas.inserir(notaAluno);
//                    System.out.println("Nota cadastrada com sucesso!");
//                },
//                () -> {
//                    System.out.println("Aluno não encontrado!");
//                }
//        );
    }

    public void consultarNotas() {
        notas.consultarFila();
    }

    public void consultarMediaById(int id) {
        Aluno alunoEncontrado = null;
        for (Aluno aluno: alunos.retornaPilha()) {
            if (id == aluno.getNumero()) {
                alunoEncontrado = aluno;
                break;
            }
        }

        if (alunoEncontrado == null) {
            System.out.println("Aluno não cadastrado!!");
            return;
        }

        List<Double> notasAluno = new ArrayList<>();
        for (Nota nota: notas.retornaFila()) {
            if (id == nota.getNumero()) {
                notasAluno.addAll(nota.getNotas());
            }
        }

        if (notasAluno.isEmpty()) {
            System.out.println("Aluno sem notas!");
            return;
        }

        System.out.println(MessageFormat.format("Nome: {0}", alunoEncontrado.getNome()));
        System.out.println(MessageFormat.format("Média do aluno = {0}", media(notasAluno)));
    }

    private double media(List<Double> notas) {
        double soma = 0;
        for (double nota: notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public void consultarAlunoSemNotas() {
        // Solução O(n + m)
        HashSet<Integer> alunoComNota = new HashSet<>();

        for (Nota nota: notas.retornaFila()) {
            alunoComNota.add(nota.getNumero());
        }

        for (Aluno aluno: alunos.retornaPilha()) {
            if (!alunoComNota.contains(aluno.getNumero())) {
                System.out.println("Aluno " + aluno.getNumero() + " não possui nota!");
            }
        }

       //Solução O(n^2)
        /*for (Aluno aluno: alunos.retornaPilha()) {
            boolean alunoComNota = false;

            for (Nota nota: notas.retornaFila()) {
                if (aluno.getNumero() == nota.getNumero()) {
                    alunoComNota = true;
                    break;
                }
            }

            if (!alunoComNota) {
                System.out.println("Aluno " + aluno.getNumero() + " não possui nota!");
            }
        }*/
    }

    public void removerAluno() {
        HashSet<Integer> alunoComNota = new HashSet<>();

        for (Nota nota: notas.retornaFila()) {
            alunoComNota.add(nota.getNumero());
        }

        Aluno alunoTopo = alunos.topoPilha();
        boolean temNota = false;
        for (Nota nota: notas.retornaFila()) {
            if (alunoTopo.getNumero() == nota.getNumero()) {
                temNota = true;
                break;
            }
        }

        if (!temNota) {
            System.out.println("removendo da pilha de alunos: ");
            alunos.remove();
        } else {
            System.out.println(MessageFormat.format("Não é possível remover {0}, pois ele tem nota registrada.", alunoTopo.getNome()));
        }
    }

    public void removeNota() {
        notas.remove();
    }
}
