/*

Implement own queue using array
*/
class CustomQueue {
    private int arr[];
    private int front, rear, capacity;
    private int count;

    // Constructor to initialize the queue
    CustomQueue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Add an element to the queue
    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        count++;
    }

    // Remove and return the front element of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int x = arr[front];
        front = (front + 1) % capacity;
        count--;
        return x;
    }

    // Return the front element without removing it
    public int peek() {
        if (!isEmpty()) {
            return arr[front];
        }
        return -1;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return count == capacity;
    }

    // Return the size of the queue
    public int size() {
        return count;
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element is " + queue.peek());
        queue.dequeue();
        System.out.println("Queue size is " + queue.size());
    }
}
