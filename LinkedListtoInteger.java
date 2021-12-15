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
    public int getDecimalValue(ListNode head) {
        int answer = 0;
        for(ListNode temp =  head;temp!=null;temp=temp.next){
            answer =  (answer<<1)+temp.val;
        }                
        return answer; 
        
    }
}
