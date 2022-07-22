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
    public ListNode partition(ListNode head, int x) {
        
        // Will need to pointers
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode temp=head;
        // Will need two pointers 
        ListNode leftTemp=left;
        ListNode rightTemp=right;
         while (temp != null) {
            ListNode next = temp.next;
            temp.next = null;
            if (temp.val < x) {
                leftTemp.next = temp;
                leftTemp = leftTemp.next;
            } else {
                rightTemp.next = temp;
                rightTemp = rightTemp.next;
            }
            
            temp = next;
        }
        // Then we simply merge the nodes
        leftTemp.next = right.next;
        
        return left.next;
        
        
    }
}
