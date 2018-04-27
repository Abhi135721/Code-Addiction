public class Solution {
    public int numDecodings(String A) {
        char[] arr=A.toCharArray();
        int n=arr.length;
        if(arr[0]=='0')
        return 0;
        return solve(arr,n);
    }
    int solve(char[] arr,int n){
        if(n==0||n==1)
        return 1;
        int count=0;
        if(arr[n-1]>'0')count=solve(arr,n-1);
        if(arr[n-2]=='1' || (arr[n-2]=='2' && arr[n-1]<'7'))count=count+solve(arr,n-2);
        return count;
    }
}
