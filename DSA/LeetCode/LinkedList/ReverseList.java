class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode next = null;
        ListNode dummy = null;

        while(head != null){
            next = head.next;
            head.next = dummy;
            dummy = head;
            head = next;
        }
        return dummy;
    }
}