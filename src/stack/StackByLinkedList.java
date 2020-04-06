package stack;

import linkedlist.SingleLinkedList;

public class StackByLinkedList {

    SingleLinkedList list;

    public StackByLinkedList() {
        list = new SingleLinkedList();
    }

    public void push(int value) {
        if (list.getHead() == null) {
            list.createSingleLinkedList(value);
        } else {
            list.insertIntoLinkedList(value, 0);
        }
        System.out.println("Inserted " + value + " in stack!!!");

    }

    public int pop() {
        int value = -1;
        if (list.getHead() == null) {
            System.out.println("list is empty");
        } else {
            value = list.getHead().getNodeValue();
            list.deletionOfNode(0);
        }
        return value;
    }
    public int seek(){
        int value=-1;
        if(list.getHead()==null){
            System.out.println("List is empty");
        }
        else{
            value=list.getHead().getNodeValue();
        }
        return value;
    }

    public void deletestack(){
        list.setHead(null);
    }

}
