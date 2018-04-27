public class Solution {
 public int uniquePathsWithObstacles(int[][] A) {
  if (A.length == 1 && A[0].length == 1) {
   if (A[0][0] == 0)
    return 1;
   else
    return 0;
  }
  int[][] ways = new int[A.length][A[0].length];
  for (int i = 0; i < A.length; i++) {
   for (int j = 0; j < A[0].length; j++) {
    if (i == 0 && j == 0) {
     if (A[i][j] == 1)
      return 0;
     ways[i][j] = 1;
    }
    if (A[i][j] == 1) {
     ways[i][j] = 0;
     continue;
    }
    if (i == 0 && j != 0)
     ways[i][j] += ways[i][j - 1];
    else if (j == 0 && i != 0)
     ways[i][j] += ways[i - 1][j];
    else if (i != 0 && j != 0)
     ways[i][j] += ways[i][j - 1] + ways[i - 1][j];
   }
  }
  return ways[A.length - 1][A[0].length - 1];
 }
}
