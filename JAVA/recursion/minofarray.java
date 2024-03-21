import java.util.*;

class minofarray {
    public static int findMinRec(int A[], int n) {
        if (n == 1)
            return A[0];

        return Math.min(A[n - 1], findMinRec(A, n - 1));
    }

    public static void main(String args[]) {
        int A[] = { 1, 3, 27, 6, 43, 11, 20 };
        int n = A.length;

        System.out.println(findMinRec(A, n));
    }
}
