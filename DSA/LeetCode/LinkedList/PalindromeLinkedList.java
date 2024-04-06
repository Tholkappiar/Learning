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
        
        // find the mid using the fast and slow pointer 
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse the 1st part 
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != slow){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // move the slow pointer to next if the fast is not null - for odd nodes
        if(fast != null)
            slow = slow.next;
        // compare 1st and 2nd parts and return the boolean
        while(prev != null){
            if(prev.val != slow.val){
                return false;
            }
            else{
                prev = prev.next;
                slow = slow.next;
            }
        }
        
        return true;
    }
}