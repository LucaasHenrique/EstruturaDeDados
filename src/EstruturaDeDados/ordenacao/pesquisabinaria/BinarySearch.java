package EstruturaDeDados.ordenacao.pesquisabinaria;

public class BinarySearch {
 public static void main(String[] args) {
    int[] list = {1, 3, 5, 7, 9, 13, 17, 20, 26, 33};
    
    System.out.println("Número encontrado na " + binarySearch(list, 13)+"° posição!");
  }

  public static int binarySearch(int[] list, int item) {
    int baixo = 0;
    int alto = list.length - 1;

    while (baixo <= alto) {
      int meio = (baixo + alto) / 2;
      int chute = list[meio];

      if (chute == item) {
        return meio;
      } 
      if (chute > item) {
        alto = meio - 1;
      } else {
        baixo = meio + 1;
      }
    }
    return 0;
  }
}
