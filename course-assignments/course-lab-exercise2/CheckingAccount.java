public class CheckingAccount extends BankAccount{
    int maximumNumberOfFreeTransactions = 2;
    int numberOfTransactions =0;

    public int getNumberOfTransactions(){
        return numberOfTransactions;
    }

    public int getMaximumNumberOfFreeTransactions(){
        return maximumNumberOfFreeTransactions;
    }

    public void Withdraw(double amount) {
        if(numberOfTransactions<2) {
            if (balance - amount >= 0){
                this.balance -= amount;
                numberOfTransactions++;
            } else{
                System.out.println("Error: Insufficient funds to perform transaction.");
            }
        } else if (numberOfTransactions>2) {
            if (balance - amount - transactionFee >= 0){
                transactionFee = 5;
                this.balance = balance - (amount + transactionFee);
                numberOfTransactions++;
            } else{
                System.out.println("Error: Insufficient funds to perform transaction.");
            }
        }
    }

    public String toString() {
        return "The account balance for " + getAccountName() + " is: " + getBalance() + ". The transaction fee is: " + getTransactionFee() + ". The maximum number of transactions is: " + getMaximumNumberOfFreeTransactions() + " and you have used " + getNumberOfTransactions() + " so far.";
    }
}
