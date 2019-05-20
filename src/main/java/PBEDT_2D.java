import java.util.ArrayList;
import java.util.Stack;

public class PBEDT_2D {

    int infinity = Integer.MAX_VALUE/2;

    public static int distance(int ux, int vx, int dv){
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

    public static void SquareDistance2D(Stack<TuplePoint> points, int rows, int cols){
        int cx;
        int m=rows; //rows
        int n=cols;//collumns
        for(int r=0; r ==m-1; r++){
           ArrayList<TuplePoint> stack_c = new ArrayList<TuplePoint>();
            ArrayList<TuplePoint>  stack_cx = new ArrayList<TuplePoint>();
            ArrayList<TuplePoint>  stack_g = new ArrayList<TuplePoint>();

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
                            stack_c.get(p).setXcoordinate(c);
                            stack_cx.get(p).setXcoordinate(cx);
                            stack_g.get(p).setXcoordinate(points.size()); // NOPE
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
                            //I(r,c)= Distance(c, stack_c[k].getXcoordinate(), stack_g[k].getXcoordinate())
                            c = c+1;
                        }
                    }
                }
            }

        }
    }

}
