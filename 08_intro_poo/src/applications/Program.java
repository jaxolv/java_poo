package applications;

// import entities.Triangle;
import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    /* public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();
        
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    } */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product tv = new Product(name, price);

        tv.setName("PC");
        System.out.println("Updated name: " + tv.getName());
        tv.setPrice(1200.00);
        System.out.println("Updated price: " + tv.getPrice());
        System.out.println("Quantity: " + tv.getQuantity());

        System.out.printf("Product data: %s%n", tv.toString());
        
        System.out.print("Enter the number of products to be added in stock: ");
        tv.addProducts(sc.nextInt());

        System.out.printf("Updated data: %s%n", tv.toString());
        
        System.out.print("Enter the number of products to be removed in stock: ");
        tv.removeProducts(sc.nextInt());

        System.out.printf("Updated data: %s%n", tv.toString());

        sc.close();
    }
}
