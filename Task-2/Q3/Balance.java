public class Balance extends Account {
    public static void main(String[] args) {
        Account account1 = new Account("John", "Acc001", 1000);
        Account account2 = new Account("David", "Acc002", 5000);
        Account account3 = new Account("Vijay", "Acc003", 10000);

        account1.withdraw(750);
        account2.deposit(1250);
        account3.display();

    }
}
