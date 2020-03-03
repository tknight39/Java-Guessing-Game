/**
 *  Title:          TicTacToe
 *
 *  Author:         Tyler Knight
 *
 *  Date:           2/29/20
 *
 *  Description:    Draws a tic tac toe board and prompts users for
 *                  input until a player wins the game or the board
 *                  is full, which would be a tie.
 */


package com.TylerKnight;


import java.util.Scanner;


public class Main
{


    private static final int MAX_TURNS = 9;

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        final char[] xo = {'X', 'O'};
        boolean gameRunning = true;

        while (gameRunning)
        {
            char[] boardValues = {'1','2','3','4','5','6','7','8','9'};
            int currentPlayer = 1, turnsPassed = 0, winLoseTie = 0;

            while ( (winLoseTie == 0) && (turnsPassed <= 9) )
            {
                UpdateDisplay(turnsPassed, currentPlayer, boardValues);
                boardValues[GetPlayerChoice(boardValues)] = xo[currentPlayer - 1];
                turnsPassed++;
                winLoseTie = PlayerWon(boardValues, currentPlayer, turnsPassed);
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            }

            DrawBoard(boardValues);
            gameRunning = Game_Over(winLoseTie);
        }
    }



    /**
     *  Print Game Over
     *  Print the player that won, or tie
     *
     * @Param   winStatus:  1 = p1 Won
     *                      2 = p2 Won
     *                      3 = tie
     */
    private static boolean Game_Over(int winStatus)
    {
        System.out.println("GAME OVER!!!");

        switch (winStatus)
        {
            case 1:
                System.out.println("Player 1 Won!!");
                break;
            case 2:
                System.out.println("Player 2 Won!!");
                break;
            case 3:
                System.out.println("Tie Game!!");
        }

        return (GetNumberInput(1,2, "Play again? 1/2 = yes/no") == 1);
    }




    /**
     * Print game data and draw game board
     * @param turn:         How many turns have passed
     * @param player:       The current player
     * @param boardPattern  Array that holds current board values (x's, o's)
     */
    private static void UpdateDisplay(int turn, int player, char[] boardPattern)
    {
        System.out.println("Turns Remaining: " + (MAX_TURNS - turn));
        System.out.println("Current Player: Player " + (player) );
        DrawBoard(boardPattern);
    }


    /**
     * Draw the game board
     * @param boardPattern: Array that holds board values (x's, o's)
     */
    private static void DrawBoard (char[] boardPattern)
    {
        System.out.println(" " + boardPattern[0] + " " + "|" + " " + boardPattern[1] + " " + "|" + " " + boardPattern[2]);
        System.out.println("-----------");
        System.out.println(" " + boardPattern[3] + " " + "|" + " " + boardPattern[4] + " " + "|" + " " + boardPattern[5]);
        System.out.println("-----------");
        System.out.println(" " + boardPattern[6] + " " + "|" + " " + boardPattern[7] + " " + "|" + " " + boardPattern[8]);
    }


    /**
     * Get integer input from user
     * that is within set range
     * @param min       Minimum acceptable input
     * @param max       Maximum acceptable input
     * @param prompt    Reason for the input
     * @return          Return the user input
     */
    private static int GetNumberInput(int min, int max, String prompt)
    {
        Scanner scan = new Scanner(System.in);
        int usrInput;

        do {
            System.out.println(prompt);
            System.out.println("Enter an integer between " + min + " and " + max);
            usrInput = scan.nextInt();
        }
        while ( (usrInput < min) || (usrInput > max) );

        return (usrInput);
    }


    /**
     * Get the next move from the player
     *
     * @param boardValues:  Array holding x's and o's
     * @return:             User Input
     */
    private static int GetPlayerChoice(char[] boardValues)
    {
        final int MIN_INPUT = 1, MAX_INPUT = 9;
        final String prompt = "To mark a board slot, type in the corresponding number";
        int usrInput = 0;

        while (!Character.isDigit( (boardValues[usrInput = (GetNumberInput(MIN_INPUT, MAX_INPUT, prompt) - 1)]) ))
        {
            System.out.println("That position has already been taken");
        }
        return (usrInput);
    }




    /**
     *  1)  Check the board for patterns of x's and o's
     *      to see if a player has won the game,
     *      if so, return (player + 1)
     *
     *  2)  If the board is full, and nobody has won
     *      return 3
     *
     *  3) If nobody has won, and board is not full
     *     return 0;
     *
     *  @param boardValues:  Array containing values on board (x,o)
     *  @param player:       The Current Player
     *  @param turn:         How many turns have passed
     *  @return:             1, 2, or 3
     */
    private static int PlayerWon (char[] boardValues, int player, int turn)
    {
        StringBuilder boardPattern = new StringBuilder();
        final int TIE_GAME = 3;
        String[] winPattern = {"XXX", "OOO"};
        final int[][] WINNING_SEQUENCES = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};


        if (turn > MAX_TURNS) return TIE_GAME;

        // Build a string using the current board values
       for (int i = 0; i < boardValues.length; i++)
           boardPattern.append(String.valueOf(boardValues[i]));

       // Check to see if there is a winning pattern of x's or o's
       for (int i = 0; i < WINNING_SEQUENCES.length; i++)
       {
           StringBuilder tmp = new StringBuilder();
           tmp.append(  String.valueOf(boardPattern.charAt(WINNING_SEQUENCES[i][0])) +
                        String.valueOf(boardPattern.charAt(WINNING_SEQUENCES[i][1])) +
                        String.valueOf(boardPattern.charAt(WINNING_SEQUENCES[i][2])));

           if (tmp.toString().equals(winPattern[player - 1])) return (player);
       }

         return 0;
    }

}
