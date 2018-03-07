/*
Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists, and should also be sorted.

For example, given following linked lists :

  5 -> 8 -> 20 
  4 -> 11 -> 15
The merged list should be :

4 -> 5 -> 8 -> 11 -> 15 -> 20
*/

public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode merge=null;
        ListNode temp=A;
        ListNode temp1=B;
        
        if(A.val>B.val){
            merge=new ListNode(B.val);
            temp1=temp1.next;
        }
        else{
        merge=new ListNode(A.val);
        temp=temp.next;
        }
        ListNode temp2=merge;
        while(temp!=null && temp1!=null){
            if(temp.val>temp1.val){
                ListNode a=new ListNode(temp1.val);
                temp2.next=a;
                temp2=temp2.next;
                temp1=temp1.next;
            }
            else{
                ListNode a=new ListNode(temp.val);
                temp2.next=a;
                temp2=temp2.next;
                temp=temp.next;
            }
        }
        while(temp!=null){
            ListNode a=new ListNode(temp.val);
            temp2.next=a;
                temp2=temp2.next;
                temp=temp.next;
        }
        while(temp1!=null){
             ListNode a=new ListNode(temp1.val);
             temp2.next=a;
                temp2=temp2.next;
                temp1=temp1.next;
        }
        return merge;
    }
}
