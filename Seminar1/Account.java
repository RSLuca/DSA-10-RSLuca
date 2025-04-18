public class Account {
    private String name;
    private double balance;

    private static int totalAccounts = 0;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Depozitul a fost efectuat cu succes");
    }

    public void withdraw(double amount) {
        if (this.balance > amount) {
            balance -= amount;
            System.out.println("Ati retras cu succes");
        } else {
            System.out.println("Founduri insuficiente");
        }
    }

    public void displayInfo() {
        System.out.println("Nume: " + name);
        System.out.println("Balanta: " + balance);
        System.out.println("Numar de conturi: " + totalAccounts);
    }
    public static void main(String[] args) {
        Account account1 = new Account("Costel", 2500);
        account1.displayInfo();

        Account account2 = new Account("Mirel", 3500);

        account1.deposit(1500);
        account1.displayInfo();

        Account account3 = new Account("Maria", 2999);
        account2.displayInfo();

        account3.displayInfo();
    }
}