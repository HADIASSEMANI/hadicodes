//** MARKER'S FEEDBACK
//** Well done.
// -------------------------------------------------------
// Assignment 1
// Written by: Hadi Assemani (Student ID: 26710549)
// For COMP 248 Section P – Fall 2022
// --------------------------------------------------------
// This program receives temperature inputs from the user in Fahrenheit and Celsius and uses those values to display
// their equivalent values in the opposing scale (i.e. Celsius to Fahrenheit and Fahrenheit to Celsius), the remainder
// of the division, and an exponential relationship between the two equivalent values

// Importing scanner library required for declaring scanner objects
import java.util.Scanner;

public class A1_Q2 {
    public static void main(String[] args){

        // printing out a welcoming message to the user
        System.out.println("Welcome to the Simple Meteorological Program: \n+++++++++++++++++++++++++++++++++++++++++++++");

        // Declaring our scanner object; the program is ready to read input from the user
        Scanner myScanner = new Scanner(System.in);

        // Prompting user to input the values for Fahrenheit and Celsius, required for calculating equivalent temperatures
        System.out.print("Please enter enter the values for 'Fahrenheit' and 'Celsius' scale, simultaneously, separated by a space:");

        // Taking input from the user for Fahrenheit and Celsius temperatures
        double fahrenheit = myScanner.nextDouble();
        double celsius = myScanner.nextDouble();

        // Adding an empty line between the last prompt to improve output readability
        System.out.println("");

        // Declaring the variables and the equations for calculating the equivalent temperatures
        double c = 5.0/9*(fahrenheit -32);
        double f = (9.0/5)*celsius+32;

        // Displaying the results to the user
        System.out.println("The corresponding temperature in Celsius unit is:" + c);
        System.out.println("The corresponding temperature in Fahrenheit unit is:" + f);

        // To measure the remainder of the division  between f and c, we need to use the % operation. However, modulo only takes
        // int type data as input. We need to covert f and c into integers before we can proceed
        int temp = (int) (f%c);

        // In doing so, we have potentially truncated any decimal values from our temperature variables.
        // To circumvent this, we can store those decimal points in a temporary variable
        // (i.e. if use inputs 212.5 F, we can subtract 212 from 212.5 and save 0.5 in a temporary variable
        // that can later be added to the result. Therefore, preventing the loss of any decimal points

        int noDecimal = (int) f;
        double decimal = f - noDecimal;

        // Now we add the decimals to our final result
        double x = (double) temp + decimal;

        // Displaying the output to the user
        System.out.println("The corresponding temperature for x is:" + x);

        // Calculating y, an exponential relationship between f and c in which f is raised to the power of c
        double y = Math.pow(f,c);

        // Displaying the results to the user
        System.out.println("The corresponding temperature for y is:" + y);

        // Adding an empty line between the last prompt to improve output readability
        System.out.println("");

        // Thanking the user for using my program
        System.out.print("Thank you for using my bespoke Meteorological program!");
        // Closing the scanner to keep Java happy :)
        myScanner.close();
    }
}
