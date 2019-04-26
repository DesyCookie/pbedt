/* based on the CFT Row Algorithm proposed by Wang and Tang in their paper on Pattern Recognition issue 46, p. 234
* */
import java.util.*;

public class CFT_Row {
    static Stack<TuplePoint> n = new Stack<>(); // list of d-1 - dimensional featurepoints

    static TuplePoint w;
    static TuplePoint v;
    static int c_vwx;
    static TuplePoint u;
    static int c_uvx;
    static int cols;


    public static Stack<TuplePoint> CFT_Row_algorithm (Stack<TuplePoint> r){
        Stack<TuplePoint> stack = new Stack<>();
        for(int i =0;i<r.size();i++){ //take all featurepoints out of the complete list of points r
           if(r.elementAt(i).getValue()==1){
               n.push(r.elementAt(i)); //all featurepoints pushed into list n.
           }
        }
        if (n.empty()){
            System.out.println("There are no featurepoints in this image, please try a different onexxxxx");
        }
        else{}
        cols = r.size()-1;
        while(!n.empty()){
            w = n.pop();
            if(stack.empty()){
                stack.push(w);
            }
            else {
                v = stack.peek();
                c_vwx = (((v.getXcoordinate() ^ 2) - (w.getXcoordinate() ^ 2) + (v.getYcoordinate() ^ 2) + (w.getYcoordinate() ^ 2)) / 2 * (v.getXcoordinate() - w.getXcoordinate())); //Calculate C_vw * x
                if (stack.isEmpty()||stack.size()<=1) {
                    c_uvx = 0;
                } else {
                    u = stack.elementAt(stack.size()-(stack.size()-1));
                    c_uvx = (((v.getXcoordinate() ^ 2) - (u.getXcoordinate() ^ 2) + (v.getYcoordinate() ^ 2) + (u.getYcoordinate() ^ 2)) / 2 * (v.getXcoordinate() - u.getXcoordinate())); //Calculate C_uv * x
                }
            }

                if(c_vwx<c_uvx){
                   if(!stack.isEmpty()){ stack.pop();}
                    n.push(w);
                }
                else if(c_vwx==c_uvx){
                    if(!stack.isEmpty()){ stack.pop();}
                    stack.push(w);
            }
                else if (c_vwx>c_uvx && c_vwx < cols){

                    stack.push(w);
                }
        }
        //System.out.println(stack);
        return stack;
    }
}
