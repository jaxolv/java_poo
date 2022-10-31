package applications;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConvertor;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double value = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConvertor.conversor(dollar, value));

        sc.close();
    }
}
