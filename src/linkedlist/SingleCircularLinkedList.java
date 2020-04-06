package linkedlist;

import node.SingleNode;

public class SingleCircularLinkedList {
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

    SingleNode SingleCircularLinkedList(int nodeValue){
        head = new SingleNode();
        SingleNode node = new SingleNode();
        node.setNodeValue(nodeValue);
        node.setNext(head);
        head=node;
        tail=node;
        size=1;
        return head;
    }

    public void insertInCircularSingleLinkedList(int nodeValue, int location) {
        SingleNode node = new SingleNode();
        node.setNodeValue(nodeValue);
        System.out.println("Inserting new node at location " + location);
        if (!existList()) {
            System.out.println("Linked List does not exist!!!");
            return;
        } else if (location == 0) {

            node.setNext(head);
            head = node;
            tail.setNext(node);
        } else if (location >= size) {
            tail.setNext(node);
            tail = node;
            tail.setNext(head);
        }
            else {
            SingleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.getNext();
            }
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);

        }
        setSize(getSize() + 1);
    }

    public boolean existList(){
        return head!=null;
    }

    public void traverseSingleCircular() {
        if (existList()) {
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
        else {
            System.out.println("Linked list does not exist!!!");
        }
    }
    boolean searchSingleCircularLinkedList(int nodeValue){
        if(existList()){
            SingleNode tempNode=head;
            for(int i=0;i<getSize();i++){
                if(tempNode.getNodeValue()==nodeValue){
                    System.out.println("node found at location "+i);
                    return true;
                }
                tempNode=tempNode.getNext();
            }
        }

            System.out.println("Node not found");
        return false;
    }
    void printHeadUsingTail() {
        if (existList()) {
            System.out.println("Printing Tail...");
            System.out.println(tail.getNodeValue());

            System.out.println("Printing Head using Head reference...");
            System.out.println(head.getNodeValue());

            System.out.println("Printing Head using Tail reference...");
            System.out.println(tail.getNext().getNodeValue());

        }else{
            System.out.println("Linked List does not exists");
        }
    }
    void deleteLinkedList() {
        System.out.println("\n\nDeleting Linked List...");
        head = null;
        if(tail == null) {
            System.out.println("Linked List is already deleted, nothing to delete !");
            return;
        }else {
            tail.setNext(null);
            tail = null;
            System.out.println("Linked List deleted successfully !");
        }
    }
    public void deletionOfNode(int location){
        if(!existList()){
            System.out.println("Linked list does not exist");
            return;
        }
        else if(location==0){
            head=head.getNext();
            tail.setNext(head);
            setSize(getSize()-1);
            if(size==0){
                tail=null;
            }
        }
        else if(location>=getSize()) {
            SingleNode tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.getNext();
            }
            if (tempNode == head) {
                tail = head = null;
                setSize(getSize() - 1);
            }
            tempNode.setNext(head);
            tail = tempNode;
            setSize(getSize() - 1);

        }
        else {
            SingleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            setSize(getSize() - 1);
        }



    }

}
