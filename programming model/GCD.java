import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

public class GCD {
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        StdOut.print("p: ");
        int p = StdIn.readInt();

        StdOut.print("q: ");
        int q = StdIn.readInt();

        StdOut.printf("GCD: %d\n", gcd(p, q));
    }
}