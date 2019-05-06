import java.util.Stack;

/* based on the PBEDT Algorithm proposed by Wang and Tang in their paper on Pattern Recognition issue 46, p. 234
 * */
public class PBEDT {

    static Stack<TuplePoint> n;
    static Stack<TuplePoint> stack;
    public Stack<TuplePoint> PBEDT (int l, int d, int k, Stack<TuplePoint> n){
    if(k>1){
        PBEDT(l,d,k-1, n);
    }
    for(int i =1; i == d; i++){
       for(int j = 1; j ==k+1; j++){
           for(int h =1; h==k-1;h++){
               for(int m = 1; m==l;m++){
                   //CFT Row

           }
       }
    }}

return n;}}
