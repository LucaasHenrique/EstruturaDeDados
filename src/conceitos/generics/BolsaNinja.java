package conceitos.generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    // Inicializar array
    private List<T> itens;

    public BolsaNinja() {
        this.itens = new ArrayList<>();
    }

    // Colocar itens no array
    public void adicionarItem(T item) {
        itens.add(item);
    }

    public void mostrarItem() {
        for (T item: itens) {
            System.out.println(item);
        }
    }
}
