package program;
import java.util.Locale;
import java.util.Scanner;
import entities.Products;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* int n = sc.nextInt();

        double[] vect = new double[n];

        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double average = sum / n;

        System.out.printf("AVERAGE HEIGTH: %.2f", average); */

        int n = sc.nextInt();
        
        double[] prices = new double[n];
        double sum = 0.0;
        Products prod = new Products();

        for (int i = 0; i < n; i++) {
            prod.setName(sc.next());
            prod.setPrice(sc.nextDouble());
            prices[i] = prod.getPrice();
            sum += prices[i];
        }

        double avg = sum / n;

        System.out.printf("AVERAGE PRICE: %.2f", avg);

        sc.close();
    }
}
