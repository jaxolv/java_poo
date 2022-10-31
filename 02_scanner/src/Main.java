import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        /* Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou \'" + x + "\'.");

        sc.close(); */

        /* Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();
        System.out.println("Você digitou o número " + x + ".");

        sc.close(); */

        /* Locale.setDefault(Locale.US); // com o Locale.US, eu tenho que usar ponto (.) ao informar o valor em fração. Caso não esteja usando o Locale.US, deve ser informado com vírgula (,)
        Scanner sc = new Scanner(System.in);

        double x;
        // x = sc.nextInt(); // nesse caso de usar o nextInt, só dará erro se você digitar uma fração. Se digitar um número inteiro, ele retornará o número inteiro mas no formato de fração.
        x = sc.nextDouble();
        System.out.println("Você digitou o número " + x + ".");
        System.out.printf("Você digitou o número %.1f%n.", x); // Em caso de informado o valor sem o Locale.US, a vírgula aparecerá nesse caso de PRINTF. No outro caso, aparecerá o ponto.

        sc.close(); */

        /* Scanner sc = new Scanner(System.in);

        char x;
        x = sc.next().charAt(0);
        System.out.println("O primeiro caractere do que você digitou é \'" + x + "\'");
        
        sc.close(); */

        // Locale.setDefault(Locale.US);
        /* Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.printf("A funcionária %s tem %d anos e recebe R$ %.1fk de salário.%n", x, y, z);
        
        sc.close(); */

        /* Scanner sc = new Scanner(System.in);

        String x, y, z;

        x = sc.nextLine();
        y = sc.nextLine();
        z = sc.nextLine();

        System.out.println("\nO que você digitou foi: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z + "\n");
        
        sc.close(); */

        Scanner sc = new Scanner(System.in);

        int a;
        String x, y, z;

        System.out.println("\nDigite um número inteiro e depois 3 frases, todas separadas por [ENTER].");
        a = sc.nextInt();
        sc.nextLine(); // isso aqui limpa o BUFF DE LEITURA [termo técnico]
        x = sc.nextLine();
        y = sc.nextLine();
        z = sc.nextLine();

        System.out.println("\nO que você digitou foi: ");
        System.out.println(a);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z + "\n");
        
        sc.close();
    }
}
