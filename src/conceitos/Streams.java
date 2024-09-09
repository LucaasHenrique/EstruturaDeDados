package conceitos;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("maça");
        frutas.add("banana");

        frutas.stream().forEach(System.out::println);
    }
}
