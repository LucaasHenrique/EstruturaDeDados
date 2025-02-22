package EstruturaDeDados.estruturas.listas.exercicios.exercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListaNumerosPares listaNumerosPares = new ListaNumerosPares();
        ListaNumerosImp listaNumerosImp = new ListaNumerosImp();
        ListaNumerosGeral listaNumerosGeral = new ListaNumerosGeral();

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o numero: ");
            int num = in.nextInt();

            if (num % 2 == 0) {
                listaNumerosPares.adicionarNumeroPar(num);
            } else {
                listaNumerosImp.adicionarNumeroImpar(num);
            }
        }

        //listaNumerosPares.mostrarNumeros();
        //listaNumerosImp.mostrarNumeros();
        for (Integer num: listaNumerosPares.retornaNumero()) {
            listaNumerosGeral.adicionarNumeros(num);
        }

        for (Integer num: listaNumerosImp.retornaNumero()) {
            listaNumerosGeral.adicionarNumeros(num);
        }

        listaNumerosGeral.ordemCrescente();
        listaNumerosGeral.ordemDecrescente();
    }
}
