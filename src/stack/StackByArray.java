package stack;

public class StackByArray {
    private int topOfStack;
    private int arr[];

    public StackByArray(int size) {
        this.arr = new int[size];
        topOfStack = -1;
        System.out.println("successfully created an empty stack of size" + size);
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("Successfully inserted " + value + " in the stack");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popping value from Stack: " + arr[topOfStack] + "...");
            topOfStack--;
        }
    }

    private boolean isEmpty() {
        if (topOfStack == -1)
            return true;
        else
            return false;
    }

    private boolean isFull() {
        if (topOfStack == arr.length - 1)
            return true;
        else
            return false;
    }

    public void seek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(arr[topOfStack]);
        }
    }

    public void deleteStack() {
        arr = null;
        System.out.println("Stack successfully deleted");
    }


}
