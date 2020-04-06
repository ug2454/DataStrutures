package queue;

public class CircularQueueMain {
    public static void main(String[] args) {
        System.out.println("Creating an empty queue...");
        CircularQueue queue = new CircularQueue(5);

        System.out.println("\nEnqueuing 5 values in the queue...");
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i * 10);
        }
        queue.enqueue(60);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(60);
        queue.printArray();
        queue.dequeue();
        queue.printArray();
        queue.deleteStack();
    }
}
