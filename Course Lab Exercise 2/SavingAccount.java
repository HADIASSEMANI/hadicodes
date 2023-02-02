public class SavingAccount extends BankAccount{
    int interestRate = 3;
    int transactionFee = 5;

    public int getInterestRate(){
        return this.interestRate;
    }
    public void Withdraw(double amount) {
        if(this.balance-transactionFee-amount>=0) {
            setBalance(balance -amount - transactionFee);
        } else{
            System.out.println("Error: Insufficient funds to perform transaction.");
        }
    }
    public String toString() {
        return "The account balance for " + getAccountName() + " is: " + getBalance() + ". The transaction fee is: " + getTransactionFee() + ". Your account has an interest rate of: " + getInterestRate();
    }

}
