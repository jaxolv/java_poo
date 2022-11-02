package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int account = sc.nextInt();

        Account acc = new Account(account);

        System.out.print("Enter account holder: ");
        sc.nextLine();
        acc.setName(sc.next());

        System.out.print("Is there an initial deposit (y/n)? ");
        char ans = sc.next().charAt(0);

        if (ans == 'y') {
            System.out.print("Enter initial deposit value: ");
            acc.deposit(sc.nextDouble());
        }

        System.out.println("Account data: ");
        System.out.println(acc.toString());
        
        System.out.print("Enter a deposit value: ");
        acc.deposit(sc.nextDouble());
        System.out.println(acc.toString());
        
        System.out.print("Enter a withdraw value: ");
        acc.withdraw(sc.nextDouble());
        System.out.println(acc.toString());

        sc.close();
    }
}
