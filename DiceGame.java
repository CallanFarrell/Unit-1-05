import java.util.Random;
import java.util.Scanner;

/****************************************************************************
* Created by: Callan Farrell.
* Created on: Feb 2020
* Created for: ICS4U
****************************************************************************/

public class DiceGame {
  
  /**
  * This program chooses a number between 1 and 6.
  * and the user has to guess what the number is.
  */
  public static void main(String[] args) {

    int randomNumber = rand.nextInt(6);
    int counter;
    
    Random rand = new Random();
    
    randomNumber += 1;
    counter = 0;
    int userGuess;
    System.out.print("Guess the number between 1-6? : ");
    Scanner userInput = new Scanner(System.in);
    userGuess = userInput.nextInt();

    while (randomNumber != userGuess) {

      counter += 1;

      System.out.print("That number is incorrect! Try again!: ");
        
      userGuess = userInput.nextInt();

    }
        
    counter += 1;
    System.out.print("Congratulations! That number is correct! And it only took you " 
        + counter + " attempt/s.");

  }
}