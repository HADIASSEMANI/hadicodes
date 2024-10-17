// This program receives two integer variable inputs from the user and uses those values to display Cartesian-
// coordinates of a stationary astronomical body and its nearest, neighbouring astronomical body to the user.

// Importing scanner library required for declaring scanner objects
import java.util.Scanner;

public class A1_Q1 {
    public static void main(String[] args){

        // printing out a welcoming message to the user
        System.out.println("Welcome to the Simple 3D-Space Program: \n+++++++++++++++++++++++++++++++++++++++");

        // Declaring our scanner object; the program is ready to read input from the user
        Scanner myScanner = new Scanner(System.in);

        // Prompting user to input the values for p and q, required for calculating the Cartesian coordinates (x, y, and z)
        System.out.print("Please enter the values for 'p' and 'q', simultaneously, separated by a space:");

        // Declaring the constant values for pi and Euler's number to use in upcoming equations
        //** MARKER'S COMMENTS
        //** These two values must be calculated and stored according to the instructions.
        //** Specifically, PI must be computed and stored as 22.0/7.0
        final double PI = Math.PI;
        final double E = Math.exp(1);

        // Taking input from the user for p and q. Byte type declared in order to limit the usage of any input greater than 127
        byte p = myScanner.nextByte();
        byte q = myScanner.nextByte();

        // Adding an empty line between the last prompt to improve output readability
        System.out.println("");

        // Declaring our Cartesian coordinates and the respective formulas for their calculation
        double x = p*PI/E+50;
        double y = p*PI/E+50*12;
        double z = q+y;

        // Displaying the calculated coordinates to the user
        System.out.println("Cartesian coordinates of the first object is: (" + x + "," + y + "," + z + ").");

        // Re-assigning y and z values to represent the Cartesian coordinates for the nearest astronomical object
        y = x*12;
        z = (y*6) + q;

        // Displaying the Cartesian coordinates of the nearest astronomical object to the user
        System.out.println("Cartesian coordinates of the nearest object is: (" + x + "," + y + "," + z + ").");

        // Adding an empty line to improve output readability
        System.out.println("");

        // Displaying a goodbye message to the user and thanking them for using my program
        System.out.print("Thank you for your contribution to this Space Project.");

        // Closing the scanner type object, myScanner, to keep Java happy :)
        myScanner.close();
    }
}