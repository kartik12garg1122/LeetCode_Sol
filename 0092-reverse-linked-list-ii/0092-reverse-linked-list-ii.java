/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode lprev=null;
        ListNode curr=head;
       // ListNode great=head;
        for(int i=0;i<left-1;i++){
            lprev=curr;
            curr=curr.next;
        }

        ListNode final1=curr;
        ListNode prev=null;
        for(int i=0;i<(right-left)+1;i++){
            ListNode nextn=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextn;
        }
        if(lprev!=null){
            lprev.next=prev;
        }
        else{
            head=prev;
        }
        
        final1.next=curr;

        return head;
    }
}