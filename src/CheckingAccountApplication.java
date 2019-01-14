
public class CheckingAccountApplication {
        public static void main(String[] args) {
            System.out.println("The bank has: " + CheckingAccount.getNumberOfAccounts() + " accounts.");

            System.out.println("The routing number for the entire bank is:");
            System.out.println(CheckingAccount.routingNumber);

            // let's create three checking accounts
            CheckingAccount account1 = new CheckingAccount("Sophie", "joint");
            CheckingAccount account2 = new CheckingAccount("Ryan", "business");

            account1.getAccountInfo();

            account1.deposit(500);

            System.out.println(CheckingAccount.getNumberOfAccounts());

            account2.getAccountInfo();


        }
}
