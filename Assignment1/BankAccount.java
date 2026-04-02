public class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(double amt) {
        if (amt > 0) balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) {
        if (amt > balance) System.out.println("Insufficient funds!");
        else {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        }
    }

    void inquiry() {
        System.out.printf("[%s] Balance: %.2f%n", owner, balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Alice", 1000);
        acc.inquiry();
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(2000);
        acc.inquiry();
    }
}
