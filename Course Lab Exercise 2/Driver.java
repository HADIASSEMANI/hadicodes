public class Driver {
    public static void main(String[] args){
        SavingAccount savingAccount1 = new SavingAccount();
        SavingAccount savingAccount2 = new SavingAccount();
        CheckingAccount checkingAccount1 = new CheckingAccount();
        savingAccount1.setBalance(100);
        savingAccount2.setBalance(20);
        checkingAccount1.setBalance(50);
        savingAccount1.setAccountName("Saving Account 1");
        savingAccount2.setAccountName("Saving Account 2");
        checkingAccount1.setAccountName("Checking Account 1");
        BankAccount[] bankAccounts = new BankAccount[] {savingAccount1, savingAccount2, checkingAccount1};

        for(int i = 0; i<3; i++){
            bankAccounts[i].Withdraw(15);
            System.out.println(bankAccounts[i].toString());
        }
        for(int i = 0; i<3; i++){
            bankAccounts[i].Withdraw(15);
            System.out.println(bankAccounts[i].toString());
        }
        for(int i = 0; i<3; i++){
            bankAccounts[i].Withdraw(15);
            System.out.println(bankAccounts[i].toString());
        }
    }
}
