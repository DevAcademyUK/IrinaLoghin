package games;

import java.util.Random; //class for generating linear numbers by rule: n[i+1]=(a*n[i]+c)mod m, not cryptographically safe
import java.util.Scanner;

public class rockPaperScissors {

    String playerName; //the name of the player is a string
    String playerMove; //the move has to be a string called paper, rock or scissors
    String computerMove; //the computer makes a move choosing between paper, rock or scissors
    int score;// an int is necessary for a small number recorded as score
    Scanner myScanner = new Scanner(System.in); //for reading from the console

    public static void main(String[] args){//this is the main function, where it is created an object for a new game
        rockPaperScissors rps = new rockPaperScissors();
        rps.initialiseGame();
    }


    private void initialiseGame(){ /* this is the function created for setting up the game, asking for player's name,
    reading the player's name using the Scanner object and calling the playGame function to start the game
    */
        System.out.println("Enter your name: ");
        playerName = myScanner.nextLine();
        playGame();
    }

    private void playGame(){
        /*
        this is the function that does the hard work: asking for the player's move, getting the move from the next line
         using the Scanner object, writing a response message about what move has been selected
         */
        System.out.println("Enter your move: ");
        playerMove = myScanner.nextLine();
        System.out.println(playerName + " has selected " + playerMove + " as their move");
        computerMove = generateComputerMove(); //the computer move is pseudorandomly generated by the called function
        String result = getWinner(playerMove, computerMove); // the final result will be delivered by calling getWinner function
        if(result.equalsIgnoreCase("Win")){/*equalsIgnoreCase is a boolean function
        that returns TRUE if the strings compared if they have the same length, have correspoding same characters
        ignoring if they are uppercase or lowercase;
        we can call this function no-case-sensitive
        if(TRUE) then it means the player has won  and his score gets higher by 1; */
            System.out.println("Congratulations, you won this round!");
            score++; // score++ means score=score+1; but we can say score+=100 if we want to give more points to the winner
        }
        else if(result.equalsIgnoreCase("Lose")){
            System.out.println("You lost this round!");
            score--;
        }
        else {
            System.out.println("This round was a draw!"); // if there is another string than papaer, rock or scissors the game is over
        }

        if(score < 3 && score > -3){ //if there are maximum 3 wins and minimum 3 loses we can still play the game
            playGame();
        }
        else if(score == 3){
            System.out.println("Winner Winner!!");
        }
        else if(score == -3){
            System.out.println("You Looooooosssseeeee!");
        }

    }

    private String generateComputerMove() {//this is the function that tells the computer to pick a random move
        Random r = new Random();// this is the declaration of a new random object
        String move = "";//this has to be null otherwise the game is draw
        int i = r.nextInt(3);//the bound is 3 because in a single game we are allowed to make 3 moves
        switch(i){
            case 0:
                move = "Rock";
                break;//this is  stopping the switch because we need only 1 move at a time

            case 1:
                move = "Paper";
                break;

            case 2:
                move = "Scissors";
                break;
        }
        return move;
    }

    private String getWinner(String playerMove, String computerMove){
        //this function has 2 parameters because depending on each player moves it decides the winner
        String outcome = ""; //outcome has to be null because we will set it after we establish the winner

        //next, we will analize all the possible combinations for the playerMove nd computerMove:

        if(playerMove.equalsIgnoreCase("rock")){
            //anotherstring is the string that we use for comparing
            //if the string of playerMove equals to "rock" no matter the case, then we enter the next if:

            if(computerMove.equalsIgnoreCase("rock")){
                //this if compares the string of computerMove with rock; if both of the players have the same move,
                //the game is draw
                outcome = "Draw";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Lose";
            }
            else{
                outcome = "Win";
            }
        }
        if(playerMove.equalsIgnoreCase("paper")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Win";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Draw";
            }
            else{
                outcome = "Lose";
            }
        }
        if(playerMove.equalsIgnoreCase("scissors")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Lose";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Win";
            }
            else{
                outcome = "Draw";
            }
        }
        return outcome;
    }
}