package EstruturaDeDados.estruturas.Heaps.heapMaximo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HeapMaximo heapMaximo = new HeapMaximo();
        int op;
        do {
            System.out.println("MENU - HEAP MÁXIMO\n");
            System.out.println("1 - Inserir elemento na lista de prioridades");
            System.out.println("2 - Consultar o elemento de maior prioridade");
            System.out.println("3 - Remover elemento de maior prioridade");
            System.out.println("4 - Consultar toda a lista");
            System.out.println("5 - Sair");
            System.out.print("Digite sua opção: ");
            op = in.nextInt();

            if (op < 1 || op > 5)
                System.out.println("Opção inválida!");

            switch (op) {
                case 1:
                    System.out.print("Digite o número: ");
                    int num = in.nextInt();
                    heapMaximo.inserir(num);
                    break;
                case 2:
                    heapMaximo.consultarElementoMaiorPrioridade();
                    break;
                case 3:
                    heapMaximo.remover();
                    break;
                case 4:
                    heapMaximo.consultarLista();
                    break;
            }

        } while (op != 5);
    }

}
