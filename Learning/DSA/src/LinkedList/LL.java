package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }
        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    public void insertFirst(int value){
        Node new_node = new Node(value);
        if(head==null)
            tail = new_node;
        new_node.next = head;
        head = new_node;
        size++;

    }
    public void insertLast(int value){
        Node new_node = new Node(value);
        if(head == null){
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            tail = new_node;
        }
        size++;
    }

    public void  display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public int getSize() {return size;}


    public int deleteFirst(){
        Node temp = head;
        temp = temp.next;
        head = temp;
        if(head==null)
            tail = null;
        size--;
        if(temp != null)
            return temp.value;
        return 0;
    }
    public int deleteLast(){
        Node temp = head;

        if(temp.next == null){
            int value = head.value;
            head = head.next;
            size--;
            return value;
        }
        while(temp.next.next != null){
            temp = temp.next;
        }
        int value = temp.next.value;
        temp.next = null;
        size--;
        return value;
    }

    public void insert(int index, int value){
        if(index==0) {
            insertFirst(value);
            return;
        }
        if(index==size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = new Node(value , temp.next);
        size++;
    }

}
