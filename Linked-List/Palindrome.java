

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
    public boolean isPalindrome(ListNode head) {
        
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null &&  fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
           
        }
        // So the List will be reversed 
        // Starting from slow till Last
        // So Other part of the List will be revesres
        slow=reverse(slow);
        fast=head;
        //Now simply check for the Equivalencies till slow!=null and increment both pointers by 1
        while(slow!=null){
            if(slow.val!=fast.val){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        
        return true;
        
    }
    
    public ListNode reverse(ListNode head){
       if(head==null || head.next==null){
           return head;
       }
        
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
        
    }
}
