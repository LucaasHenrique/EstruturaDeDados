package EstruturaDeDados.ordenacao.pesquisabinaria;

import java.util.Scanner;

public class PesquisaBinaria {

  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int X[] = new int[10];
    int np, i, inicio, fim, meio, achou;
    
    for(i = 0; i<X.length; i++) {
      System.out.print("informe o numero " + (i+1)+"° numero: ");
      X[i] = in.nextInt();
    }

    System.out.print("informe o numero a ser buscado: ");
    np = in.nextInt();

    achou = 0;
    inicio = 0;
    fim = X.length - 1;
    meio = (inicio + fim) / 2;

    while (inicio <= fim && achou == 0) {
      if (X[meio] == np) {
        achou = 1;
      } else {
        if (np < X[meio]){
          fim = meio - 1;
        } else {
          inicio = meio + 1;
          meio = (inicio + fim) / 2;
        }
      }
    }

    if (achou == 0) {
      System.out.println("Numero não encontrado no vetor!");
    } else {
      System.out.println("Número encontrado na posição " + meio);
    }
  }
}
