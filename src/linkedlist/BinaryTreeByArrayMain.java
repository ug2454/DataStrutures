package linkedlist;

public class BinaryTreeByArrayMain {
    public static void main(String[] args) {
        BinaryTreeByArray tree = new BinaryTreeByArray(10);

        for (int i = 0; i <= 10; i++) {
            tree.insertInTree(i * 10);
        }

//Level order Traverse
        System.out.println("\nLevel-order Traversal:");
        tree.levelOrderTraversal();


        //Pre order Traverse
        System.out.println("\n\nPre-order Traversal:");
        tree.preOrderTraversal(1);


        //Post order Traverse
        System.out.println("\n\nPost-order Traversal:");
        tree.postOrderTraversal(1);

        //In order Traverse
        System.out.println("\n\nIn-order Traversal:");
        tree.inOrderTraversal(1);


        //Search for value in Tree
        System.out.println("\n\nSearching value 500 in the tree...");
        tree.searchInBinaryTree(500);


        //Search for value in Tree
        System.out.println("Searching value 40 in the tree...");
        tree.searchInBinaryTree(40);


        //Delete value from Tree
        System.out.println("\nDeleting node 500 from the tree...");
        tree.deleteFromBinaryTree(500);


        //Delete value from Tree
        System.out.println("Deleting node 40 from the tree...");
        tree.deleteFromBinaryTree(40);


        //Level order Traverse
        System.out.println("\nLevel-order Traversal:");
        tree.levelOrderTraversal();


        //Delete the entire Tree
        System.out.println("\n\nDeleting the entire Tree...");
        tree.deleteTree();
    }
}
