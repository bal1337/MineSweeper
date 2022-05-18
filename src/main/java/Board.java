public class Board {
    // Attributes
    int NumOfRows;
    int NumOfColumns;
    int NumOfMines;
    Tile[][] myBoard;



    // Constructor

    public Board(int myNumOfRows, int myNumOfColumns, int myNumOfMines){
        this.NumOfRows = myNumOfRows;
        this.NumOfColumns = myNumOfColumns;
        this.NumOfMines = myNumOfMines;
        this.myBoard = new Tile[NumOfRows][NumOfColumns];

        for (int i = 0; i < NumOfRows; i++){
            for (int j = 0; j < NumOfColumns; j++){
                Tile myTile = new Tile();
                myBoard[i][j] = myTile;
            }

        }

    }


    // Method
    public void getmyBoard(){
        for (int i = 0; i < NumOfRows; i++){
            for (int j = 0; j < NumOfColumns; j++) {
                Tile myTile = newTile();
                System.out.print(myBoard[i][j].state + " ");

            }
            System.out.print("\n");
        }
        public void setMineCoords(int x, int y){
            myBoard[x][y], setMine();
        }
    }
}
