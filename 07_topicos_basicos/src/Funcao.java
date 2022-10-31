import java.util.Scanner;

public class Funcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe 3 números inteiros e difernetes: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = max(a, b, c);
        System.out.println(max);
        sc.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }
}
