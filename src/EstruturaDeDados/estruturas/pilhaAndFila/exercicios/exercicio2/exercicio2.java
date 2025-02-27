package EstruturaDeDados.estruturas.pilhaAndFila.exercicios.exercicio2;

import EstruturaDeDados.estruturas.pilhaAndFila.pilha.Pilha;

import java.util.*;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pilha<Integer> numeros = new Pilha<>();
        int op;

        do {
            menu();
            System.out.print("Sua opção: ");
            op = in.nextInt();

            switch (op){
                case 1:
                    System.out.println("Numero: ");
                    int num = in.nextInt();
                    numeros.inserir(num);
                    break;
                case 2:
                    List<Integer> list = numeros.retornaPilha();
                    for (int i = 1; i < list.size() - 1; i++) {
                        if (list.get(i) % 2 == 0) {
                            System.out.println(list.get(i));
                        }
                    }
                    break;
                case 3:
                    numeros.remove();
                    break;
                default:
                    System.out.println("Opção invalida!");
            }

        } while (op != 4);
        System.out.println("saindo...");
    }

    public static void menu() {
        System.out.println("MENU\n" +
                "1 - Cadastrar número\n" +
                "2 - Mostrar números pares entre o primeiro e o ultimo numero cadastrado\n" +
                "3 - Excluir número\n" +
                "4 - Sair\n");
    }

}
