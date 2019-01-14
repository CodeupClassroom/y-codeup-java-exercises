public class CheckingAccount {
    // we need to count the number of accounts in existence (static)
    // this is private so that the only code that can see/change this lives on this here class
    private static int numberOfAccounts = 0;

    // private means available only to other code on the same exact class.
    private String name;

    long accountNumber;
    String accountType;
    private double balance;

    public static long routingNumber = 55555; // static means we don't need an object to access this

    // constructor runs automatically on instantiation (new CheckingAccount())
    public CheckingAccount(String name, String accountType){
        numberOfAccounts++;
        this.name = name;
        this.accountType = accountType;

        accountNumber = 10000L + numberOfAccounts; // we can do better
    }

    // all getters are public so we can provide public access (if we need) to private/protected stuff
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public double getBalance() {
        return balance;
    }

    public void getAccountInfo() {
        System.out.println("Account owner is: " + name);
        System.out.println("Account balance is: " + balance);
        System.out.println("Account number is: " + accountNumber);
        System.out.println("Routing number is: " + routingNumber);
        System.out.println("Account type is: " + accountType);
    }

    public double withdraw(double amount) {
        if(amount <= balance) {
            // return  the requested amount
            // update the balance to subtract that amount
            balance -= amount;
            System.out.println("Your new balance is: " + balance);
            return amount;
        } else {
            System.out.println("Insufficient funds");
            return 0;
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Your new balance is: " + balance);
    }


}
