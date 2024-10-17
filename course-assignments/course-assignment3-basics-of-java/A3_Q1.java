//This program is an encryption/decryption tool designed to take of string inputs in either form,
//processing them, and reporting its counter form to the user.

// Importing scanner library required for declaring scanner objects
import java.util.Scanner;
public class A3_Q1 {
    public static void main (String[] args){

        //printing out user interface messages
        System.out.println("Welcome to the 3D-Space Encryption-Decryption Program:\n++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println("Please enter your plain text below:");

        // Declaring our scanner object; the program is ready to read input from the user
        Scanner myKeyboard = new Scanner(System.in);
        // Taking input from the user
        String userInput = myKeyboard.nextLine();
        // Adding an empty line to improve output readability
        System.out.println();

        //Processing user input to remove leading and trailing spaces
        String processedText = userInput.strip();

        //Checking whether or not the user input is of even length
        if (processedText.length()%2 == 0) {
            //Since strings are immutable. To modify them, we need to create an array of characters and replace its each elements with
            //the string's characters. We are then going to replace the ith element with ith+1 and so on
            char[] userInputs = new char[processedText.length()];
            for (int i = 0; i < processedText.length(); i += 2) {
                char temp = userInputs[i];
                userInputs[i] = userInputs[i + 1];
                userInputs[i + 1] = temp;
            }

            //Displaying the output to the user
            System.out.println("Kindly find below your encrypted text output:");
            for (char element : userInputs) {
                System.out.print(element);
            }
        }
        else {
            //Doing the same work as before, but now for an input with odd number of characters
            char[] userInputs = new char[processedText.length()];
            for (int i = 0; i < processedText.length(); i++) {
                userInputs[i] = processedText.charAt(i);
            }
            for (int i = 1; i < processedText.length(); i += 2) {
                char temp = userInputs[i];
                userInputs[i] = userInputs[i + 1];
                userInputs[i + 1] = temp;
            }
            //Displaying the output
            System.out.println("Kindly find below your encrypted text output:");
            for (char element : userInputs) {
                System.out.print(element);
            }
        }
        System.out.println();
        //Prompting the user that the program has terminated with a thank you message :)
        System.out.print("Thank you for your contribution to this Space Project.");
        myKeyboard.close();
    }
}
