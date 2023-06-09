package tdd;

public class Account {
    private final String pin;
    private int defaultBalance;

    public Account(String userPin) {
        pin = userPin; // Default pin
        defaultBalance = 0; // Default balance
    }

    public int getBalance(String inputPin) {
        if (pin.equals(inputPin)){
            return defaultBalance;
        }
        return 0;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            defaultBalance += amount;
        }
    }

    public void withdraw(int amount, String inputPin) {
        if (amount > 0 && defaultBalance >= amount && pin.equals(inputPin)) {
            defaultBalance -= amount;
        }
    }
}
