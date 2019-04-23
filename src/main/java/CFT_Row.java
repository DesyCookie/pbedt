/* based on the CFT Row Algorithm proposed by Wang and Tang in their paper on Pattern Recognition issue 46, p. 234
* */
import java.util.*;

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
                c_vwx = (((v.getXcoordinate()^2)-(w.getXcoordinate()^2)+(v.getYcoordinate()^2)+(w.getYcoordinate()^2))/2*(v.getXcoordinate()-w.getXcoordinate())); //Calculate C_vw * x
                u = stack.peek();
                if(u == null){
                    c_uvx = 0;
                }
                else{
                    c_uvx= (((v.getXcoordinate()^2)-(u.getXcoordinate()^2)+(v.getYcoordinate()^2)+(u.getYcoordinate()^2))/2*(v.getXcoordinate()-u.getXcoordinate())); //Calculate C_uv * x
                }
                if(c_vwx<c_uvx){

                    stack.pop();
                    n.push(w);

                }
                else if(c_vwx==c_uvx){

                    stack.pop(); stack.push(w);
            }
                else if (c_vwx>c_uvx && c_vwx < cols){

                    stack.push(w);
                }
        }
        return stack;

    }
}
