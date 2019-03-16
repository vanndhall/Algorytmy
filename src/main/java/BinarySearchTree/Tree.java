package BinarySearchTree;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class Tree {
    private Node root;
    public void add(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.add(value);
        }
    }

//    public void dfs(){
//            StackNode stack = new StackNode(1000);
//            stack.push(root);
//            while(!stack.isEmpty()){
//                Node top = stack.pop();
//
//                    System.out.println(top.getValue());
//                    if(top.getLeft() != null) {
//                        stack.push(top.getLeft());
//                    }
//                    if(top.getRight() !=null) {
//                        stack.push(top.getRight());
//                    }
//                }
//            }

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

