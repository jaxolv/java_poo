import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe dois valores para X e Y:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto");
            } else {
                break;
            }
            System.out.println("Informe mais dois valores: ");
            x = sc.nextInt();
            y = sc.nextInt();
        };

        sc.close();
    }
}
