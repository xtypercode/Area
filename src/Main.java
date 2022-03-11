import java.util.Scanner;
import java.math.MathContext;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, raio;

        raio = sc.nextDouble();
        area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("Area = %.4f\n", area);
    }
}