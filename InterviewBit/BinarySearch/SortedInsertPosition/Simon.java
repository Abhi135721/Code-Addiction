/*
Question:	Given a sorted array and a target value, return the index if the target is found. 
			If not, return the index where it would be if it were inserted in order.

Approach:	Since the Array is sorted use the binary search to search the key
			if key is not there then find a index where the previous element is lesser than key
			and next element is greater than key
			ForExample:
			Input:{1,2,3,5,6,7} key=4
			Output:
			At 3rd index 5>4 and 4<3 hence return 3

Edgecases:	if input is empty return 0
*/
public class Solution {
	public int searchInsert(ArrayList<Integer> a, int key){
     int l=a.size();
     int low=0;
     int high=l-1;
     int mid=0;
     int s=0;
     if(a.get(mid)==key)return mid;
     while(a.get(mid)!=key && high >= low){
          mid = (high+low)/2;
          if(mid==l-1){
              if(a.get(mid)<key)return mid+1;
          }
          if(a.get(mid)<key && a.get(mid+1)>key)return mid+1;
          if(a.get(mid) == key)return mid;
          else if(key > a.get(mid))low = mid + 1;
          else if(key < a.get(mid)) high = mid - 1;
     }return 0;
	}
}
