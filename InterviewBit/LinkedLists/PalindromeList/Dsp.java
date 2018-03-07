/*
Given a singly linked list, determine if its a palindrome. Return 1 or 0 denoting if its a palindrome or not, respectively.

Notes:

Expected solution is linear in time and constant in space.
For example,

List 1-->2-->1 is a palindrome.
List 1-->2-->3 is not a palindrome.
*/
public class Solution {
    ListNode rev=null;
    public int lPalin(ListNode A) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ListNode temp=A,temp1;int len=0;
        while(temp!=null){
        len++;
         rev(temp);
         temp=temp.next;
        }
        if(len==0 || len==1)
        return 1;
        temp=A;
        temp1=rev;
        while(temp!=null && temp1!=null){
            if(temp.val!=temp1.val)
            return 0;
            temp=temp.next;
            temp1=temp1.next;
        }
        return 1;
    }
    void rev(ListNode x){
        ListNode a=new ListNode(x.val);
        if(rev==null)
        rev=a;
        else{
        a.next=rev;
        rev=a;
        }
    }
}
