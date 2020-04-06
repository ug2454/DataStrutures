package linkedlist;

import static jdk.nashorn.internal.objects.Global.print;

public class SingleLinkedListMain {

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.createSingleLinkedList(10);
        list.traverseLinkedList();

        list.insertIntoLinkedList(10,1);
        list.traverseLinkedList();

        list.insertIntoLinkedList(20, 2);
        list.traverseLinkedList();

        list.insertIntoLinkedList(30, 2);
        list.traverseLinkedList();

        list.insertIntoLinkedList(40, 1);
        list.traverseLinkedList();

        list.insertIntoLinkedList(50, 2);
        list.traverseLinkedList();

        list.traverseLinkedList();
        System.out.println();

        System.out.println("\nSearching the node having value 40...");
        list.searchLinkedList(40);

        System.out.println("\nSearching the node having value 500...");
        list.searchLinkedList(500);

        System.out.println("\n\nDeleting the node having location = 0: ");
        System.out.println("Before Deletion:");
        list.traverseLinkedList();
        list.deletionOfNode(0);
        System.out.println("After Deletion:");
        list.traverseLinkedList();
        System.out.println();

        System.out.println("\n\nDeleting the node having location = 2: ");
        System.out.println("Before Deletion:");
        list.traverseLinkedList();
        list.deletionOfNode(2);
        System.out.println("After Deletion:");
        list.traverseLinkedList();
        System.out.println();


        System.out.println("\n\nDeleting the node having location = 100: ");
        System.out.println("Before Deletion:");
        list.traverseLinkedList();
        list.deletionOfNode(100);
        System.out.println("After Deletion:");
        list.traverseLinkedList();
        System.out.println();


        list.deleteLinkedList();
        list.traverseLinkedList();


    }

}
