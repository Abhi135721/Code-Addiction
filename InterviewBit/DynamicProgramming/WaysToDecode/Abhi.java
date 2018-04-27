public class Abhi {
   
    static int countDecoding(char[] digits, int n) 
    {
        // base cases
        if (n == 0 || n == 1)
        return 1;
     
      
        int count = 0; 
     
        
        if (digits[n - 1] > '0')
        count = countDecoding(digits, n - 1);
     
        
        if (digits[n - 2] == '1' || 
           (digits[n - 2] == '2' && digits[n - 1] < '7'))
        count += countDecoding(digits, n - 2);
     
        return count;
    }
    public int numDecodings(String a) {
        char [] A = a.toCharArray();
        int n = A.length;
        if(A[0] == '0')
            return 0;
        return countDecoding(A , n);
    }
}
