class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode temp = head;

        // while loop for every node
        while(temp != null){
            ListNode KthNode = getKthNode(temp,k);
            // store the Kth node next element
            if(KthNode == null)
                break;
            ListNode next = KthNode.next;
            KthNode.next = null;
            // reverse the splitted list
            ListNode reversed = reverseList(temp);

            prev.next = reversed;
            temp.next = next;
            
            prev = temp; 
            temp = next;
        }

        return dummy.next;
    }
    
    // to get the kth node
    public static ListNode getKthNode(ListNode temp, int k){
        // traverse to k nodes in the list
        while(k > 1 && temp != null){
            temp = temp.next;
            k--;
        }
        return temp;
    }
    // to reverse the nodes 
    public static ListNode reverseList(ListNode temp){
        ListNode dummy = null;
        while(temp != null){
            ListNode next = temp.next;
            temp.next = dummy;
            dummy = temp;
            temp = next;
        }
        return dummy;
    }
}
