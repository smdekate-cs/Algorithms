import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

public class Average {
    public static void main(String[] args) {
        // Average the numbers of StdIn.
        double sum = 0.0;
        int cnt = 0;

        while (!StdIn.isEmpty()) {
            // Read a number and cumulate the sum.
            sum += StdIn.readDouble();
            cnt++;
        }

        double avg = sum / cnt;
        StdOut.printf("Average: %.5f\n", avg);
    }
}