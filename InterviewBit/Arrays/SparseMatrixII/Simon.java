/*
Question:	Given an integer n, generate a square matrix filled with elements from 1 to n^2 in spiral order.

Approach:	creste an empty 2d array of length A*A
			take 4 pointers which denotes the four extreme points which are the edges of unfilled matrix
			then iterate through all four directions
*/
public class Solution {
  public int[][] generateMatrix(int A) {
    // s is the variable to keep track of count 1,2,3...A^2
    int s = 1;
    int[][] matrix = new int[A][A];
    if (matrix.length == 0) return matrix;
    // defining four extreme edges
    int r1 = 0, r2 = matrix.length - 1;
    int c1 = 0, c2 = matrix[0].length - 1;
    while (r1 <= r2 && c1 <= c2) {
      // from top(left to right)
      for (int c = c1; c <= c2; c++) {
        matrix[r1][c] = s;
        s++;
      }
      // from right(top to bottom)
      for (int r = r1 + 1; r <= r2; r++) {
        matrix[r][c2] = s;
        s++;
      }
      if (r1 < r2 && c1 < c2) {
        // from bottom(right to left)
        for (int c = c2 - 1; c > c1; c--) {
          matrix[r2][c] = s;
          s++;
        }
        // from left(bottom to top
        for (int r = r2; r > r1; r--) {
          matrix[r][c1] = s;
          s++;
        }
      }
      // defining new edges
      r1++;
      r2--;
      c1++;
      c2--;
    }
    return matrix;
  }
}
