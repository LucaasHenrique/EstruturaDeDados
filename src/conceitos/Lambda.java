package conceitos;

public class Lambda {

    public interface FactorNumber {
        boolean isFactor(int a, int b);
    }

    public static void main(String[] args) {
        FactorNumber isFactor = (a, b) -> (b % a == 0);

        if (isFactor.isFactor(9, 5)) {
            System.out.println("5 is a factor of 9");
        } else {
            System.out.println("5 is not a factor of 9");
        }
    }
}
