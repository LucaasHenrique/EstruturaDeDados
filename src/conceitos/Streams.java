package conceitos;
import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("maça");
        frutas.add("banana");
        frutas.add("uva");

        // :: -> metodo de referencia
        frutas.stream().forEach(System.out::println);
        frutas.stream().forEach(item -> System.out.println(item));

        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(8);
        nums.add(1);

        // nums.stream().forEach(calculadora::soma());
    }

    private class calculadora {
        public static void soma(Integer integer) {
        }
    }
}
