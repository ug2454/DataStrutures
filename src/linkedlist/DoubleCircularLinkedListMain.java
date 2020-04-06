package linkedlist;

public class DoubleCircularLinkedListMain {

    public static void main(String[] args) {
        DoubleCircularLinkedList list = new DoubleCircularLinkedList();
        list.createCircularDoubleLinkedList(5);
        list.insertIntoDoubleCircularLinkedList(10, 1);
        list.insertIntoDoubleCircularLinkedList(20, 2);
        list.insertIntoDoubleCircularLinkedList(30, 2);
        list.insertIntoDoubleCircularLinkedList(40, 1);

        System.out.println("List Now: ");
        list.traverseLinkedList();

        list.traverseLinkedListReverse();
        list.printHeadUsingTail();


        System.out.println("\nSearching the node having value 40: ");
        list.searchNode(40);

        System.out.println("\nSearching the node having value 200: ");
        list.searchNode(200);


        System.out.println("\n\nDeleting the node having location = 0: ");
        System.out.println("Before Deletion...");
        list.traverseLinkedList();
//        list.deleteNodeFromLinkedList(0);
        System.out.println("After Deletion...");
        list.traverseLinkedList();

        System.out.println("\n\nDeleting the node having location = 3: ");
        System.out.println("Before Deletion...");
        list.traverseLinkedList();
        list.deleteNodeFromLinkedList(2);
        System.out.println("After Deletion...");
        list.traverseLinkedList();

        System.out.println("\n\nDeleting the node having location = 20: ");
        System.out.println("Before Deletion...");
        list.traverseLinkedList();
        list.deleteNodeFromLinkedList(3);
        System.out.println("After Deletion...");
        list.traverseLinkedList();


        list.deleteLinkedList();
        list.traverseLinkedList();

    }
}
