package typeinfo;

import static net.mindview.util.Print.*;

public class E10_PrimitiveOrTrue {
    public static void main(String[] args) {
        char[] ac = "hello world".toCharArray();
        print("ac.getClass() = " + ac.getClass());
        print("ac.getClass().getSuperclasses = " + ac.getClass().getSuperclass());

        char c = 'c';

        int[] ia = new int[3];
        print("ia.getClass() = " + ia.getClass());
        long[] la = new long[3];
        print("la.getClass() = " + la.getClass());
        double[] da = new double[3];
        print("da.getClass() = " + da.getClass());
        String[] sa = new String[3];
        print("sa.getClass() = " + sa.getClass());

        E10_PrimitiveOrTrue[] pot = new E10_PrimitiveOrTrue[3];

        print("pot.getClass() = " + pot.getClass());
        int[][][] thread = new int[3][][];
        print("thread.getClass() = " + thread.getClass());
    }
}
