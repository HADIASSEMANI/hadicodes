public class BankAccount {
    String accountName;
    double balance;
    double transactionFee;

    public void setAccountName(String name){
        this.accountName = name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setTransactionFee(double transactionFee){
        this.transactionFee = transactionFee;
    }
    public String getAccountName(){
        return this.accountName;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getTransactionFee(){
        return this.transactionFee;
    }

    public String toString() {
        return "The account balance for " + getAccountName() + "is: " + getBalance() + ". The transaction fee is: " + getTransactionFee();
    }
    public void Withdraw(double amount){
        if(balance-amount>0){
            this.balance -= amount;
        } else {
            System.out.println("Error: Insufficient funds to perform transaction.");
        }
    }
}
