package BinarySearchTree;

public class Node {
    //Pola
    int value;

    //Referencja klasy do samej siebie
    Node left,right;

    public Node(int newValue) {

    }

    //Konstruktor
//    Node(int value){
//        this.value = value;
//    }


    public void add(int newValue){
        if(newValue >value) {
            if(right == null){
                Node newNode = new Node(newValue);
                newNode.value = newValue;
                right = newNode;
            }else{
                right.add(newValue);
            }
        }else {
            if (left == null) {
                Node newNode = new Node(newValue);
                newNode.value = newValue;
                right = newNode;
            } else {
                left.add(newValue);
            }
        }


    }




}