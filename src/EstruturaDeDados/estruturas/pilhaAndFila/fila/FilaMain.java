package EstruturaDeDados.estruturas.pilhaAndFila.fila;

public class FilaMain {

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        fila.inserir(5);
        fila.inserir(8);
        fila.inserir(2);
        fila.inserir(20);
        fila.inserir(4);

        fila.consultarFila();
        fila.remove();
        fila.consultarFila();
        System.out.println();
        fila.remove();
        fila.consultarFila();
        System.out.println();
        fila.esvaziarFila();
    }
}
