import java.util.Locale;
import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in); //initializes a Scanner
        String answer = "y"; //ensures that the while loop will run at least once

        while(answer.equalsIgnoreCase("y")){
            GameFunctions demo = new GameFunctions(); //initializes a GameFunctions object each game

            //prompts user to enter their choice and then saves it in the variable userChoice
            System.out.println("Rock, paper, scissors, shoot! Enter your choice: ");
            String userChoice = keyboard.nextLine();

            //validates the user's entry, prompts them to re-enter if not valid
            while(!userChoice.equalsIgnoreCase("rock") && !userChoice.equalsIgnoreCase("paper") && !userChoice.equalsIgnoreCase("scissors")) {
                System.out.println("Error. Enter a valid input (rock, paper, or scissors): ");
                userChoice = keyboard.nextLine();
            }

            //the computer chooses & the results are run (see GameFunctions for more detail)
            demo.choose();
            String result = demo.whoWon(userChoice);

            //takes the result and prints a text to the user telling them the result
            if(result.equals("computer")){
                System.out.println("Sorry! You lost.");
            }else if(result.equals("user")){
                System.out.println("Hooray! You won!");
            }else{
                System.out.println("You tied!");
            }

            //gives the user the opportunity to play again or terminate the loop/program.
            System.out.println("Would you like to play again? Enter y for yes, or press any other key to end the game.");
            answer = keyboard.nextLine();
        }

    }



}

