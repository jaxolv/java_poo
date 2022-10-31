public class Main {
    public static void main(String[] arg) {
        /* int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado = (double) a / b;

        System.out.println(resultado); */

        /* double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (B + b) / 2.0 * h;
        // Funcionaria normalmente sem, mas entende-se como uma boa prática de programação identificar com ".0" no final da expressão que for de variável "double".

        System.out.println(area);
        // o resultado deve ser 35 */

        /* float b, B, h, area;
        b = 6f;
        B = 8f;
        h = 5f;
        area = (B + b) / 2f * h;
        // Funcionaria normalmente sem, mas entende-se como uma boa prática de programação identificar com "f" no final da expressão que for de variável "float".

        System.out.println(area);
        // o resultado deve ser 35 */

        double a;
        int b;

        a = 5.5;
        b = (int) a;

        System.out.println(b);
        // o resultado deve ser 5, pois ele desconsiderará o que vier depois do ponto flutuante.
    }
}
