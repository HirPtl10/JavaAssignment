class InsufficientFundsException extends Exception {
    double amount;

    InsufficientFundsException(double amount) {
        super("Insufficient funds! Short by: " + amount);
        this.amount = amount;
    }
}

public class BankWithException {
    double balance;

    BankWithException(double bal) {
        this.balance = bal;
    }

    void withdraw(double amt) throws InsufficientFundsException {
        if (amt > balance) throw new InsufficientFundsException(amt - balance);
        balance -= amt;
        System.out.println("Withdrawn: " + amt + " | Balance: " + balance);
    }

    public static void main(String[] args) {
        BankWithException acc = new BankWithException(500);
        try {
            acc.withdraw(200);
            acc.withdraw(400);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}
