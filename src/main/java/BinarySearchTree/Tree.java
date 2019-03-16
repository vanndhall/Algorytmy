package BinarySearchTree;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class Tree {
    private Node root;
    public void add(int value){
        if(root == null){
            root = new Node(value);
        }else{
            root.add(value);
        }
    }
}
