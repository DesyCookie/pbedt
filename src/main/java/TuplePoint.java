public class TuplePoint {
    private int xcoordinate; // X coordinate of the Point
    private int ycoordninate; // Y coordinate of the point
    private int value;  //Value at that point

    public TuplePoint(int x, int y, int v){
        xcoordinate = x;
        ycoordninate = y;
        value = v;
    }

    public int getXcoordinate(){
        return xcoordinate;
    }

    public int getYcoordninate(){
        return ycoordninate;
    }

    public int getValue() {
        return value;
    }
}
