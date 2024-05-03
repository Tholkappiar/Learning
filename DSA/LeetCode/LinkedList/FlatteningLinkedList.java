class GfG {
    Node flatten(Node root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        Node temp = root;
        Node nextHead = null;
        // loop to traverse the linked list
        while (temp != null) {
            if (temp.bottom != null) {
                nextHead = temp.next;
                // bottom
                Node bottom = temp;
                while (bottom != null) {
                    arr.add(bottom.data);
                    bottom = bottom.bottom;
                }
                temp = nextHead;
            } else {
                arr.add(temp.data);
                temp = temp.next;
            }
        }
        Collections.sort(arr);

        Node result = new Node(-1);
        Node current = result;
        for (int i = 0; i < arr.size(); i++) {
            Node temp2 = new Node(arr.get(i));
            current.bottom = temp2;
            current = current.bottom;
        }
        return result.bottom;
    }
}