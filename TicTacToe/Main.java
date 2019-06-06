import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static String[] board;
    private static String player;
    private static String stringInput;
    private static String winner;

    static final int totalBoardPositions = 9;

    public static void main(String[] args) {

        while (true) {
            gameInit();
            while (winner == null) {
                drawBoard();
                getInput();
                changePlayer();
                checkForWinner();
                clrscreen();
            }
            if (!playAgain()) {
                break;
            }
        }
    }

    /* Draws a new board */
    static void drawBoard() {
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
    }

    /* Resets all data at start of game */
    static void gameInit() {
        winner = null;
        board = new String[9];
        player = "X";

        /* Assigns a number to each square on the board */
        for (int i=0; i<9; i++) {
            board[i] = String.valueOf(i+1);
        }

        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("---------------------\n\n");
    }

    /*
     * Gets number input from the user
     *  Will loop until the user enters
     *  A number that has not been taken
     *  On the game board
     */
    static void getInput() {
        int numInput = 0;

        while (true) {
            try {
                System.out.println("\n\nPlayer " + player + " Enter a number 1-9");
                numInput = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input, try again");
                continue;
            }

            if (numInput < 1 || numInput > 9) {
                System.out.println("Invalid Input. Enter numbers 1-9 only");
                continue;
            }
            else {
                if (board[numInput - 1] != "X" && board[numInput -1] != "O") {
                    board[numInput - 1] = player;
                    break;
                }
                else {
                    System.out.println("Board Position Taken, try another square.");
                    drawBoard();
                    continue;
                }
            }
        }
    }

    /* Changes the player at end of turn */
    static void changePlayer() {
        if (player == "X") {
            player = "O";
        }
        else {
            player = "X";
        }
    }

    /*
     * Checks the board for a winner
     * If found it will change the winner
     * String to x or 0
     */
    static void checkForWinner() {
        for (int i=0; i<totalBoardPositions; i++) {
             String line = "";
            switch (i) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals("XXX")) {
                winner = "X";
                break;
            }
            else if (line.equals("OOO")) {
                winner = "O";
                break;
            }
        }
    }

    /*
     * End of game, displays the winner of the game
     * And asks the user to play again
     */
    static boolean playAgain() {
        System.out.println("Player " + winner +  " Won!");
        System.out.println("Play again? yes/no");

        while (true) {
            try {
                stringInput = scanner.nextLine() ;
                if (stringInput.equals("yes")) {
                    return true;
                }
                else if (stringInput.equals("no")){
                    return false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter yes or no");
            }
        }

    }

    /* Prints newlines to simulate clearing the screen */
    static void clrscreen() {
        for (int i=0; i<20; i++){
            System.out.println("\n");
        }
    }

}
