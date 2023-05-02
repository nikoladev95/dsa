package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

//        myLinkedList.append(3);

//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast().value);
//        myLinkedList.printList();
//
//        myLinkedList.prepend(6);
//
//        myLinkedList.printList();

//        myLinkedList.removeFirst();

        myLinkedList.append(2);
        myLinkedList.append(0);

        System.out.println(myLinkedList.getByIndex(2).value + "\n");
        myLinkedList.printList();

        System.out.println(myLinkedList.setByIndex(6, 9));
        myLinkedList.printList();

        System.out.println(myLinkedList.setByIndex(2, 9));
        myLinkedList.printList();

//        myLinkedList.insert(2, 3);
        System.out.println(myLinkedList.insert(3, 3));
        myLinkedList.printList();

        myLinkedList.remove(1);
        System.out.println("after removing:" + "\n");
        myLinkedList.printList();

    }
}