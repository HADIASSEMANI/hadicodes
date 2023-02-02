//This program is a household budget simulation. It takes on input for funds and expenses
// It then designates a budget to ensure financial well-being for the household.

public class Expense {
    //Attributes
    private String expenseType;
    private String nameOfTheBusiness;
    private int paymentDueMonth, paymentDueDay;

    private double expenseAmount;
    //Default constructor
    public Expense() {}
    //Constructor. Invalid date attributes set to 0
    public Expense(String expenseType, String nameOfTheBusiness, double expenseAmount, int paymentDueMonth, int paymentDueDay) {
        if (paymentDueDay < 1 || paymentDueDay > 31) {
            paymentDueDay = 0;
        } else {
            this.paymentDueDay = paymentDueDay;
        }
        if (paymentDueMonth < 1 || paymentDueMonth > 12) {
            paymentDueMonth = 0;
        } else {
            this.paymentDueMonth = paymentDueMonth;
        }
        this.expenseType = expenseType;
        this.nameOfTheBusiness = nameOfTheBusiness;
        this.expenseAmount = expenseAmount;
    }
    //Copy constructor
    public Expense(Expense copyExpense) {
        if (paymentDueDay < 1 || paymentDueDay > 31) {
            this.paymentDueDay = 0;
        } else {
           this. paymentDueDay = copyExpense.paymentDueDay;
        }
        if (paymentDueMonth < 1 || paymentDueMonth > 12) {
            paymentDueMonth = 0;
        } else {
            this.paymentDueMonth = copyExpense.paymentDueMonth;
        }
        this.expenseType = copyExpense.expenseType;
        this.nameOfTheBusiness = copyExpense.nameOfTheBusiness;
        this.expenseAmount = copyExpense.expenseAmount;
    }
    //Getters
    public String getExpenseType() {
        return expenseType;
    }

    public String getNameOfTheBusiness() {
        return nameOfTheBusiness;
    }

    public double getExpenseAmount() {
        return expenseAmount;
    }

    public int getPaymentDueMonth() {
        return paymentDueMonth;
    }

    public int getPaymentDueDay() {
        return paymentDueDay;
    }
    //Setters
    public void setPaymentDueMonth(int paymentDueMonth) {
        if (paymentDueMonth < 1 || paymentDueMonth > 12) {
            paymentDueMonth = 0;
        } else {
            this.paymentDueMonth = paymentDueMonth;
        }
    }

    public void setPaymentDueDay(int paymentDueDay) {
        if (paymentDueDay < 1 || paymentDueDay > 31) {
            paymentDueMonth = 0;
        } else {
            this.paymentDueDay = paymentDueDay;
        }
    }
    //toString method to printout content of a object of type Expense
    public String toString() {
        if (paymentDueMonth < 10) {
            return expenseType + " - $" + expenseAmount + " - " + nameOfTheBusiness + " - " + paymentDueDay + "/0" + paymentDueMonth;
        }
        if (paymentDueDay < 10) {
            return expenseType + " - $" + expenseAmount + " - " + nameOfTheBusiness + " - 0" + paymentDueDay + "/" + paymentDueMonth;
        }
        return expenseType + " - $" + expenseAmount + " - " + nameOfTheBusiness + " - " + paymentDueDay + "/" + paymentDueMonth;
    }
    //equals method comparing bill distribution of each expense object and deciding on their equality
    public boolean equals(Expense compare) {
        if ((this.expenseType.equals(compare.expenseType)) && (this.nameOfTheBusiness.equals(compare.nameOfTheBusiness)) && (this.expenseAmount == compare.expenseAmount) && (this.paymentDueMonth == compare.paymentDueMonth) && (this.paymentDueDay == compare.paymentDueMonth)) {
            return true;
        }
        return false;
    }
}
