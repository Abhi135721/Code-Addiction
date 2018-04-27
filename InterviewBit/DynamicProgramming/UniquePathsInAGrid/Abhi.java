public class Abhi {
    public int uniquePathsWithObstacles(int[][] A) {
        int [][] B = new int[A.length + 1][A[0].length + 1];
        if(A[0][0] == 0)
            B[0][0] = 1;
        for(int i = 1 ; i < A.length ; i++){
            if(A[i][0] == 0)
                B[i][0] = B[i - 1][0];
        }
        
        for(int i = 1 ; i < A[0].length ; i++){
            if(A[0][i] == 0)
                B[0][i] = B[0][i - 1];
        }
        
        for(int i = 1 ; i < A.length ; i++){
            for(int j = 1 ; j < A[0].length ; j++){
                if(A[i][j] == 0){
                    B[i][j] = B[i - 1][j] + B[i][j - 1];
                }
            }
        }
        return B[A.length - 1][A[0].length - 1];
    }
}
