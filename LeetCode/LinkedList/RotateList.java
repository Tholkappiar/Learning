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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        if(temp == null || temp.next == null || k == 0){
            return temp;
        }
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        temp = head;
        int j = k % size;
        ListNode prev = null;
        ListNode last = null;
        while(j>0){
            while(temp != null && temp.next != null){
                prev = temp;
                temp = temp.next;
            }
            last = prev.next;
            prev.next = null;
            last.next = head;
            head = last;
            j--;
        }
        return head;
    }

}
