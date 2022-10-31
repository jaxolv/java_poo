import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // resolvendo Bhaskara
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // x = (-b +- sqrt(d)) / 2 * a
        // d = b^2 - 4 * a * c

        double a, b, c, d, x1, x2;

        System.out.print("Informe um valor para a: ");
        a = sc.nextDouble();
        sc.nextLine();
        System.out.print("Informe um valor para b: ");
        b = sc.nextDouble();
        sc.nextLine();
        System.out.print("Informe um valor para c: ");
        c = sc.nextDouble();
        sc.nextLine();

        d = Math.abs(Math.pow(b, 2.0) - 4.0 * a * c);
        // vou passar o MATH.ABS() à nível de exemplo.
        x1 = (-b + Math.sqrt(d)) / (2.0 * a);
        x2 = (-b - Math.sqrt(d)) / (2.0 * a);

        System.out.printf("x1 = %.2f%n", x1);
        System.out.printf("x2 = %.2f%n", x2);

        sc.close();
    }
}
