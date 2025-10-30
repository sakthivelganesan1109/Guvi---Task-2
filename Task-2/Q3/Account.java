public class Account{
    public String name;
    public String accountNumber;
    public double balance;

    public Account() {

    }

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public String getname() {
        return name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
     public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void display() {
        System.out.println("Accountholder name is: "+name+" and balance is "+getBalance());
    }


}