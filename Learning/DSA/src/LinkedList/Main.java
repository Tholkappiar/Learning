package LinkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LL linked = new LL();
        linked.insertLast(4);
//        linked.insertLast(5);
//        linked.insertLast(6);
//        linked.insertLast(7);
//        linked.deleteFirst();
//        linked.deleteLast();
        linked.insert(1,20);
        System.out.println("this is the list");
        linked.display();
//        System.out.println(linked.getSize());
    }
}
