package node;

public class SingleNode {
    private int nodeValue;
    private SingleNode next;

    public int getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(int nodeValue) {
        this.nodeValue = nodeValue;
    }

    public SingleNode getNext() {
    return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return nodeValue+" ";
    }
}
