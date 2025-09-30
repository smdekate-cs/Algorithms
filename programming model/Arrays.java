public class Arrays {
    // find the maximum of array values
    public static double get_max(int[] a) {
        double max = a[0];
        for (int i = 0; i < a.length; i++)
            if (a[i] > max) max = a[i];
        
        return max;
    }

    // computer the average of array values
    public static double average(int[] a) {
        int N = a.length;
        double sum = 0.0;

        for (int i = 0; i < N; i++)
            sum += a[i];

        double avg = sum / N;
        return avg;
    }

    // copy to another array
    public static int[] copyArr(int[] a) {
        int N = a.length;
        int[] b = new int[N];

        for (int i = 0; i < N; i++)
            b[i] = a[i];
        
        return b;
    }

    // reverse the elements within an array
    public static void reverse(int[] a) {
        int N = a.length;
        for (int i = 0; i < N/2; i++) {
            int temp = a[i];
            a[i] = a[N-1-i];
            a[N-1-i] = temp;
        }
    }

    // print contents of array
    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    // square matrix multiplication
    public static double[][] matrixMul(double[][]a, double[][]b) {
        int N = a.length;
        double[][] c = new double[N][N];
        
        // Compute dot product of row i and column j
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                for (int k = 0; k < N; k++)
                    c[i][j] += a[i][k] * b[k][j];
        
        return c;
    }

    public static void main(String[] args) {
        double[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        double[][] b = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        double[][] c = matrixMul(a, b);

        int N = c.length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(c[i][j] + " ");

            System.out.println();
        }
    }
}