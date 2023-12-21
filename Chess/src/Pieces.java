public class Pieces  {
    private int[][]Board;
    private int X = 5;
    private int Y = 2;
    private int X2;
    private int Y2;
    private int xDistance;
    private int yDistance;


    ///Coordinates for individual pieces
    public void Piece() {
        Board = new int[X][Y];
    }
    
    /// Method used for calculating distance
    public double Distance (int X2, int Y2){
        this.X2 = X2;
        this.Y2 = Y2;
        xDistance = (X2 - X);
        yDistance = (Y2 - Y);
        return (Math.sqrt((xDistance * xDistance) + (yDistance * yDistance)));
    }

    public void Move(int X,int Y){
        this.X = X;
        this.Y = Y;
        X2 = X;
        Y2 = Y;
    }

    public double getNewX(){
        return X2;
    }

    public double getNewY(){
        return Y2;
    }
    public void setName(String name){
        System.out.println(name);
    } 


}