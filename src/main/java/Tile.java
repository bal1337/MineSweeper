public class Tile {
    // Attributes
    boolean Mine = false;
    boolean Visible = false;
    boolean Flag = false;
    String State = "O";

    //Constructor
    public Tile(boolean myMine, boolean myVisible, boolean myFlag){
        this.Mine = myMine;
        this.Visible = myVisible;
        this.Flag = myFlag;
    }

    //Methods
    public String getState() {
        return this.State;
    }

    public void setMine() {
        this.Mine = true;
        this.State = "M";
    }
    public void setFlag(){
        if (this.Flag ==true){
            this.State = "F";
            }
        else if ()

    }

}
