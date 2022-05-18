import java.util.Scanner

public class MineSweeper {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Board myBoard = new Board()

        myBoard.print();

        System.out.println("Enter the number of rows you would like to play with");
        int NumOfRows = myScanner.nextInt();

        System.out.println("Enter the number of columns you would like to play with");
        int NumOfColumns = myScanner.nextInt();


    }



}
