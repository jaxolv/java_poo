package applications;

/* 
 * Enter account number: 8532
 * Enter account holder: Alex Green
 * Is there na initial deposit (y/n)? y
 * Enter initial deposit value: 500.00
 * 
 * Account data:
 * Account 8532, Holder: Alex Green, Balance: $ 500.00
 * 
 * Enter a deposit value: 200.00
 * Updated account data:
 * Account 8532, Holder: Alex Green, Balance: $ 700.00
 * 
 * Enter a withdraw value: 300.00
 * Updated account data:
 * Account 8532, Holder: Alex Green, Balance: $ 395.00
 */

public class Account {
    private int account;
    private String name;
    private double value;

    public Account(int account) {
        this.account = account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void depositValue(double value) {
        this.value += value;
    }

    public void withdrawValue(double value) {
        this.value -= (value + 5.00);
    }

    public String toString() {
        return "Account "
                + account
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", value);
    }
}
