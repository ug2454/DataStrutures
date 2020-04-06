package linkedlist;

public class BinaryTreeByArray {
    private int[] arr;
    private int lastUsedIndex;

    public BinaryTreeByArray(int size) {
        arr = new int[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Blank tree of size " + size + " has been created!.");
    }

    public void insertInTree(int value) {

        if(isTreeFull()){
            System.out.println("tree is full. oh no :( ");
            return;
        }
        else{
            arr[lastUsedIndex+1]=value;
            lastUsedIndex++;
            System.out.println("Value successfully inserted in tree. hooray!");
        }

    }
    public int searchInBinaryTree(int value){
        for (int i = 0; i <= lastUsedIndex; i++) {
            if(arr[i]==value){
                System.out.print(value +" exists in the Tree! ");
                System.out.println("It is at the location: " + i);
                return i;
            }
        }
        System.out.println(value + " does not exists in Tree !");
        System.out.println();
        return -1;
    }

    public void preOrderTraversal(int index){
        if(index>lastUsedIndex){
            return;
        }
        else{
            System.out.println("value: "+arr[index]);
            preOrderTraversal(index*2);
            preOrderTraversal((index*2)+1);

        }
    }
    public void inOrderTraversal(int index){
        if(index>lastUsedIndex){
            return;
        }
        else{
            inOrderTraversal(index*2);
            System.out.println("value: "+arr[index]);
            inOrderTraversal((index*2)+1);
        }
    }
    public void postOrderTraversal(int index){
        if(index>lastUsedIndex){
            return;
        }
        else{
            postOrderTraversal(index*2);
            postOrderTraversal((index*2)+1);
            System.out.println("value: "+arr[index]);
        }
    }

    public void levelOrderTraversal(){
        for(int i=0;i<=lastUsedIndex;i++){
            System.out.println("value: "+arr[i]);
        }
    }
    public void deleteFromBinaryTree(int value){
        for(int i=0;i<=lastUsedIndex;i++){
            if(arr[i]!=value){
                System.out.println("Value not found");
            }
            else{
                System.out.println("Value found at index"+i);
                arr[i]=arr[lastUsedIndex];
                lastUsedIndex--;
            }
        }

        System.out.println("Successfully deleted "+value+" from tree! yeah bitch");
    }

    public boolean isTreeFull() {
        if (arr.length - 1 == lastUsedIndex)
            return true;
        return false;
    }

    public void deleteTree(){
        try {
            arr = null;
            System.out.println("Tree has been successfully deleted");
        }catch (Exception e){
System.out.println("There was some error in deleting the tree");
        }
    }
}
