public class Main {
    public static void main(String[] args) {
        try {
            PersonalAccount account = new PersonalAccount(12345, "Jibek");
            account.deposit(1000);
            account.withdraw(440);
            account.deposit(150);

            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: $" + account.getBalance());
            System.out.println("\nTransaction History:");
            account.printHistory();

            double withdrawalAmount = 10000;
            account.withdraw(withdrawalAmount);

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}