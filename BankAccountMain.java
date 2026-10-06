public class BankAccountMain {
    static class BankAccount {
        private double balance;
        BankAccount(double balance) { this.balance = balance; }
        void deposit(double amount) { if (amount > 0) balance += amount; }
        boolean withdraw(double amount) { if (amount > 0 && amount <= balance) { balance -= amount; return true; } return false; }
        void display() { System.out.println("Balance: " + balance); }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);
        account.deposit(1500);
        System.out.println("Withdrawal successful: " + account.withdraw(2000));
        account.display();
    }
}
