import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class PBEDT_2D {



    static ArrayList<TuplePoint> points =new ArrayList<>();

    public static int Distance(int ux, int vx, int dv){
        return ux*(ux-2*vx)+dv;
    }

    public static int  Intersection_INT(int ux, int vx, int du, int dv){
        if (dv>du){
            return (dv-du)/(2*(vx-ux));
        }
        else{
            return -2;
        }
    }

    public static void SquareDistance2D(String imageAddress, int rows, int cols){
        try {
            points = PictureToBinary.ConvertPicture(imageAddress);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int cx;
        int m=rows; //rows
        int n=cols;//collumns
        int[][] I = new int[m][n];
        for(int r=0; r ==m-1; r++){
           ArrayList<TuplePoint> stack_c = new ArrayList<>();
            ArrayList<TuplePoint>  stack_cx = new ArrayList<>(); //image as an Arraylist
            ArrayList<TuplePoint>  stack_g = new ArrayList<>();
           int p = -1;//point that is now being looked at
            for (int c=0;c==n-1;c++){
                if(points.size() < Integer.MAX_VALUE){
                    while(true){
                        if(p>=0){
                            cx = Intersection_INT(stack_c.get(p).getXcoordinate(), c, stack_g.get(p).getXcoordinate(), points.size());
                            if(cx == (stack_cx.get(p).getXcoordinate())){
                                p=p-1;
                            }
                                else if (cx < stack_cx.get(p).getXcoordinate()){
                                    p = p-1;
                                    continue;
                                }
                                else if (cx >= (n-1)){
                                    break;
                                }
                            }
                            else
                                cx = -1;
                            p++;
                            stack_c.set(p,new TuplePoint(m,n,c)); //stack_c.get(p).setXcoordinate(c);
                            stack_cx.set(p, new TuplePoint(m,n,cx)); //stack_cx.get(p).setXcoordinate(cx);
                            stack_g.set(p, new TuplePoint(m,n, p)); //stack_g.get(p).setXcoordinate(p);
                            break;
                        }
                    if(p<0){
                        return false;
                    }
                    c=0;
                    for(int k = 0; k==p; k++){
                        if(k==p){
                            cx = n-1;
                        }
                        else{
                            cx=stack_cx.get(k+1).getXcoordinate();
                        }
                        while(c<=cx){
                            I[r][c]= Distance(c, stack_c.get(k).getXcoordinate(), stack_g.get(k).getXcoordinate());
                            c++;
                        }
                    }
                }
            }

        }
    }

}
