package linkedlist;

public class SingleCircularLinkedListMain {
    public static void main(String[] args) {
        SingleCircularLinkedList list = new SingleCircularLinkedList();
        list.SingleCircularLinkedList(5);
        list.insertInCircularSingleLinkedList(10, 1);
        list.insertInCircularSingleLinkedList(20, 2);
        list.insertInCircularSingleLinkedList(30, 3);
        list.insertInCircularSingleLinkedList(40, 4);

        System.out.println("Linked List now: ");
        list.traverseSingleCircular();

        list.insertInCircularSingleLinkedList(35, 4);
        list.traverseSingleCircular();

        list.insertInCircularSingleLinkedList(1, 0);
        list.traverseSingleCircular();

        list.insertInCircularSingleLinkedList(100, 10);
        list.traverseSingleCircular();


        list.printHeadUsingTail();

        System.out.println("Searching the node having value 40: ");
        list.searchSingleCircularLinkedList(40);

        System.out.println("\n\nSearching the node having value 200: ");
        list.searchSingleCircularLinkedList(200);


        System.out.println("\n\nDeleting the node having location = 2: ");
        System.out.println("Before deletion...");
        list.traverseSingleCircular();
        list.deletionOfNode(2);
        System.out.println("After deletion...");
        list.traverseSingleCircular();


        System.out.println("\n\nDeleting the node having location = 0: ");
        System.out.println("Before deletion...");
        list.traverseSingleCircular();
        list.deletionOfNode(0);
        System.out.println("After deletion...");
        list.traverseSingleCircular();


        System.out.println("\n\nDeleting the node having location = 15: ");
        System.out.println("Before deletion...");
        list.traverseSingleCircular();
        list.deletionOfNode(15);
        System.out.println("After deletion...");
        list.traverseSingleCircular();


        System.out.println("\n\nDeleting the node having location = 15: ");
        System.out.println("Before deletion...");
        list.traverseSingleCircular();
        list.deletionOfNode(15);
        System.out.println("After deletion...");
        list.traverseSingleCircular();


        list.deleteLinkedList();
        list.traverseSingleCircular();
    }
}
