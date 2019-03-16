package BinarySearchTree;

public class BinarySearchTree {
   private Node root = null;

    public void insert(int data){
        if(root == null){
            root = new Node(data);
        }
    }
}
