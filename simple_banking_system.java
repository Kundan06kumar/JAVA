class Bank {
    int balance = 1000;

    void deposit(int amount) {
        balance += amount;
        System.out.println("Balance: " + balance);
    }

    void withdraw(int amount) {
        if (amount > balance)
            System.out.println("Insufficient Balance");
        else {
            balance -= amount;
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.deposit(500);
        b.withdraw(300);
    }
}
