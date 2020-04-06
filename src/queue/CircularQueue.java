package queue;

public class CircularQueue {
    int top;
    int start;
    int[] arr;
    int size;

    public CircularQueue(int size) {
        this.arr = new int[size];
        this.top = -1;
        start = -1;
        this.size = size;

    }

    public void enqueue(int value) {
        if (arr == null) {
            System.out.println("array is not created. create one first nigga");
        } else if (isFull()) {
            System.out.println("Queue is full");
            return;
        } else {
            initializeStartOfArray();
            if (top + 1 == size) {
                top = 0;
            } else {
                top++;
            }
            arr[top] = value;
            System.out.println("\nSuccessfully inserted " + value + " in the queue");
        }
    }

    private void initializeStartOfArray() {
        if (start == -1) {
            start = 0;
        }
    }

    private boolean isFull() {
        if (top + 1 == start) { //if we have completed a circle, then we can say queu is full
            return true;
        } else if (start == 0 && (top + 1 == arr.length)) {
            return true;
        } else return false;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("\n---------------------------------------------");
            System.out.println("Before Dequeue..");
            printArray();
            System.out.println("\nDequeing value from Queue...");
            System.out.println("Dequeued: " + arr[start] + " from queue");
            arr[start] = 0; //initialize the unused cell to zero
            if (start == top) {  //for 1 element in array
                start = top = -1;
            } else if (start + 1 == arr.length) { //if start has reached end of array, make start to 0
                start = 0;
            } else
                start++;
        }
        System.out.println("After Dequeue..");
        printArray();
        System.out.println("---------------------------------------------");
    }

    public void printArray() {
        System.out.println("Array now...");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\nStart = " + start);
        System.out.println("End = " + top);
    }//end of method

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        } else {
            System.out.println("\nPeeking value from queue...");
            System.out.println(arr[start]);

        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else return false;
    }

    public void deleteStack() {
        System.out.println("\n\nDeleting the entire Queue...");
        arr = null;
        System.out.println("Queue is successfully deleted !");
    }
}
