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
    static int cols = stack.size();


    public static Stack<TuplePoint> CFT_Row(Stack<TuplePoint> stack){
        while(!n.empty()){
            w = n.pop();
            if(stack.empty()){
                stack.push(w);
            }
            else
                v = stack.pop();
                c_vwx = (((v.xcoordinate^2)-(w.xcoordinate^2)+(v.ycoordninate^2)+(w.ycoordninate^2))/2*(v.xcoordinate-w.xcoordinate));
                u = stack.peek();
                if(u == null){
                    c_uvx = 0;
                }
                else{
                    //TODO calculate c_uvx
                    c_uvx= (((v.xcoordinate^2)-(u.xcoordinate^2)+(v.ycoordninate^2)+(u.ycoordninate^2))/2*(v.xcoordinate-u.xcoordinate));
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
