package datastructures.stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(4);

        stack.push(3);
        stack.push(1);
        stack.pop();

        stack.printStack();

//        System.out.println("Popped node with value: " + stack.pop().value );
//        stack.printStack();
    }
}
