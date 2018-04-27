public class Abhi {
    public int canJump(int[] A) {
        if(A.length <= 1)
        return 1;
 
        int max = A[0];
     
        for(int i=0; i<A.length; i++){
            
            if(max <= i && A[i] == 0) 
                return 0;
            if(i + A[i] > max){
                max = i + A[i];
            }
            if(max >= A.length-1) 
                return 1;
        }
     
        return 0;  
    }
}
