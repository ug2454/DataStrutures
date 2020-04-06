package linkedlist;

import node.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeByLinkedList {
    BinaryNode root;

    BinaryTreeByLinkedList() {
        this.root = null;
    }

    public void insertIntoBinaryTree(int value) {
        BinaryNode node = new BinaryNode();
        node.setValue(value);

        if (root == null) {
            root = node;
            System.out.println("Successfully inserted node at root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);                                    //to add root in queue so that queue isEmpty condition will not be true.
        while (!queue.isEmpty()) {
            BinaryNode tempNode = queue.remove();
            if (tempNode.getLeft() == null) {
                tempNode.setLeft(node);
                System.out.println("node successfully inserted");
                break;

            } else if (tempNode.getRight() == null) {
                tempNode.setRight(node);
                System.out.println("node successfully inserted");
                break;
            } else {
                queue.add(tempNode.getLeft());
                queue.add(tempNode.getRight());
            }
        }

    }

    public void search(int value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.getValue() == value) {
                System.out.println("Value " + value + " is found in tree");
                return;
            } else {
                if (presentNode.getLeft() != null) {                  //condition to check if there is node present in left node/child,
                    queue.add(presentNode.getLeft());              // then adding it to queue
                }
                if (presentNode.getRight() != null) {
                    queue.add(presentNode.getRight());
                }
            }
        }
        System.out.println("Value " + value + " is not found in tree");
    }

    public void deleteNodeFromBinaryTree(int value) {
        Queue<BinaryNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();

            if (presentNode.getValue() == value) {
                presentNode.setValue(getDeepestNode().getValue());
                deleteDeepestNode();
                System.out.println("Node deleted. yeah bitch.");
                return;

            } else {
                if (presentNode.getLeft() != null) {
                    queue.add(presentNode.getLeft());
                }
                if (presentNode.getRight() != null) {
                    queue.add(presentNode.getRight());
                }
            }

        }
        System.out.println("Node was not found sad :( ");
    }

    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();

            if (presentNode.getLeft() == null) {
                previousNode.setRight(null);
                return;
            } else if (presentNode.getRight() == null) {
                presentNode.setLeft(null);
                return;
            }
            queue.add(presentNode.getLeft());
            queue.add(presentNode.getRight());
        }
    }

    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.getLeft() != null) {
                queue.add(presentNode.getLeft());
                break;
            } else if (presentNode.getRight() != null) {
                queue.add(presentNode.getRight());
            }
        }

        return presentNode;
    }

    public void preOrderTraversal(BinaryNode node) {
        if (node == null) {
            return;
        }
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
        System.out.println(node.getValue() + " ");
    }

    public void inOrderTraversal(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.getLeft());
        System.out.println(node.getValue() + " ");
        inOrderTraversal(node.getRight());
    }

    public void postOrderTraversal(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.getLeft());
        postOrderTraversal(node.getRight());
        System.out.println(node.getValue() + " ");
    }

    public void levelOrderTraversal() {
        if (root == null) {
            System.out.println("error");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.println(presentNode.getValue() + " ");
            if (presentNode.getLeft() != null) {
                queue.add(presentNode.getLeft());
            }
            if (presentNode.getRight() != null) {
                queue.add(presentNode.getRight());
            }
        }
    }

    public void deleteTree(){
        root=null;
System.out.println("Tree is deleted. Oh NO 😢 ");
    }


}


