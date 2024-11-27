package EstruturaDeDados.ordenacao.exercicios.exercicio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio4 {
  
  public static void main(String[] args) {
    Aluno[] alunos = {
            new Aluno("Lucas", 7.5, 8.0),
            new Aluno("Ana", 6.0, 5.5),
            new Aluno("Carlos", 9.0, 8.5),
            new Aluno("Beatriz", 4.5, 6.0),
            new Aluno("Pedro", 7.0, 7.5),
            new Aluno("Fernanda", 8.5, 9.0),
            new Aluno("João", 5.5, 4.0),
            new Aluno("Mariana", 6.5, 7.0)
    };
  
    System.out.println("media: " + mediaPond(alunos[0].nota1, alunos[0].nota2));
    System.out.println("Alunos não ordenados: " + Arrays.toString(alunos));
    for (Aluno aluno: ordenacao(alunos)) {
        System.out.println("Alunos ordenados: " + aluno + ", media ponderada = " + mediaPond(aluno.nota1, aluno.nota2));
    }

    System.out.println();

    for (Aluno aluno: bubbleSort(alunos)) {
        System.out.println("Alunos ordenados: " + aluno);
    }

    System.out.println();

    for (Aluno aluno: ordemAlfabetica(alunos)) {
        System.out.println("Alunos em ordem alfabetica: " + aluno);
    }

  }

  public static double mediaPond(double nota1, double nota2){
      double media = ((nota1 * 2) + (nota2 * 3)) / 5;
      return media;
  }

  public static Aluno[] ordenacao(Aluno[] alunos){
      for (int i = 0; i<=alunos.length-1; i++) {
          int menor = i;

          for (int j = i + 1; j < alunos.length; j++) {
              if (mediaPond(alunos[j].nota1, alunos[j].nota2) < mediaPond(alunos[menor].nota1, alunos[menor].nota2)) {
                  menor = j;
              }
          }

          if (menor != i) {
              Aluno temp = alunos[i];
              alunos[i] = alunos[menor];
              alunos[menor] = temp;
          }
      }

      return alunos;
  }

  public static Aluno[] bubbleSort(Aluno[] alunos){
      for (int i = 0; i < alunos.length - 1; i++) {
          for (int j = 0; j < alunos.length - i - 1; j++) {
              if (alunos[j].nota1 > alunos[j + 1].nota1) {
                  Aluno aux = alunos[j];
                  alunos[j] = alunos[j + 1];
                  alunos[j + 1] = aux;
              }
          }
      }
      return alunos;
  }

  // refazer esse depois
  public static List<Aluno> ordemAlfabetica(Aluno[] alunos){
      List<Aluno> reprovados = new ArrayList<>();
      for (Aluno aluno: alunos) {
          if (mediaPond(aluno.nota1, aluno.nota2) < 7) {
              reprovados.add(aluno);
          }
      }

      for (int i = 0; i < reprovados.size() - 1; i++) {
          for (int j = 0; j < reprovados.size() - i - 1; j++) {
              if (comparaNome(reprovados.get(j).name, reprovados.get(j + 1).name) > 0) {
                  Aluno aux = reprovados.get(j);
                  reprovados.set(j, reprovados.get(j + 1));
                  reprovados.set(j + 1, aux);
              }
          }
      }
      return reprovados;
  }

  public static int comparaNome(String nome1, String nome2) {
      int len = Math.min(nome1.length(), nome2.length());

      for (int i = 0; i < len; i++) {
          char char1 = nome1.charAt(i);
          char char2 = nome2.charAt(i);
          if (char1 != char2) {
              return char1 - char2;
          }
      }
      return nome1.length() - nome2.length();
  }
}
