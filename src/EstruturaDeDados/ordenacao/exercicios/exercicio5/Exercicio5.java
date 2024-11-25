package EstruturaDeDados.ordenacao.exercicios.exercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {
  
  public static void main(String[] args) {
  
    Scanner in = new Scanner(System.in);
    int[] numeros = new int[15];

    for (int i=0; i < numeros.length; i++) {
      System.out.println("Digite um número: ");
      int num = in.nextInt();
 
      if (existsIn(numeros, num)) {
        System.out.println("Número ja cadastrado!!");
        i--;
      } else {
        numeros[i] = num;
      }
    }

    System.out.println("números não ordenados: " + Arrays.toString(numeros));
    System.out.println("números ordenados: " + Arrays.toString(insertionSort(numeros)));
    binarySearch(numeros, 15);
    buscaSequencial(numeros, 15);
  }

  public static boolean existsIn(int[] numeros, int numero) {
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] == numero) {
        return true;
      }
    }
    return false;
  }

  public static int[] insertionSort(int[] numeros) {
    
    for (int i = 1; i < numeros.length; i++) {
      int eleito = numeros[i];

      int j;

      for (j = i - 1; (j >= 0) && (numeros[j] > eleito); j--) {
        numeros[j+1] = numeros[j];
      }
      numeros[j+1] = eleito;
    }  
    return numeros;
  }

  public static void binarySearch(int[] numeros, int item) {
    int baixo = 0;
    int alto = numeros.length - 1;
    
    while (baixo <= alto) {
      int meio = (baixo + alto) / 2;
      int chute = numeros[meio];

      if (chute == item) {
        System.out.println("Produto buscado: " + numeros[meio]);
        System.out.println("Posição no vetor: " + meio);

        if (meio % 2 == 0) {
          System.out.println("Posição par!");
        } else {
           System.out.println("Posição impar!");
        } 
      } if (chute > item) {
        alto = meio - 1;
      } else {
        baixo = meio + 1;
      }
    }
  }

  public static void buscaSequencial(int[] numeros, int item) {

  for (int i = 0; i <= numeros.length-1; i++) {
    if (numeros[i] == item) {
      System.out.println("Numero encontrado na posição " + (i));
        if ((i) % 2 == 0) {
          System.out.println("Posição par!");
        } 
        System.out.println("Posição impar!");
        break;
      }
    }
  }
}

