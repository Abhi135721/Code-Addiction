/*
Question: Find minimum number of steps needed to go from one point to another point in an infinite grid

Approach: calculate the maximum needed steps of one point to another point

Edge cases:starting point is the goal to reach then steps is zero
 */

public class Solution {
    // c,d are starting points initially at 0,0
    static int c = 0;
    static int d = 0;

    public int coverPoints(int[] A, int[] B) {
        int min = 0;
        // c,d  shifted to given point
        c = A[0];
        d = B[0];
        if (A.length == 1) return 0;
        else {
            for (int i = 1; i < A.length; i++) {
                min = min + getmax(A[i], B[i]);
                c = A[i];
                d = B[i];
            }
        }
        return min;
    }

    public static int getmax(int a, int b) {
        int z = 0, x = 0, y = 0;
        x = Math.abs(c - a);
        y = Math.abs(d - b);
        z = Integer.max(x, y);
        return z;
    }
}
