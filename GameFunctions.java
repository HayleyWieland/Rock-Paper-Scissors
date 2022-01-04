import java.util.Random;

public class GameFunctions {
    //object fields
    private Random generator;
    private static String computerChoice;

    //constructor that creates an empty computer choice and random object
    public GameFunctions(){
        computerChoice = "";
        generator = new Random();
    }

    //chooses a random number between 0 & 2, and uses that value to choose rock, paper, or scissors & store in the object's computerChoice variable. Prints the computer's choice.
    public void choose(){
        int randomNum = generator.nextInt(3);
        if(randomNum == 0){
            computerChoice = "rock";
        }else if(randomNum == 1){
            computerChoice = "paper";
        }else if(randomNum == 2){
            computerChoice = "scissors";
        }
        System.out.println("The computer chose "+computerChoice);
    }

    //tests the user's choice against the computer's choice & decides the winner
    public static String whoWon(String user) {
        if(user.equals("rock") && computerChoice.equals("rock") || user.equals("scissors") && computerChoice.equals("scissors")||user.equals("paper")&& computerChoice.equals("paper")){
           return "tie";
        }else if(user.equals("rock") && computerChoice.equals("scissors") || user.equals("scissors") && computerChoice.equals("paper")|| user.equals("paper") && computerChoice.equals("rock")){
           return "user";
        }else{
            return "computer";
        }
    }
}
