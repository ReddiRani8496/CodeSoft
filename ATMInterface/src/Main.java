
public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);
        ATMInterface atm = new ATMInterface(account);

        atm.checkBalance();
        account.deposit(500);
        atm.checkBalance();
        account.withdraw(200);
        atm.checkBalance();

    }
}
