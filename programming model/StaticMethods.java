import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class StaticMethods {
    // absolute value of an int
    public static int abs(int x) {
        if (x < 0)
            return -x;

        return x;
    }

    // primality test
    public static boolean isPrime(int N) {
        if (N < 2)
            return false;
        
        for (int i = 2; i*i <= N; i++)
            if (N % i == 0)
                return false;
        
        return true;
    }

    // square root (Newton's method)
    public static double sqrt(double c) {
        if (c < 0)
            return Double.NaN;
        
        double err = 1e-15;
        double t = c;

        while (Math.abs(t - c/t) > err * t)
            t = (c/t + t) / 2.0;
        
        return t;
    }

    // hypotenuse of a right triangle
    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a*a + b*b);
    }

    // Harmonic Number
    public static double H(int N) {
        double sum = 0.0;

        for (int i = 1; i <= N; i++)
            sum += 1.0 / i;
        
        return sum;
    }

    public static void main(String[] args) {
        StdOut.print("Number: ");
        int a = StdIn.readInt();

        StdOut.println("Harmonic Number: " + H(a));
    }
}