package datastructures.queue;

public class Main {
    public static void main(String[] args) {
        Queue myQ = new Queue(4);

        myQ.dequeue();

        myQ.enqueue(2);

        myQ.dequeue();

        myQ.printQueue();
    }
}
