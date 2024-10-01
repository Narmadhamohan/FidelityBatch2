/*

Custome stack using array

*/


class CustomStack {
    private int arr[];
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    CustomStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Add an element to the stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // Remove and return the top element of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Return the top element without removing it
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        return -1;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }
    
    // Return the size of the stack
    public int size() {
        return top + 1;
    }
}

public class StackDemo {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is " + stack.peek());
        stack.pop();
        System.out.println("Stack size is " + stack.size());
    }
}
