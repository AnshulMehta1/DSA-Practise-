
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1=list1;
        ListNode p2=list2;
        ListNode res = new ListNode();
        ListNode curr = res;
        int temp = 0; // holds the value from a node;
        while(p1!=null && p2!=null){
            if(p1.val<p2.val){
                temp=p1.val;
                p1=p1.next;
            }
            else{
                temp=p2.val;
                p2=p2.next;
            }
            
            ListNode node = new ListNode(temp); //creates a new node with the value we stored
            curr.next = node;
            curr = curr.next;
            
        }
        // Case - 1 Pointer 1 has elements left
        while(p1!=null){
            ListNode node = new ListNode(p1.val);
            curr.next = node;
            p1=p1.next;
            curr = curr.next;
            
        }
        
        while(p2!=null){
            ListNode node = new ListNode(p2.val);
            curr.next = node;
            p2=p2.next;
            curr = curr.next;
            
        }
        return res.next;
        
    }
    
  
}
