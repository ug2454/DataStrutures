package linkedlist;

import node.DoubleNode;

public class DoubleCircularLinkedList {

    private int size;
    private DoubleNode head;
    private DoubleNode tail;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    DoubleNode createCircularDoubleLinkedList(int nodeValue) {
        head = new DoubleNode();
        DoubleNode node = new DoubleNode();
        node.setNodeValue(nodeValue);
        node.setPrev(node);
        node.setNext(node);
        tail = node;
        head = node;
        size = 1;
        return head;
    }

    public void insertIntoDoubleCircularLinkedList(int nodeValue, int location) {
        DoubleNode node = new DoubleNode();
        node.setNodeValue(nodeValue);
        if (!exist()) {
            System.out.println("Linked List does not exist");
            return;
        } else if (location == 0) {
            node.setNext(head);
            node.setPrev(tail);
            head.setPrev(node);
            tail.setNext(node);
            head = node;
        } else if (location >= size) {
            node.setNext(head);
            node.setPrev(tail);
            tail.setNext(node);
            head.setPrev(node);
            tail = node;
        } else {
            DoubleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.getNext();
            }
            node.setNext(tempNode.getNext());
            node.setPrev(tempNode);
            tempNode.setNext(node);
            node.getNext().setPrev(node);
        }
        size++;
    }

    private boolean exist() {
        return head != null;
    }

    public void traverseLinkedList() {

        if (exist()) {
            DoubleNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.getNodeValue());

                if (i != getSize()-1) {
                    System.out.print("->");
                }
                tempNode = tempNode.getNext();

            }
            System.out.println("\n");
        } else {
            System.out.println();
            return;
        }
    }

    public void traverseLinkedListReverse() {
        if (exist()) {
            DoubleNode tempNode = tail;
            for (int i = 0; i < getSize(); i++) {
                System.out.print(tempNode.getNodeValue());
                if (i != getSize() - 1) {
                    System.out.print("<-");
                }
                tempNode = tempNode.getPrev();
            }
            System.out.println("\n");
        } else {
            System.out.println();
        }
    }

    public void printHeadUsingTail() {
        if (exist()) {
            System.out.println("\n\n Printing Tail...");
            System.out.println(tail.getNodeValue());

            System.out.println("\n\n Printing Head...");
            System.out.println(head.getNodeValue());

            System.out.println("\n\n Printing Head using tail reference...");
            System.out.println(tail.getNext().getNodeValue());
        } else
            System.out.println("Linked List does not exist");
    }

    public void deleteLinkedList() {
        System.out.println("\n\nDeleting Linked List");
        if (tail == null) {
            System.out.println("Linked List is already deleted");
            return;
        } else {

            head.setPrev(null);
            head.setNext(null);
            head = tail = null;
            System.out.println("Linked List Deleted Successfully!!!");
        }
    }

    public boolean searchNode(int nodeValue) {
        DoubleNode tempNode = head;
        if (exist()) {
            for (int i = 0; i < size; i++) {
                if (tempNode.getNodeValue() == nodeValue) {
                    System.out.println("Node found at location " + i);
                    return true;
                }
                tempNode = tempNode.getNext();
            }
        }
        System.out.println("Node not found");
        return false;
    }

    public void deleteNodeFromLinkedList(int location) {
        if (!exist()) {
            System.out.println("Linked List does not exist");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head.setNext(null);
                head.setPrev(null);
                head = null;
                tail = null;
                setSize(getSize() - 1);
            } else {
                head = head.getNext();
                tail.setNext(head);
                head.setPrev(null);
                setSize(getSize() - 1);
            }
        } else if (location >= size) {
            if (getSize() == 1) { // if this is the only element in the list
                head.setNext(null);
                head.setPrev(null);
                tail = head = null;
                setSize(getSize() - 1);
                return;
            } else {
                tail = tail.getPrev();
                tail.setNext(head);
                head.setPrev(tail);
                setSize(getSize() - 1);
            }
        } else {
            DoubleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            tempNode.getNext().setPrev(tempNode);
            setSize(getSize() - 1);
        }

    }
}
