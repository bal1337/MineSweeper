
import java.util.Scanner;

public class Minesweeper {
    public static void main(String[] args) {

        //Attributes
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 positive integers  for the (# of rows |  # of columns |  # of mines): ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int mines = sc.nextInt();
        System.out.println("This Minesweeper works by using -1 represent hidden tiles and 9 denote the mines, sorry there are no flags");
        System.out.println("");

        //Constructor/Methods
        MinesweeperGame game = new MinesweeperGame(rows, columns, mines); // Creates the game
        System.out.println("");
        System.out.println("Start the game");


        int x = 0;
        while (x != -1) { // Actually plays the game
            System.out.println("");
            System.out.println("Enter a row |  and then a column to choose (positive integer): ");
            int inputRow = sc.nextInt();
            int inputColumn = sc.nextInt();
            int y = game.playerInteract(inputRow, inputColumn); // User input to select square


            if (y == 2) { // Shows the conditions lose win or carry on for the game
                System.out.println("");
                System.out.println("Oh ohhhh you have hit a mine");
                System.out.println("");
                game.getBoard();
                System.out.println("You lose plus ratioed kekw");
                System.exit(0); // ends the game
            }
            if (y == 1) {
                System.out.println("");
                System.out.println("Huge dub you win");
                System.out.println("");
                game.getBoard();
                System.out.println("You lose plus ratioed kekw");
                System.exit(0); // Exits after the game is complete
            }
            if (y == 0) {
                System.out.println("");
                System.out.println("Here is the current board.");
                System.out.println("");
                game.getVisibleBoard(); // Continues if the game has not been completed. 
            }
        }
    }
}