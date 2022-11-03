package JavaFiles;

import java.util.Scanner;
import java.util.Random;

public class RunHiLowGame {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //variables
        String name;
        int guess;
        int guessnum = 0;
        boolean run = true;
        int number;
        int choice;

        Scanner input = new Scanner(System.in);
        Random r = new Random();

        number = 1;

        //welcome


        //create loop to ask guess then check if high or low        
        while (run = true) {
            //enter guess
            System.out.println("Enter your guess:");
            guess = input.nextInt();

            //if low say press 1 to retry
            if (guess > 0 && guess < 100) {
                if (guess < number) {
                    System.out.println("Your number was too low! Guess again!");
                    guessnum++; 
                }
                else if (guess > number) {
                    System.out.println("Your number was too high! Guess again!");   
                    guessnum++;
                }
                else if (guess == number) {
                    System.out.println("You have won!");       
                    guessnum++;
                    System.out.println("Amount of guesses:" + guessnum );
                    System.out.println("Press 1 to play again or press 2 to exit     the game.");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out.println("Restarting.\n");
                    }
                    else if (choice == 2) {
                        System.out.println("Exiting.");
                        // run = false
                    }               
                    else {
                        System.out.println("Error.");
                    }
                }
                else {
                    System.out.println("Invalid answer.");
                }
             }
         }
         System.out.println("Exited.");
     }
}