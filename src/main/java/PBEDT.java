import java.util.Stack;

/* based on the PBEDT Algorithm proposed by Wang and Tang in their paper on Pattern Recognition issue 46, p. 234
 * */
public class PBEDT {

    static Stack<TuplePoint> n;
    static Stack<TuplePoint> stack;
    public static void PBEDT(Stack<TuplePoint> I, int d, int k) {
        if (k > 0) {
            PBEDT(I, d, k - 1);
        }

        Stack<TuplePoint> temp = new Stack<TuplePoint>();
        Double x, cx, sd;

        for (int i_k = 0; i_k < n[k]; i_k++) {
            //sd = (Double)(I.get(coordinates).getValue());

            if (sd < Double.POSITIVE_INFINITY) {
                // LABEL A:
                if (!temp.empty()) {
                    cx =

                    if (cx = )
                }
            }
        }
    }
}
