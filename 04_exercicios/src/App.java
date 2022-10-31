import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // 1º exercício
        /* int a, b, r;
        System.out.print("Informe o primeiro número para soma: ");
        a = sc.nextInt();
        sc.nextLine();
        System.out.print("Informe o segundo número para soma: ");
        b = sc.nextInt();
        sc.nextLine();
        r = a + b;
        System.out.println("O resultado é " + r); */

        // 2º exercício - com Locale.US;
        /* double area, raio;
        System.out.print("Informe um valor para o raio da circunferência: ");
        raio = sc.nextDouble();
        sc.nextLine();
        area = 3.14159 * Math.pow(raio, 2);
        System.out.printf("A área de uma circunferência de raio igual a %.2f é igual a %.4f%n", raio, area); */

        // 3º exercício
        /* int A, B, C, D, DIF;
        System.out.print("Informe, em sequência, 4 valores inteiros: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        DIF = (A * B) - (C * D);
        System.out.println("DIFERENÇA = " + DIF); */

        // 4º exercício
        /* int number, hrs;
        double salPerHour, salary;
        System.out.print("Informe seu número: ");
        number = sc.nextInt();
        sc.nextLine();
        System.out.print("Informe horas trabalhadas: ");
        hrs = sc.nextInt();
        sc.nextLine();
        System.out.print("Informe valor por hora trabalhada: ");
        salPerHour = sc.nextDouble();
        sc.nextLine();
        salary = salPerHour * hrs;
        System.out.printf("%nNUMBER = %d\nSALARY = U$ %.2f%n%n", number, salary); */

        // 5º exercício
        /* int c1, c2, q1, q2;
        double vu1, vu2, vt;
        System.out.println("Informe, respectivamente, código, quantidade e valor de duas peças: ");
        c1 = sc.nextInt();
        q1 = sc.nextInt();
        vu1 = sc.nextDouble();
        sc.nextLine();
        c2 = sc.nextInt();
        q2 = sc.nextInt();
        vu2 = sc.nextDouble();
        sc.nextLine();
        vt = (q1 * vu1) + (q2 * vu2);
        System.out.printf("TOTAL A PAGAR NAS PEÇAS DE CÓDIGOS %d E %d: R$ %.2f%n", c1, c2, vt); */

        // 6º exercício
        double A, B, C, tri, circ, trap, quad, ret;
        System.out.print("Informe, respectivamente, três valores \'flutuantes\' para A, B e C: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        sc.nextLine();
        tri = (A * C) / 2.0;
        circ = 3.14159 * Math.pow(C, 2.0);
        trap = ((A + B) * C) / 2.0;
        quad = Math.pow(B, 2.0);
        ret = A * B;
        System.out.printf("TRIANGULO: %.3f%n", tri);
        System.out.printf("CIRCULO: %.3f%n", circ);
        System.out.printf("TRAPEZIO: %.3f%n", trap);
        System.out.printf("QUADRADO: %.3f%n", quad);
        System.out.printf("RETANGULO: %.3f%n", ret);

        sc.close();
    }
}
