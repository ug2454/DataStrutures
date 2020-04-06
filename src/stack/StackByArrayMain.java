package stack;

public class StackByArrayMain {
    public static void main(String[] args) {

        StackByArray stack = new StackByArray(5);

        System.out.println("Pushing 6 values in stack!!!");
        for (int i = 0; i <= 5; i++) {
            stack.push(i * 10);
        }

        System.out.println("Peeking from stack");
        stack.seek();

        System.out.println("Popping 6 values from stack");
        for (int i = 0; i <= 5; i++) {
            stack.pop();
        }
        System.out.println("Deleting the stack...");
        stack.deleteStack();
    }


}
