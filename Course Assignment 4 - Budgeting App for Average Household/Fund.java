//This program is a household budget simulation. It takes on input for funds and expenses
// It then designates a budget to ensure financial well-being for the household.

public class Fund{
    //Declaring attributes
   private static final int LOONIE = 1;
   private static final int TOONIE = 2;
   private static final int FIVEDOLLARBILL = 5;
   private static final int TENDOLLARBILL = 10;
   private static final int TWENTYDOLLARBILL = 20;

   private int num1, num2, num3, num4, num5;
   //int numberOfLoonies, numberOfToonies, numberOfFiveDollarBills, getNumberOfTenDollarBills, getGetNumberOfTwentyDollarBills;

   // Default constructor
   public Fund(){}
    //Constructor
   public Fund(int num1, int num2, int num3, int num4, int num5){
       this.num1 = num1;
       this.num2 = num2;
       this.num3 = num3;
       this.num4 = num4;
       this.num5 = num5;
   }
   //Constructor copy
   public Fund(Fund aFund){
       this.num1 = aFund.num1;
       this.num2 = aFund.num2;
       this.num3 = aFund.num3;
       this.num4 = aFund.num4;
       this.num5 = aFund.num5;
   }
    //Getters
    public int getNum1(){return num1;}
    public int getNum2(){return num2;}
    public int getNum3(){return num3;}
    public int getNum4(){return num4;}
    public int getNum5(){return num5;}

    //Setters
   public void setNum(int number1, int number2, int number3, int number4, int number5){
       this.num1 = number1;
       this.num2 = number2;
       this.num3 = number3;
       this.num4 = number4;
       this.num5 = number5;
   }
    //Add fund method to add all currency types to our fund
    public void addFund(int num1, int num2, int num3, int num4, int num5){
        this.num1 += num1;
        this.num2 += num2;
        this.num3 += num3;
        this.num4 += num4;
        this.num5 += num5;
    }
    //Fund total method to calculate the total dollar amount of funds from their bill values
    public double fundTotal() {
        return this.num1 * LOONIE + this.num2 * TOONIE + this.num3 * FIVEDOLLARBILL + this.num4 * TENDOLLARBILL + this.num5 * TWENTYDOLLARBILL;
    }
    //toString method to printout content of a object of type Fund
    public String toString(){
       return "(" + num1 + "x $1) + ("+ num2 + "x $2) + ("+ num3+ "x $5) + (" + num4 + "x $10) + (" + num5 + "x $20)";
    }
    //equals method comparing bill distribution of each fund object and deciding on their equality
    public boolean equals(Fund compare){
       if ((this.num1 == compare.num1) && (this.num2 == compare.num2) && (this.num3 == compare.num3) && (this.num4 == compare.num4) && (this.num5 == compare.num5) ){
           return true;
       }
       return false;
    }
}

