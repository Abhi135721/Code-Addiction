public class Solution {
    static int c=0;static int d=0;
    public int coverPoints(int[] A, int[] B) {
        int min=0;
        c=A[0];d=B[0];
        if(A.length==1)return 0;
        else{
            for(int i=1;i<A.length;i++){
               min=min+getm(A[i],B[i]);
               c=A[i];d=B[i];
            }
        }
        return min;
    }
    public static int getm(int a,int b){
        int z=0,x=0,y=0;
        x=Math.abs(c-a);
        y=Math.abs(d-b);
        z=Integer.max(x,y);
        return z;
    }
}
