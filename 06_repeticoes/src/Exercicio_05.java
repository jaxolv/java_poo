import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, in, out;
        System.out.print("Informe um número inteiro: ");
        n = sc.nextInt();
        in = out = 0;
        System.out.println("Informe " + n + " número(s) inteiro(s): ");
        for (int i = 1; i <= n; i++) {
            x = sc.nextInt();
            sc.nextLine();
            in += (x <= 20 && x >= 10) ? 1 : 0;
            out += (x <= 20 && x >= 10) ? 0 : 1;
        }
        System.out.printf("in: %d%nout: %d%n", in, out);

        sc.close();
    }
}
