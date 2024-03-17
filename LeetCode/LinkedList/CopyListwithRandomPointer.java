/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hashmap = new HashMap<>();

        Node current = head;
        while(current != null){
            hashmap.put(current, new Node(current.val));
            current = current.next;
        } 

        current = head;
        while(current != null){
            hashmap.get(current).next = hashmap.get(current.next);
            hashmap.get(current).random = hashmap.get(current.random);
            current = current.next;
        }

        return hashmap.get(head);
    }
}