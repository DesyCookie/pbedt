import java.util.*;
import java.math.*;
public class CFT_Row {
    static Stack<TuplePoint> n; // list of d-1 - dimensional featurepoints
    static Stack<TuplePoint> stack;
    static TuplePoint w;
    static TuplePoint v;
    static int c_vwx;
    static TuplePoint u;
    static int c_uvx;
    static int cols;


    public static Stack<TuplePoint> CFT_Row(Stack<TuplePoint> stack){
        cols = n.size();
        while(!n.empty()){
            w = n.pop();
            if(stack.empty()){
                stack.push(w);
            }
            else
                v = stack.pop();
                c_vwx = (((v.getXcoordinate()^2)-(w.getXcoordinate()^2)+(v.getYcoordninate()^2)+(w.getYcoordninate()^2))/2*(v.getXcoordinate()-w.getXcoordinate()));
                u = stack.peek();
                if(u == null){
                    c_uvx = 0;
                }
                else{
                    c_uvx= (((v.getXcoordinate()^2)-(u.getXcoordinate()^2)+(v.getYcoordninate()^2)+(u.getYcoordninate()^2))/2*(v.getXcoordinate()-u.getXcoordinate()));
                }
                if(c_vwx<c_uvx){
                    //Pop(stack), add w back to the front of n
                    stack.pop();
                    n.push(w);

                }
                else if(c_vwx==c_uvx){
                    //Pop(stack), Push(stack, w)
                    stack.pop(); stack.push(w);
            }
                else if (c_vwx>c_uvx && c_vwx < cols){
                    //push(stack, w)
                    stack.push(w);
                }
        }
        return stack;

    }
}
