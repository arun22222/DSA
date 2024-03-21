import java.util.*;

class maxofarray {
    public static int findMaxRec(int A[], int n) {
        if (n == 1)
            return A[0];

        return Math.max(A[n - 1], findMaxRec(A, n - 1));
    }

    public static void main(String args[]) {
        int A[] = { 1, 2, 3, 4, 5, 6, -2 };
        int n = A.length;
        System.out.println(findMaxRec(A, n));
    }
}
