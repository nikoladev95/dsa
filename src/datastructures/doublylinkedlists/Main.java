package datastructures.doublylinkedlists;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(5);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.append(4);
        myDLL.append(3);
        myDLL.append(2);

        System.out.println("removeLast: Removed node with value: " + myDLL.removeLast().value);
        myDLL.prepend(1);
        System.out.println("removeFirst: Removed node with value: " + myDLL.removeFirst().value);
        myDLL.printList();

        System.out.println("Getting values of indexes 1 & 2: ");
        System.out.println(myDLL.get(1).value);
        System.out.println(myDLL.get(2).value + "\n");

        myDLL.printList();

        System.out.println("Setting value of an element with a index 0 to 3: " + myDLL.set(0, 3));
        myDLL.printList();

        System.out.println("Inserting 9 on index 1: " + myDLL.insert(1, 9));
        myDLL.printList();

        System.out.println("Removing an element at index 0: " + myDLL.remove(0).value);
        myDLL.printList();

    }
}
