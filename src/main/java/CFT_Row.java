import java.util.*;
import java.math.*;
public class CFT_Row {
    static Stack<Integer> n; // list of d-1 - dimensional featurepoints
    static Stack<Integer> stack;
    static int w;
    static int v;
    static int c_vwx;
    static int u;
    static int c_uvx;
    static int cols;


    public static Stack<Integer> CFT_Row(Stack<Integer> stack){
        while(!n.empty()){
            w = n.pop();
            if(stack.empty()){
                stack.push(w);
            }
            else
                v = stack.pop();
                //TODO calculate c_vwx
                c_vwx =
                u = stack.peek();
                if(u == Integer.parseInt(null)){
                    c_uvx = 0;
                }
                else{
                    //TODO calculate c_uvx

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
