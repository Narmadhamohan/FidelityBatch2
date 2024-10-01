import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Using Queue interface with LinkedList class
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue after add operations: " + queue);

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());

        // Remove elements from the queue
        queue.poll();
        System.out.println("Queue after poll operation: " + queue);

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
