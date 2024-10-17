//This program serves as a waste management guideline for city households to consult to help save the earth

// Importing scanner library required for declaring scanner objects
import java.util.Scanner;

public class A2_Q1 {
    public static void main (String[] args){
        //printing the information in the format required by the output
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Welcome to My City Recycling Program:");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");
        System.out.println("Item Recycling Code. |--> Item Samples");
        System.out.println("--------------------------------------");
        System.out.println("1.  |-->[Soft drink bottles/Trash cans]");
        System.out.println("2.  |-->[Shampoo bottles/ Yogurt containers]");
        System.out.println("3.  |-->[Plastic bags]");
        System.out.println("4.  |-->[Storage bins/Brooms/Brushes]");
        System.out.println("5.  |-->[Garden hoses/Piping]");
        System.out.println("6.  |-->[Carry-out food containers]");
        System.out.println("7.  |-->[Plastic straws/Chip bags/Coffee pods]");
        System.out.println("8.  |-->[Cell phone/Computers/Camera/Batteries]");
        System.out.println("9.  |-->[TV Remote/Flashlight batteries]");
        System.out.println("10. |-->[Car batteries]");
        System.out.println("11. |-->[Cereal/Snack cardboard boxes]");
        System.out.println("12. |-->[Newspaper/Books/Wallpaper]");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");

        //declaring our scanner object; the program is ready to read input from the user
        Scanner myKeyboard = new Scanner(System.in);
        //prompting the user to input recycling codes
        System.out.print("Please enter the Recycling code, from the above, that corresponds to the item you want to recycle: ");
        //taking inputs from the user
        int recyclingCode = myKeyboard.nextInt();
        //checking the value entered by the user with an if/else loop and displaying the appropriate guideline for waste disposal based on the input
        if ((recyclingCode >= 1 && recyclingCode < 6) || (recyclingCode >= 11 && recyclingCode < 13)) {
            System.out.println("This is a Recycled Plastics/Paper item.");
            System.out.println("Item required to be put in the blue household recycling bin.");
        }
        else if (recyclingCode >= 6 && recyclingCode < 8) {
            System.out.println("This is a Non-Recycled Plastics item.");
            System.out.println("Item required to be put in the gray household garbage bin.");
        }
        else if (recyclingCode >= 8 && recyclingCode < 11) {
            System.out.println("This is a Batteries item.");
            System.out.println("Item required to be taken to your local recycling depot or nearby store for disposal.");
        }
        else if (recyclingCode == 0) {
            System.out.println("This is a Hazardous material.");
            System.out.println("Material required to be put in a hazardous dumpster diving.\nKindly check your area for the nearby one.");
        }
        else if ((recyclingCode>12 && recyclingCode<128) || (recyclingCode>-129 && recyclingCode<0)){
            System.out.println("This item is N/A.");
            System.out.println("Item code not handled by the city recycling system.\nKindly check the nearby city(ies) for possible recycling availability.");
        }
        //catching the error if values greater than 127 or less than -128 are entered by the user
        else if (recyclingCode>127 || recyclingCode<-128){
            System.out.println("Error: Your recycling code is not a valid integer between -128 to 127. Kindly retry again!");
        }
        // Adding an empty line to improve output readability
        System.out.println("");
        // Displaying a termination message to the user
        System.out.println("Thank you for saving the Planet!");
        // Closing the scanner type object, myScanner, to keep Java happy :)
        myKeyboard.close();

    }
}
