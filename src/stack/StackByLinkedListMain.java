package stack;

public class StackByLinkedListMain {
    public static void main(String[] args) {

        StackByLinkedList stack = new StackByLinkedList();
System.out.println("Inserting 10 values in stack");
for(int i=0;i<=10;i++){
stack.push(i*10);

}
System.out.println();

System.out.println("Peeking value");
System.out.println(stack.seek());
System.out.println();

System.out.println("Popping 11 values from stack");
for(int i=0;i<=11;i++){
    System.out.println(stack.pop());
}
System.out.println();

System.out.println("Deleting Stack...");
stack.deletestack();
System.out.println("Stack successfully deleted!!!");
    }
}
