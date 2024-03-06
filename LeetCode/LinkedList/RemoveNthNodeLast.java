class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode calSize = head;
        int size = 0;
        while(calSize != null){
            calSize = calSize.next;
            size++;
        }
        // dec the n from the size
        ListNode temp = head;
        ListNode ans = temp;
        int i = 0;
        while(temp != null && (size - n - 1)  > i){
            temp = temp.next;
            i++;
        }
        if (size - n - 1  < 0) {
            return head.next;
        }
    
        if(temp.next != null)
            temp.next = temp.next.next;
        else 
            temp.next = null;
        return ans;
    }
}