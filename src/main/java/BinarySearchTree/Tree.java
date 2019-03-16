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

//        public Node search(int key){
//            Node actual = root;
//            while(actual !=null && actual.value !=key ){
//                actual = (actual.value>key) ? actual.left : actual.right;
//            }
//            if(actual == null){
//                System.out.println(" Nie znaleziono wartości!");
//            }
//            return actual;
//        }


    }
}
