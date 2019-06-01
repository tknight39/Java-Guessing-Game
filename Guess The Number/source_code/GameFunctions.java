import java.util.Random;
import java.util.Scanner;

/**
 * Title: GameFunctions
 * Author: Tyler Knight
 * Date: 6/1/2019
 * Purpose: This class contains -
 * -all the functions for the game
 * */

public class GameFunctions
{
    private static int attempts;
    private static int randomNumber;
    private static int guessRange;
    private static int userGuess;

    private static boolean gameRunning = true;

    /*
     *  Takes care of the setup aspects of the game like
     *  Generating a new random number and finding how
     *  Many attemps the player will have
     */
    private static void gameInit()
    {
        setRandomNumber();
        setAttemptsAndRange();
    }

    /* Sets randomNumber to a value between 1 and 100 */
    private static void setRandomNumber()
    {
        Random random = new Random();
        int low = 0;
        int high = 100;
        randomNumber = random.nextInt(high - low) + low;
    }

    /* Sets the attempts value based on how large the randomNumber is */
    private static void setAttemptsAndRange()
    {
        if (randomNumber <= 10) {attempts = 2; guessRange = 10;}
        else if (randomNumber <= 25) { attempts = 4; guessRange = 25; }
        else if (randomNumber <= 50) { attempts = 5; guessRange = 50;}
        else if (randomNumber <= 75) { attempts = 7; guessRange = 75;}
        else { attempts = 10; guessRange = 100; }
    }

    /* Displays the number of attempts the user has left */
    private static void getAttempts()
    {
        System.out.println("Attempts remaining: " + attempts);
    }

    /* Displays the random number, used at the end of the game */
    private static void getRandomNumber()
    {
        System.out.println("The random number is " + randomNumber);
    }

    /* Gets input from the user */
    private static void getInput()
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            try
            {
                getAttempts();
                System.out.println("Enter a number between 0 and " + guessRange);
                userGuess = scanner.nextInt();

                if ( userGuess <= 100 && userGuess > 0) { break; }
                else { System.out.println("Number is out of guess range"); }
            }
            catch (java.util.InputMismatchException e)
            {
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        }
    }

    /*
     * Checks to see if the guess is correct
     * If it is not correct it will decrement the attempts value
     */
    private static void checkGuess()
    {
        if (userGuess != randomNumber)
        {
            if (userGuess < randomNumber) { System.out.println("Too Low!"); }
            else { System.out.println("Too High!"); }
            attempts--;
        }
    }

    /* Tells the user their win/loss status and asks them to play again */
    private static void playAgain()
    {
        String userInput;
        Scanner scanner = new Scanner(System.in);

        if (attempts > 0) { System.out.println("You won!"); }
        else { System.out.println("You Lost!"); };

        getRandomNumber();

        while (true)
        {
            try
            {
                System.out.println("Play Again? yes/no");
                userInput = scanner.next();
                if (userInput.equals("yes") || userInput.equals("no"))
                {
                    if (userInput.equals("yes")) { break; }
                    else { gameRunning = false; break; }
                }
                else { System.out.println("Invalid Input"); }
            }
            catch (java.util.InputMismatchException e)
            {
                System.out.println("Invalid input, try again");
            }
        }
    }

    /* Main game loop */
    public static void playGame()
    {
        while (gameRunning)
        {
            gameInit();
            while (attempts > 0 && userGuess != randomNumber)
            {
                getInput();
                checkGuess();
            }
            playAgain();
        }
    }

}
