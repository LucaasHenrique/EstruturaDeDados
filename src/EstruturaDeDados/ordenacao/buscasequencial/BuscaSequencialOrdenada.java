package EstruturaDeDados.ordenacao.buscasequencial;

import java.util.Scanner;

public class BuscaSequencialOrdenada {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X[] = new int[10];
        int n, i, achou;
    
        for (i = 0; i < 9; i++) {
           System.out.print("Digite o " +(i + 1)+"° numero: " );
           X[i] = in.nextInt();
        }
      
        System.out.print("Digite o numero a ser buscado no vetor: ");
        n = in.nextInt();

        achou = 0;
        i = 0;
          
        while (i <= 9 && achou == 0 && n >= X[i]){
            
            if (X[i] == n) {
                achou = 1;
            } else {
                i++;
            }
        }

        if (achou == 0) {
            System.out.println("Numero nao encontrado no vetor!");
        } else {
            System.out.println("Numero encontrado na posição " + (i+1));
        }
    }
}
