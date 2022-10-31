import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso. */
        int x, mod;
        // String msg;
        System.out.print("Informe um número de 1 até 1000: ");
        x = sc.nextInt();
        for (int i = 0; i <= x; i++) {
            mod = i % 2;
            if (mod == 1) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
