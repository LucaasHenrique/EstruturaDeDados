package conceitos.generics;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarItem(new Kunai("Kunai explosiva"));
        bolsaNinja.adicionarItem(new Shuriken(3));
        bolsaNinja.adicionarItem(new Pergaminho("Invocaçao do sapo"));

        System.out.println("Itens na bolsa ninja");
        bolsaNinja.mostrarItem();
    }
}
