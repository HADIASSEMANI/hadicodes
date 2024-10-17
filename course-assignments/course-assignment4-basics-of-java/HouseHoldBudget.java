//This program is a household budget simulation. It takes on input for funds and expenses
// It then designates a budget to ensure financial well-being for the household.
public class HouseHoldBudget {
    //Attributes
    private Fund availableFunds;
    private Expense [] arrayOfExpenses;
    //Default constructor
    public HouseHoldBudget(){}
    //Constructor
    public HouseHoldBudget(Fund fund, Expense[] expense){
        this.availableFunds = new Fund(fund);
        this.arrayOfExpenses = expense;
        //System.arraycopy(expense,0,this.arrayOfExpenses,0,expense.length);
    }
    //Method to check equality of fund object attributes of householdbudget objects
    public boolean fundsEqual(HouseHoldBudget compare){
        if(this.availableFunds.fundTotal() == compare.totalFund()){
            return true;
        }
        return false;
    }
    //Method to check equality of fund object distribution of householdbudget objects
    public boolean eachFundTypeEqual(Fund compare){
    if (this.availableFunds.equals(compare) == true){
        return true;
    }
    return false;
    }
    //Method to return total fund dollar amounts of householdbudget objects
    public double totalFund(){
        return availableFunds.fundTotal();
    }
    //Getter
    public Fund getFundDistribution(){
        return this.availableFunds;
    }
    //Method to return total expenditure amount of householdbudget objects
    public int expenseNumber(){
        int totalExpenditure = 0;
        for (int i =0; i<arrayOfExpenses.length; i++){
            if(arrayOfExpenses[i] == null){return totalExpenditure;}
            else {totalExpenditure++;}
        }
        return totalExpenditure;
    }
    //Method to add a new expense to householdbudget objects
    public Expense[] addNewExpense(Expense newExpense){
        Expense[] newArrayOfExpenses = new Expense[arrayOfExpenses.length+1];
        if(arrayOfExpenses.length==0){
            newArrayOfExpenses[0] = newExpense;
        }
        for (int i=0; i<arrayOfExpenses.length; i++){
            newArrayOfExpenses [i] = arrayOfExpenses [i];
        }
        newArrayOfExpenses [arrayOfExpenses.length] = newExpense;
        this.arrayOfExpenses = new Expense[newArrayOfExpenses.length];
        for (int i=0;i<newArrayOfExpenses.length;i++){
            this.arrayOfExpenses[i] = newArrayOfExpenses[i];
        }
        return newArrayOfExpenses;
    }
    //Method to remove an expense from householdbudget objects
    public Expense[] removeAnExpense(int index){
        Expense[] newArray = new Expense[arrayOfExpenses.length-1];
        if(arrayOfExpenses[index]!=null && arrayOfExpenses.length!=0) {
            for (int i = 0; i < arrayOfExpenses.length - 1; i++) {
                if (i == index) {
                    continue;
                } else{
                newArray[i] = this.arrayOfExpenses[i];
                }
            }
        }
        return newArray;
    }
    // Method to update due date values for expense attributes of householdbudget objects
    public void updateDueDateInfo(int entry, int newDueDay, int newDueMonth){
        arrayOfExpenses[entry].setPaymentDueDay(newDueDay);
        arrayOfExpenses[entry].setPaymentDueMonth(newDueMonth);
    }
    //Method to add funds to householdbudget objects
    public double addFunds(int num1, int num2, int num3, int num4, int num5){
        availableFunds.addFund(num1, num2, num3, num4, num5);
        availableFunds.fundTotal();
        return totalFund();
    }
    //Method to check householdbudget objects' equality
    public boolean equals(HouseHoldBudget compare){
        if((this.availableFunds.fundTotal() == compare.availableFunds.fundTotal()) && (this.expenseNumber() == compare.expenseNumber())){
            return true;
        }
        return false;
    }
    //Method to print out fund and expense contents of householdbudget objects
    public String toString(){
        String aString = availableFunds.toString() + "\n";
        for (int i=0; i<arrayOfExpenses.length; i++) {
            if(arrayOfExpenses[i] == null){
                return "No Expenses \n";
            }
           aString += arrayOfExpenses[i].toString() + "\n";
        }
        return aString;
    }


}
