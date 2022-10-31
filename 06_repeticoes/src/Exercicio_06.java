import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int n = sc.nextInt();
        System.out.println("Informe três valores reais por " + n + " vezes.");
        for (int i = 0; i < n; i++) {
            double A = sc.nextDouble();
            double B = sc.nextDouble();
            double C = sc.nextDouble();
            double MP = (A * 2.0 + B * 3.0 + C * 5.0) / 10.0;
            System.out.printf("%.1f%n", MP);
        }

        sc.close();
    }
}
