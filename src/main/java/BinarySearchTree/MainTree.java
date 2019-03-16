package BinarySearchTree;

import java.sql.SQLOutput;

public class MainTree {
    public static void main(String[] args){
        Tree tree = new Tree();
        tree.add(5);
        tree.add(7);
        tree.add(2);
        tree.add(8);
        tree.add(11);
        tree.add(13);
        tree.add(12);
        System.out.println("koniec");

        tree.dfs();
    }
}
