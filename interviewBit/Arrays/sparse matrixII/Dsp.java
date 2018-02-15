/*
generate a square matrix filled with elements from 1 to n2 in spiral order.
*/

public class Solution {
    public int[][] generateMatrix(int A) {
        int rowStart=0,b=0;
  int[][] a=new int[A][A];
  int rowLength=A-1;b=1;
  int colStart=0;
  int colLength = A-1;
   while(rowStart <= rowLength && colStart <= colLength){
    for (int i = rowStart; i <= colLength; i++) {//go upto end of column
    a[rowStart][i]=b;b++;
   }
   for (int j = rowStart+1; j <= rowLength; j++) {// go upto end of row
    a[j][colLength]=b;b++;
   }
   if(rowStart+1 <= rowLength){
    for (int k = colLength-1; k >= colStart; k--) {
     a[rowLength][k]=b;b++;
    }
   }
   if(colStart+1 <= colLength){
    for (int k = rowLength-1; k > rowStart; k--) {
     a[k][colStart]=b;b++;
    }
   }
   rowStart++;
   rowLength--;
   colStart++;
   colLength--;
  }
  return a;
    }
}
