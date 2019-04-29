public class TuplePoint {
    private int xcoordinate; // X coordinate of the Point
    private int ycoordinate; // Y coordinate of the point
    private int value;  //Value at that point

    public TuplePoint(int x, int y, int v){
        xcoordinate = x;
        ycoordinate = y;
        value = v;
    }

    public int getXcoordinate(){
        return xcoordinate;
    }

    public void setXcoordinate(int xcoordinate) {
        this.xcoordinate = xcoordinate;
    }

    public int getYcoordinate(){
        return ycoordinate;
    }

    public void setYcoordinate(int ycoordinate) {
        this.ycoordinate = ycoordinate;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void print(){
        System.out.println(xcoordinate+ ycoordinate +value);
    }

    @Override
    public String toString(){
        return ("X: "+ String.valueOf(xcoordinate)+", Y: "+String.valueOf(ycoordinate)+ ", Value: "+String.valueOf(value));
    }

    @Override
    public boolean equals(Object o){
        TuplePoint that = (TuplePoint)o;
        if(xcoordinate==that.getXcoordinate()&& ycoordinate ==that.getYcoordinate()&&value==that.getValue()){
            return true;
        }
        else{
            return false;
        }

    }


}
