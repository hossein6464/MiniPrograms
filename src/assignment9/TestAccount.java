package assignment9;

public class TestAccount {
    public static void main(String[] args) {

        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(0.045);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Your Account Balance is: " + account.getBalance() + "$. With monthly interest of " + account.getMonthlyInterest() + "$ as of " + account.getDateCreated());
    }
}
