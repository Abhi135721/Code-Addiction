/*		GIVEN AN ARRAY FIND MAX CONTINUOUS NON NEGATIVE ARRAY with HIGHEST SUM
		For A : [1, 2, 5, -7, 2, 3]
		The two sub-arrays are [1, 2, 5] [2, 3].
		The answer is [1, 2, 5] as its sum is larger than [2, 3]
		Approach : Still I keep finding the negative number there is no chance of positive number or positive sum
		So keep adding from first positive till getting negative number , store the sum
		repeat this cycle and compare sums and if sums are equal compare lengths and if lengths are also equal compare which one's start index is lesser
*/
public class Abhi{
    public int[] maxset(int[] A) {
        int start = 0 , end = 0;
        long max_sum = 0 , sum = 0;
        int final_start = 0;
        boolean flag = false;
		//checking if everything is negative in the given array
        for(int i = 0; i < A.length ; i++){
			
            if(A[i] >= 0){
                flag = true;
                break;
            }
        }
        if(flag){
        for(int i = 0 ; i < A.length ; i++){
			//go on till you find positive number
            if(A[i] < 0){
                start = i + 1;
                sum = 0;
            }
            else{
                sum = sum + A[i];
				//checking two different sums and update with maximum sum
                if(sum > max_sum){
                    max_sum = sum;
                    final_start = start;
                    end = i;
                }
				// if both sums are equal then check for lengths
                else if(sum == max_sum){
                    if(i - final_start > i - start){
                        final_start = final_start;
                        //end = start - 1;
                    }
					//if lengths are equal update it with minimum index
                    else if(i - final_start == i - start){
                        final_start = final_start;
                        //end = start - 1;
                    }
                    else{
                        final_start = start;
                    }
                    if(start- 2 > 0)
                        end = start - 2;
                }
            }
        }
        
        int [] B = new int[end - final_start + 1];
        for(int i = 0 ; i <= end - final_start ; i++){
            B[i] = A[final_start + i];
        
        }
        return B;
        }
        else{
            int[] B = {};
            return B;
        }
    }
}
