package applications;

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

    public void deposit(double value) {
        this.value += value;
    }

    public void withdraw(double value) {
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
