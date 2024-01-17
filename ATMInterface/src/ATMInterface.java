class ATMInterface {

    private final BankAccount bankAccount;

    public ATMInterface(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + bankAccount.getBalance());
    }

}
