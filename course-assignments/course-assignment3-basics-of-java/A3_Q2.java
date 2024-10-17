//Importing the required for the proper running of the program. The first helps us catch user inputs entered by mistake
//while second one allows us to take inputs from the user.
import java.util.InputMismatchException;
import java.util.Scanner;

public class A3_Q2 {
    public static void main(String[] args){
        //Welcoming the user to our program
        System.out.println("Welcome to the Simple Electronic Voting System (SEVS):\n++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        //Taking in candidate ID and credentials from the user
        System.out.println("Please enter a String collection of electoral candidates below:");
        Scanner myKeyboard = new Scanner(System.in);
        String candidateInfo = myKeyboard.nextLine();
        //Reformatting the text to all uppercase letters to improve readability
        candidateInfo = candidateInfo.toUpperCase();

        //Splitting the input by semicolons and storing each value as an element in an array
        //This allows us to have an element for each candidate and their ID, separated by a comma
        //Which we can later separate and use either ID or candidate name to access their info
        String[] candidate= candidateInfo.split("[;]",0);
        //Creating a new array to store unformatted elements from array[] candidate
        String[] trimmedCandidate = new String[candidate.length];
        //Adding trimmed text to the trimmedCandidate array we declared before
        for (int i=0; i<candidate.length; i++){
            trimmedCandidate[i] = candidate[i].trim();
        }
        //Declaring the umbrella array to systematically store important data regarding the election as we process user input
        String[][] ballotCount = new String[candidate.length][3];
        //Adding zero for the number of votes for each candidate
        for (int j=0; j<candidate.length; j++) {
            ballotCount[j][2] = String.valueOf(0);
        }

        for (int j=0; j<candidate.length; j++){
            for (int k=0; k<2; k++) {
                String spacesRemoved = trimmedCandidate[j];
                //Separating user ID and candidate name with their leading and trailing spaces removed by their comma
                String[] separatedText = spacesRemoved.split("[,]", 0);
                //Removing extra spaces between the first name and last name of the candidates
                for (int l=0; l< separatedText.length; l++){
                    separatedText[l] = separatedText[l].trim().replaceAll(" +", " ");
                }
                //Inputting the raw data into our umbrella array
                ballotCount[j][k] =separatedText[k];
            }
        }
        //Displaying relevant user interface info to help user utilize the program
        System.out.println("********************************\n| Code >> Description          |\n********************************\n|  1  >> Display candidates    |\n|  2  >> Vote a candidate      |\n|  3  >> Add new candidate(s)  |\n|  4  >> Display results       |\n|  0  >> End SEVS              |\n********************************");
        System.out.print("Enter a code, from the aforementioned, that corresponds to your tasks:");
        System.out.println();
        //Indefinitely running the program unless the program is terminated by the user by entering 0
        while (1<2) {
            //Opening a try{}catch{} to catch invalid inputs entered by the user
            try {
                int userInput = myKeyboard.nextInt();
                if (userInput == 1) {
                    //If the input is put as 1 the program will display current candidates information
                    System.out.println("********************************\n| ID >> Candidate's Name       |\n********************************");
                    for (int j = 0; j < ballotCount.length; j++) {
                        for (int k = 0; k < 1; k++) {
                            //Adding formatted text so that our table of candidates expands as more candidates are input into the database
                            System.out.format("%1s %-2s %-2s %-22s %1s %1s", "|", ballotCount[j][k], ">>", ballotCount[j][k + 1], "|", "\n");
                        }
                    }
                    System.out.println();
                    System.out.print("Kindly continue by entering a valid code, from the aforementioned, which corresponds to your task: ");
                    //Allows us to repeat another iteration of the program
                    continue;
                } else if (userInput == 2) {
                    System.out.print("Please enter the ID of the candidate you wish to vote for: ");
                    String candidateID = myKeyboard.next();
                    //Looping through our umbrella array to see if any user IDs match the user input
                    for (int j = 0; j < candidate.length; j++) {
                        for (int k = 0; k < 2; k++) {
                            if (ballotCount[j][k].equals(candidateID)) {
                                String ballotID = ballotCount[j][k + 1];
                                //Incrementing the ballot count if the user input matches for that particular candidate
                                ballotCount[j][2] = String.valueOf(Integer.parseInt(ballotCount[j][2]) + 1);
                                System.out.println("Your ballot has been casted for: " + ballotID + " bearing candidate ID: " + ballotCount[j][k]);
                            }
                        }
                    }
                    //Reordering the placement of candidates with respect to their number of votes in descending order
                    int max;
                    String[][] temp = new String[ballotCount.length][];
                    for (int index=0; index < ballotCount.length-1;index++){
                        max = index;
                        for(int scan = index+1; scan < ballotCount.length; scan++){
                            if(Integer.parseInt(ballotCount[scan][2])>Integer.parseInt(ballotCount[max][2])){
                                max=scan;
                            }
                        temp[0] = ballotCount[max];
                        ballotCount[max]=ballotCount[index];
                        ballotCount[index]=temp[0];
                        }
                    }
                    System.out.println();
                    System.out.print("Kindly continue by entering a valid code, from the aforementioned, which corresponds to your task: ");
                    continue;
                } else if (userInput == 3) {
                    System.out.println("Please enter a Strong Collection of the NEW electoral candidates below:");

                    String junk = myKeyboard.nextLine();
                    String newCandidateInfo = myKeyboard.nextLine();
                    //Text formatting as before for the new candidates
                    newCandidateInfo = newCandidateInfo.toUpperCase();
                    String[] newCandidate = newCandidateInfo.split("[;]", 0);
                    String[] newTrimmedCandidate = new String[newCandidate.length];

                    for (int i = 0; i < newCandidate.length; i++) {
                        newTrimmedCandidate[i] = newCandidate[i].trim();
                    }
                    //Storing the old vote counts in the umbrella array in a temporary array
                    //When a new iteration of the umbrella array ballotCount[][] is created, the old values are lost
                    //After we declare the new version, we re-import old values from temporary array
                    String[][] temp = new String[candidate.length][3];
                    for (int i=0; i<candidate.length;i++){
                        temp[i][2]=ballotCount[i][2];
                    }
                    ballotCount = new String[candidate.length + newCandidate.length][3];
                    for (int i=0; i< candidate.length;i++) {
                        ballotCount[i][2] = temp[i][2];
                    }
                    //Setting the vote count for the new candidates to zero
                    for (int j= candidate.length; j<ballotCount.length; j++) {
                        ballotCount[j][2] = String.valueOf(0);
                    }
                    //Text formatting and importing old candidates to the umbrella array
                    for (int j = 0; j < candidate.length; j++) {
                        for (int k = 0; k < 2; k++) {
                            String trimmedText = trimmedCandidate[j];
                            String[] newText = trimmedText.split("[,]", 0);

                            for (int l = 0; l < newText.length; l++) {
                                newText[l] = newText[l].trim().replaceAll(" +", " ");
                            }
                            ballotCount[j][k] = newText[k];
                        }
                    }
                    //Text formatting and importing new candidates to the umbrella array
                    for (int m = 0; m < newCandidate.length; m++) {
                        for (int p = 0; p < 2; p++) {
                            String newCandidates = newTrimmedCandidate[m];
                            String[] appendCandidates = newCandidates.split("[,]", 0);
                            for (int n = 0; n < appendCandidates.length; n++) {
                                appendCandidates[n] = appendCandidates[n].trim().replaceAll(" +", " ");
                            }
                            ballotCount[candidate.length + m][p] = appendCandidates[p];
                        }
                    }

                    System.out.println("Successfully added a NEW set of electoral candidates to the Simple Electronic Voting System (SEVS).");
                    System.out.println();
                    System.out.print("Kindly continue by entering a valid code, from the aforementioned, which corresponds to your task: ");
                    continue;
                } else if (userInput == 4) {
                    //Creating a temporary array that stores the position ranking of candidates based on their number of votes
                    //and setting candidates performing at the same level to the same rank
                    int[] temp = new int[ballotCount.length];
                    temp[0]=1;
                    for (int j = 0; j<ballotCount.length-1;j++) {
                        if (ballotCount[j+1][2].equals(ballotCount[j][2])) {
                            temp[j + 1] = temp[j];
                        }
                        else{
                            temp[j+1]=temp[j]+1;
                        }
                    }
                    //Displaying the results to the user
                    System.out.println("*****************************************************************\n| Position | Votes/Ballots | ID | Candidate's Name              |\n*****************************************************************");
                    for (int j = 0; j < ballotCount.length; j++) {
                        for (int k = 0; k < 1; k++) {
                            System.out.format("%1s %8s %-1s %13s %1s %1s %-1s %-29s %1s %1s", "|", temp[j], "|", ballotCount[j][k+2], "|", ballotCount[j][k],"|", ballotCount[j][k+1],'|',"\n");
                        }
                    }
                    System.out.println();
                    System.out.print("Kindly continue by entering a valid code, from the aforementioned, which corresponds to your task: ");
                    continue;
                } else if (userInput == 0) {
                    System.out.println();
                    System.out.print("Thank you for using our Simple Electronic Voting System (SEVS).");
                    //Terminating the program if 0 is entered by the user
                    myKeyboard.close();
                    System.exit(0);
                } else {
                    //If other numbers not specified by the program are entered by the user, we reiterate the algorithm and ask the user for new input
                    System.out.println();
                    System.out.print("Kindly continue by entering a valid code, from the aforementioned, which corresponds to your task: ");
                    continue;
                }
            }
            catch(InputMismatchException exception){
                //Catching wrong inputs entered by the user into the scanner and re-entering the loop
                System.out.print("Kindly continue by entering a valid code, from the aforementioned, which corresponds to your task: ");
                String junk2 = myKeyboard.nextLine();
                continue;
            }
        }
    }
}
