//This program is a household budget simulation. It takes on input for funds and expenses
// It then designates a budget to ensure financial well-being for the household.

import java.util.InputMismatchException;
import java.util.Scanner;

public class BudgetDemo {
    public static void main (String[] args) {
        //Setting up the looks
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n" + "\n" + "Welcome to the next chapter of your financial well-being\n" + "\n" + "++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println("What would you like to do?\n   1. See the possessions of all householdB budgets\n   2. See the possessions oof one household budget\n   3. List household budgets with same total amount of fund\n   4. List household budgets with same fund denomination(s)\n   5. List household budgets with same total amount of fund and same number of expenses\n   6. Add an expense to an existing household budget\n   7. Remove an existing expense from fundForHouseholdOne household budget\n   8. Update the payment due date of an existing expense\n   9. Add fund to fundForHouseholdOne household budget\n   0. To quit");
        System.out.println();


        //Setting up our household budgets:
        Fund fundForHouseholdOne = new Fund();
        Fund fundForHouseholdTwo = new Fund();
        Fund fundForHouseholdThree = new Fund();
        Fund fundForHouseholdFour = new Fund();
        Fund fundForHouseholdFive = new Fund();
        //Assigning values to our objects of type fund
        fundForHouseholdOne.setNum(0, 0, 3, 3, 2);
        fundForHouseholdTwo.setNum(0, 0, 3, 3, 2);
        fundForHouseholdThree.setNum(2, 0, 2, 1, 1);
        fundForHouseholdFour.setNum(3, 1, 2, 2, 6);
        fundForHouseholdFive.setNum(3, 1, 2, 2, 6);
        //Creating and assigning values to our objects of type Expense
        Expense expenseOne = new Expense("Purchase", "BestBuy", 700, 11, 1);
        Expense expenseTwo = new Expense("Bill", "Bell", 60, 12, 29);
        Expense expenseThree = new Expense("Purchase", "SAQ", 213, 11, 3);
        Expense expenseFour = new Expense("Bill", "HydroQuebec", 69, 12, 15);
        Expense expenseFive = new Expense("Purchase", "Levi's", 32, 11, 9);
        Expense expenseSix = new Expense("Purchase", "Super C", 41, 10, 4);
        Expense expenseSeven = new Expense("Bill", "Telus", 58, 12, 2);
        //Grouping Expenses
        Expense[] householdBudget0Expenses = new  Expense[]{expenseOne, expenseTwo};
        Expense[] householdBudget1Expenses = new Expense[]{expenseThree, expenseFour};
        Expense[] householdBudget2Expenses = new Expense[]{expenseFive, expenseSix, expenseSeven};
        Expense[] householdBudget3Expenses = new Expense[]{null};
        Expense[] householdBudget4Expenses = new Expense[]{null};
        //Assigning our objects to our households
        HouseHoldBudget zero = new HouseHoldBudget(fundForHouseholdOne, householdBudget0Expenses);
        HouseHoldBudget one = new HouseHoldBudget(fundForHouseholdTwo, householdBudget1Expenses);
        HouseHoldBudget two = new HouseHoldBudget(fundForHouseholdThree, householdBudget2Expenses);
        HouseHoldBudget three = new HouseHoldBudget(fundForHouseholdFour, householdBudget3Expenses);
        HouseHoldBudget four = new HouseHoldBudget(fundForHouseholdFive, householdBudget4Expenses);
        //Setting up an array of type HouseHoldBudget for easier manipulation of our data
        HouseHoldBudget[] listOfHouseholds = new HouseHoldBudget[]{zero, one, two, three, four};

        //initiating Scanner object and prompting the user
        System.out.print("Please enter your choice and press <Enter>: ");
        Scanner myKeyboard = new Scanner(System.in);
        //Using this and fundForHouseholdOne while loop, we keep the program running until user decides to quit the program
        int keepProgramRunning = 1;

        while (keepProgramRunning<3) {
            try {
                int userInput = myKeyboard.nextInt();
                if (userInput == 0) {
                    System.out.print("Thank you for using my household budget program :) <3");
                    System.exit(0);
                    //Displaying fund and expenses of each householdbudget object
                } else if (userInput == 1) {
                    System.out.println("Content of each household budget:\n-------------------");
                    System.out.println("Household budget #0:\n" + zero.toString());
                    System.out.println("Household budget #1:\n" + one.toString());
                    System.out.println("Household budget #2:\n" + two.toString());
                    System.out.println("Household budget #3:\n" + three.toString());
                    System.out.println("Household budget #4:\n" + four.toString());
                    System.out.println("Task finished. If you wish to continue using the program, please choose another task from the menu. Otherwise, enter 0 to exit: ");
                    System.out.print("Please enter your choice and press <Enter>: ");
                    //Allowing user to look up specific householdbudget objects
                } else if (userInput == 2) {
                    System.out.print("Which household budget you want to see the possessions of? (Enter number 0 to 4): ");
                    int loop = 1;
                    while (loop < 3) {
                        int newUserInput = myKeyboard.nextInt();
                        if (newUserInput > 4 || newUserInput < 0) {
                            System.out.print("Sorry but there is no household budget number " + newUserInput + ".\n--> Try again: (Enter number 0 too 4): ");
                            continue;
                        } else if (newUserInput == 0) {
                            System.out.println("Household budget #0:\n" + zero.toString());
                            System.out.println();
                            System.out.println("Task finished. If you wish to continue using the program, please choose another task from the menu. Otherwise, enter 0 to exit: ");
                            System.out.print("Please enter your choice and press <Enter>: ");
                            break;
                        } else if (newUserInput == 1) {
                            System.out.println("Household budget #1:\n" + one.toString());
                            System.out.println();
                            System.out.println("Task finished. If you wish to continue using the program, please choose another task from the menu. Otherwise, enter 0 to exit: ");
                            System.out.print("Please enter your choice and press <Enter>: ");
                            break;
                        } else if (newUserInput == 2) {
                            System.out.println("Household budget #2:\n" + two.toString());
                            System.out.println();
                            System.out.println("Task finished. If you wish to continue using the program, please choose another task from the menu. Otherwise, enter 0 to exit: ");
                            System.out.print("Please enter your choice and press <Enter>: ");
                            break;
                        } else if (newUserInput == 3) {
                            System.out.println("Household budget #3:\n" + three.toString());
                            System.out.println();
                            System.out.println("Task finished. If you wish to continue using the program, please choose another task from the menu. Otherwise, enter 0 to exit: ");
                            System.out.print("Please enter your choice and press <Enter>: ");
                            break;
                        } else if (newUserInput == 4) {
                            System.out.println("Household budget #4:\n" + four.toString());
                            System.out.println();
                            System.out.println("Task finished. If you wish to continue using the program, please choose another task from the menu. Otherwise, enter 0 to exit: ");
                            System.out.print("Please enter your choice and press <Enter>: ");
                            break;
                        }
                    }
                    //Comparing householdbudget objects and displaying ones with similar fund value
                } else if (userInput == 3) {
                    System.out.println("List of household budgets with same total fund:");
                    System.out.println();

                    for (int z=0; z<listOfHouseholds.length-1; z++){
                        for (int y=z+1; y< listOfHouseholds.length;y++) {
                            if (listOfHouseholds[z].fundsEqual(listOfHouseholds[y]) == true){
                                System.out.println("Household budgets " + z + " and " + y + " both have: $" + listOfHouseholds[z].totalFund());
                            }
                        }
                    }
                    System.out.println();
                    System.out.println("Task finished. If you wish to continue using the program, please choose another task from the menu. Otherwise, enter 0 to exit: ");
                    System.out.print("Please enter your choice and press <Enter>: ");
                    //Comparing householdbudget objects and displaying ones with similar fund distribution
                } else if (userInput == 4) {
                    System.out.println("List of household budgets with same fund distribution:");
                    System.out.println();

                    for (int z=0; z<listOfHouseholds.length-1; z++){
                        for (int y=z+1; y< listOfHouseholds.length;y++) {
                            if (listOfHouseholds[z].eachFundTypeEqual(listOfHouseholds[y].getFundDistribution()) == true){
                                System.out.println("Household budgets " + z + " and " + y + " both have: " + listOfHouseholds[z].getFundDistribution());
                            }
                        }
                    }
                    System.out.println();
                    System.out.println("Task finished. If you wish to continue using the program, please choose another task from the menu. Otherwise, enter 0 to exit: ");
                    System.out.print("Please enter your choice and press <Enter>: ");
                    //Comparing householdbudget objects' equalities
                } else if (userInput == 5) {
                    System.out.println("List of household budgets with same amount of money and same number of expenses: ");
                    System.out.println();
                    for (int z = 0; z < listOfHouseholds.length - 1; z++) {
                        for(int y=z+1; y< listOfHouseholds.length;y++) {
                            if (listOfHouseholds[z].equals(listOfHouseholds[y])) {
                                System.out.println("Household budgets " + z + " and " + (y));
                            }
                        }
                    }
                    System.out.println();
                    System.out.println("Task finished. If you wish to continue using the program, please choose another task from the menu. Otherwise, enter 0 to exit: ");
                    System.out.print("Please enter your choice and press <Enter>: ");
                    //Adding expense reports from householdbudget objects
                } else if (userInput == 6) {
                    System.out.print("Which household budget do you want to add an expense to? (Enter number 0 to 4): ");
                    //Allows us to loop through until either user quits or enters the right input
                    while (keepProgramRunning < 3) {
                        int userInputForAddExpense = myKeyboard.nextInt();
                        if (userInputForAddExpense >= 5 || userInputForAddExpense < 0) {
                            System.out.print("Sorry but there is no household budget number" + userInputForAddExpense + ".\n--> Try again: (Enter number 0 to 4): ");
                            continue;
                        }
                        for (int z = 0; z < listOfHouseholds.length; z++) {
                            if (userInputForAddExpense == z) {
                                System.out.println("Please enter the following information so that we may complete the expense");
                                System.out.print("--> Type of expense (Bill, Purchase, etc.): ");
                                String junk = myKeyboard.nextLine();
                                String typeOfNewExpense = myKeyboard.nextLine();
                                System.out.print("--> Amount of the Expense: ");
                                double amountOfNewExpense = myKeyboard.nextDouble();
                                System.out.print("--> Name of the business: ");
                                String junk1 = myKeyboard.nextLine();
                                String nameOfBusinessForNewExpense = myKeyboard.nextLine();
                                System.out.print("--> Payment due day number and month (separated by fundForHouseholdOne space): ");
                                int newExpensePaymentDueDay = myKeyboard.nextInt();
                                int newExpensePaymentDueMonth = myKeyboard.nextInt();
                                System.out.println();
                                Expense newExpense = new Expense(typeOfNewExpense, nameOfBusinessForNewExpense, amountOfNewExpense, newExpensePaymentDueMonth, newExpensePaymentDueDay);
                                listOfHouseholds[z].addNewExpense(newExpense);
                                System.out.print("You now have " + (listOfHouseholds[z].expenseNumber() + 1) + " expense.");
                                System.out.println();
                                System.out.println("Task finished. If you wish to continue using the program, please choose another task from the menu. Otherwise, enter 0 to exit: ");
                                System.out.print("Please enter your choice and press <Enter>: ");
                                break;
                            }
                        } break;
                    }
                    //Removing expense reports from householdbudget objects
                } else if (userInput == 7) {
                    System.out.print("Which household budget do you want to remove an expense from? (Enter number 0 to 4): ");
                    while (keepProgramRunning < 3) {
                        int userInputForRemoveExpense = myKeyboard.nextInt();
                        if (userInputForRemoveExpense > 4 || userInputForRemoveExpense < 0) {
                            System.out.print("Sorry but there is no household budget number" + userInputForRemoveExpense + ".\n--> Try again: ");
                            continue;
                        } else if (listOfHouseholds[userInputForRemoveExpense].expenseNumber() == 0) {
                            System.out.print("Sorry that household budget has no expenses. If you wish to continue using the program, please choose another task from the menu. Otherwise, enter 0 to exit: ");
                            break;
                        } else {
                            for (int z = 0; z < listOfHouseholds.length; z++) {
                                if (userInputForRemoveExpense == z) {
                                    while (keepProgramRunning < 3) {
                                        System.out.print("Which expense index do you want to remove? (Enter number " + 0 + " to " + (listOfHouseholds[z].expenseNumber() - 1) + "): ");
                                        int indexForExpenseToBeRemoved = myKeyboard.nextInt();
                                        if (indexForExpenseToBeRemoved > listOfHouseholds[z].expenseNumber() || indexForExpenseToBeRemoved < 0) {
                                            System.out.print("Sorry but there is no expense associated with that index. Try again: (Enter number " + 0 + " to " + (listOfHouseholds[z].expenseNumber() - 1) + "): ");
                                            break;
                                        } else {
                                            listOfHouseholds[z].removeAnExpense(userInputForRemoveExpense);
                                            System.out.print("Expense was Successfully removed.");
                                            System.out.println();
                                            System.out.println("Task finished. If you wish to continue using the program, please choose another task from the menu. Otherwise, enter 0 to exit: ");
                                            System.out.print("Please enter your choice and press <Enter>: ");
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        }
                    }
                    //Updating date values from user-end
                } else if (userInput == 8) {
                    System.out.print("Which household budget do you want to update an expense from? (Enter number 0 o 4): ");
                    while (keepProgramRunning < 3) {
                        int userInputForExpenseUpdate = myKeyboard.nextInt();
                        if (userInputForExpenseUpdate > 4 || userInputForExpenseUpdate < 0) {
                            System.out.print("Sorry but there is no household budget number" + userInputForExpenseUpdate + ".\n--> Try again: ");
                            continue;
                        } else if (listOfHouseholds[userInputForExpenseUpdate].expenseNumber() == 0) {
                            System.out.print("Sorry that household budget has no expenses.");
                            continue;
                        } else {
                            for (int z = 0; z < listOfHouseholds.length; z++) {
                                if (userInputForExpenseUpdate == z) {
                                    System.out.print("Which expense index do you want to update? (Enter number " + 0 + " to " + (listOfHouseholds[z].expenseNumber() - 1) + "): ");
                                    while (keepProgramRunning < 3) {
                                        int indexForExpenseToBeUpdated = myKeyboard.nextInt();
                                        if (indexForExpenseToBeUpdated > listOfHouseholds[z].expenseNumber() || indexForExpenseToBeUpdated < 0) {
                                            System.out.print("Sorry but there is no expense associated with that index. Try again: (Enter number " + 0 + " to " + (listOfHouseholds[z].expenseNumber() - 1) + "): ");
                                            continue;
                                        } else {
                                            System.out.print("Enter new payment due day number and month (Separated by fundForHouseholdOne space): ");
                                            int newDueDay = myKeyboard.nextInt();
                                            int newDueMonth = myKeyboard.nextInt();
                                            listOfHouseholds[z].updateDueDateInfo(z, newDueDay, newDueMonth);
                                            System.out.print("Due date updated.");
                                            System.out.println();
                                            System.out.println("Task finished. If you wish to continue using the program, please choose another task from the menu. Otherwise, enter 0 to exit: ");
                                            System.out.print("Please enter your choice and press <Enter>: ");
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        }
                    }
                    //Adding funds through specific bill composition
                } else if (userInput == 9) {
                    System.out.print("Which household budget do you want to update an expense from? (Enter number 0 o 4): ");
                    int householdBudgetNumber = myKeyboard.nextInt();
                    System.out.print("How many loonie, toonie, $5, 410, and $20 bills do you want to add? (Enter 5 numbers separated by fundForHouseholdOne space): ");
                    int numberOfLoonies = myKeyboard.nextInt();
                    int numberoFToonies = myKeyboard.nextInt();
                    int numberOf$5Bills = myKeyboard.nextInt();
                    int numberOf$10Bills = myKeyboard.nextInt();
                    int numberOf$20Bills = myKeyboard.nextInt();
                    listOfHouseholds[householdBudgetNumber].addFunds(numberOfLoonies, numberoFToonies, numberOf$5Bills, numberOf$10Bills, numberOf$20Bills);
                    System.out.print("You now have $" + listOfHouseholds[householdBudgetNumber].totalFund());
                    System.out.println();
                    System.out.println();
                    System.out.println("Task finished. If you wish to continue using the program, please choose another task from the menu. Otherwise, enter 0 to exit: ");
                    System.out.print("Please enter your choice and press <Enter>: ");
                } else {
                    //Confirming user's input
                    System.out.print("Sorry that is not fundForHouseholdOne valid choice. Try again: ");
                }
            }
            //Catching input mismatch error by the user and prompting them to start again
        catch(InputMismatchException exception){
            System.out.print("Invalid input! Kindly start over by choosing fundForHouseholdOne task from the main menu: ");
            String junk2 = myKeyboard.nextLine();
            continue;
            }
        }
    }
}
