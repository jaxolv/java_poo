import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        /* 
        int n1 = 89; // 0101 1001
        int n2 = 60; // 0011 1100
        System.out.println(n1 & n2); // 0101 1001 & 0011 1100 = n1[0] & n2[0] + ... + n1[8] & n2[8] = 0001 1000
        System.out.println(n1 | n2); // 0101 1001 | 0011 1100 = n1[0] | n2[0] + ... + n1[8] | n2[8] = 0111 1101
        System.out.println(n1 ^ n2); // 0101 1001 ^ 0011 1100 = n1[0] ^ n2[0] + ... + n1[8] ^ n2[8] = 0110 0101
         */

        Scanner sc = new Scanner(System.in);
        int mask = 0b1000000; // nº 32 em formato binário. "0b" na frente indica que um número binário está sendo informado no restante da linha (0010 0000 = 32).
        int n = sc.nextInt();
        if ((mask & n) != 0) {
            System.out.printf("6th bit of the number %d is true!", n);
        } else {
            System.out.printf("6th bit of the number %d is false!", n);
        }
        sc.close();
    }
}
