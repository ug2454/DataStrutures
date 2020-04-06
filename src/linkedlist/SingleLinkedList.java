package linkedlist;

import node.SingleNode;

public class SingleLinkedList {
    private SingleNode head;
    private SingleNode tail;
    private int size;

    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public SingleNode getTail() {
        return tail;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public SingleNode createSingleLinkedList(int nodeValue) {
        head = new SingleNode();
        System.out.println(head);
        SingleNode node = new SingleNode();
        node.setNodeValue(nodeValue);
        node.setNext(null);
        head = node;
        tail = node;
        size = 1;
        return head;

    }

    public void insertIntoLinkedList(int nodeValue, int location) {
        SingleNode node = new SingleNode();
        node.setNodeValue(nodeValue);
        if (!existLinkedList()) {
            System.out.println("Linked list does not exist!!!");
            return;
        } else if (location == 0) {
            node.setNext(head);
            head = node;
        } else if (location >= size) {
            node.setNext(null);
            tail.setNext(node);
            tail = node;
        } else {
            SingleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.getNext();
            }
            SingleNode nextNode = tempNode.getNext();
            node.setNext(nextNode);
            tempNode.setNext(node);
        }
        setSize(getSize() + 1);
    }

    private boolean existLinkedList() {
        return head != null;
    }

    public void traverseLinkedList() {
        if (!existLinkedList()) {
            System.out.println("Linked list does not exist!!!");
            return;
        } else {
            SingleNode tempNode = head;
            for (int i = 0; i < getSize(); i++) {
                System.out.print(tempNode.getNodeValue());
                if (i != getSize() - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.getNext();
            }
            System.out.println("\n");

        }

    }

    public void deleteLinkedList() {
        System.out.println("\n\n Deleting linked list...");
        head = null;
        tail = null;
        System.out.println("Linked List deleted successfully!!!");
    }

    public boolean searchLinkedList(int valueToSearch) {
        if (existLinkedList()) {
            SingleNode tempNode = head;
            for (int i = 0; i < getSize(); i++) {
                if (tempNode.getNodeValue() == valueToSearch) {
                    System.out.println("Node found at " + i + "\n");
                    return true;
                }
                tempNode = tempNode.getNext();
            }
        }
        System.out.println("Node not found!!! \n");
        return false;
    }

    public void deletionOfNode(int location) {
        if (!existLinkedList()) {
            System.out.println("Linked List does not exist");
        } else if (location == 0) {
            head=head.getNext();
            setSize(getSize()-1);
            if(size==0){
                tail=null;
            }

        }
        else if(location>=getSize()){
            SingleNode tempNode = head;
            for(int i=0;i<size-1;i++){
                tempNode=tempNode.getNext();
            }
                if(tempNode==head){
                    tail=head=null;
                    setSize(getSize()-1);
                    return;
                }
                 tempNode.setNext(null);
                tail=tempNode;


                setSize(getSize()-1);

        }
        else{
            SingleNode tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            setSize(getSize()-1);
        }
    }
}