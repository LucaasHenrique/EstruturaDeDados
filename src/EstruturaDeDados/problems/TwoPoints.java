package EstruturaDeDados.problems;

import java.util.Scanner;

public class TwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x1, y1, x2, y2;

        x1 = in.nextDouble();
        y1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.printf("%.2f", distancia);
    }
}
