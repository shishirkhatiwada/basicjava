// Encapsulation is the concept of bundling data (fields) and methods (behaviors) that operate on that data within a single unit (class).
// Access to the internal state of an object is controlled through methods (getters and setters) to ensure data integrity.

class BankAccount {
    private double balance;

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Setter method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
