package entities;

import java.util.Locale;
import java.util.Scanner;
import applications.Account;

public class Deposit {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int account = sc.nextInt();

        Account acc = new Account(account);

        System.out.print("Enter account holder: ");
        acc.setName(sc.next());

        System.out.print("Is there an initial deposit (0/1)? ");
        int ans = sc.nextInt();

        if (ans == 1) {
            System.out.print("Enter initial deposit value: ");
            acc.depositValue(sc.nextDouble());
        }

        System.out.println("Account data: ");
        System.out.println(acc.toString());
        
        System.out.print("Enter a deposit value: ");
        acc.depositValue(sc.nextDouble());
        System.out.println(acc.toString());
        
        System.out.print("Enter a withdraw value: ");
        acc.withdrawValue(sc.nextDouble());
        System.out.println(acc.toString());

        sc.close();
    }
}
