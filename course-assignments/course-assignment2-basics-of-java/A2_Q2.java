//This program take on values of destination market and month of the year for farm products to set the retail values
//before being shipped to market

// Importing scanner library required for declaring scanner objects
import java.util.Scanner;

public class A2_Q2 {
    public static void main(String[] args){
        //print statements to display required information in the output
        System.out.println("Welcome to Farms Distribution Center Price Index Program:");
        System.out.println("=========================================================");

        //declaring the variable initial production as a constant
        final double INITIAL_PRODUCTION = 1.4672;

        //prompting the user to input values
        System.out.print("Please enter a Month and Market, respectively, separated by a space:");
        //creating our scanner object
        Scanner myKeyboard = new Scanner(System.in);
        //taking in input from the user
        String month = myKeyboard.next();
        //turning it all into lower case to resolve case sensitivity
        String harvestMonth = month.toLowerCase();
        //ditto
        String market = myKeyboard.next();
        //ditto
        String destMarket = market.toLowerCase();

        //declaring variable harvestPercentage and setting its value to 0
        double harvestPercentage = 0;

        //creating nested switch loops to check for destination market first and then month of the harvest (nested)
        switch (destMarket) {
            case "domestic":
                switch (harvestMonth) {
                    case "january":
                        harvestPercentage = 75.25;
                        break;
                    case "february":
                        harvestPercentage = 62.86;
                        break;
                    case "march":
                        harvestPercentage = 54.78;
                        break;
                    case "april":
                        harvestPercentage = 68.46;
                        break;
                    case "may":
                        harvestPercentage = 35.89;
                        break;
                    case "june":
                        harvestPercentage = 28.94;
                        break;
                    case "july":
                        harvestPercentage = 42.50;
                        break;
                    case "august":
                        harvestPercentage = 86.10;
                        break;
                    case "september":
                        harvestPercentage = 69.7;
                        break;
                    case "october":
                        harvestPercentage = 85.4;
                        break;
                    case "november":
                        harvestPercentage = 75.9;
                        break;
                    case "december":
                        harvestPercentage = 76.8;
                        break;
                    default:
                        System.out.println("Error: An invalid value has been entered for the 'Month' variable. Please retry again!");

                }
                //System.out.println(harvestPercentage);
                break;
            case "international":
                switch (harvestMonth) {
                    case "january":
                        harvestPercentage = 24.75;
                        System.out.println(harvestPercentage);
                        break;
                    case "february":
                        harvestPercentage = 37.14;
                        break;
                    case "march":
                        harvestPercentage = 45.22;
                        break;
                    case "april":
                        harvestPercentage = 31.54;
                        break;
                    case "may":
                        harvestPercentage = 64.11;
                        break;
                    case "june":
                        harvestPercentage = 71.06;
                        break;
                    case "july":
                        harvestPercentage = 57.5;
                        break;
                    case "august":
                        harvestPercentage = 13.9;
                        break;
                    case "september":
                        harvestPercentage = 30.3;
                        break;
                    case "october":
                        harvestPercentage = 14.6;
                        break;
                    case "november":
                        harvestPercentage = 24.1;
                        break;
                    case "december":
                        harvestPercentage = 23.2;
                        break;
                    default:
                        System.out.println("Error: An invalid value has been entered for the 'Month' variable. Please retry again!");
                }
                //System.out.println(harvestPercentage);
                break;
            default:
                System.out.println("Error: An invalid value has been entered for the 'Market' variable. Please retry again!");
        }
        //calculating price index
        double priceIndex = 1.0/20*(harvestPercentage*INITIAL_PRODUCTION);
        System.out.println("");
        //displaying the price index with two decimal points for aesthetic purposes
        System.out.printf("The value for the Price Index, 'I', is: %.2f %n", priceIndex);
        // Displaying a goodbye message to the user and thanking them for using my program
        System.out.print("Thank you for using Farms Distribution Center Price Index Program!");
        // Closing the scanner type object, myScanner, to keep Java happy :)
        myKeyboard.close();
    }
}
