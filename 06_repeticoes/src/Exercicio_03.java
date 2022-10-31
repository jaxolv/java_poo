import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1.Álcool; 2.Gasolina; 3.Diesel; 4.Fim.

        System.out.println("Informe, de acordo com o código do combustível, o que você mais usa: ");
        int x = sc.nextInt();
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        while (x != 4) {
            if (x > 4 || x < 0) {
                System.out.println("Informe apenas valores referentes aos códigos informados.");
            } else {
                cont1 += (x == 1) ? 1 : 0;
                cont2 += (x == 2) ? 1 : 0;
                cont3 += (x == 3) ? 1 : 0;
            }
            x = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + cont1);
        System.out.println("Gasolina: " + cont2);
        System.out.println("Diesel: " + cont3);

        sc.close();
    }
}
