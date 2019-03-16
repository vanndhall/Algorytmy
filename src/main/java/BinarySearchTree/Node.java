package BinarySearchTree;

public class Node {
    //Pola
    int value;

    //Referencja klasy do samej siebie
    Node left,right;

    public Node(int newValue) {
this.value = newValue;
    }
    public Node(){

    }

    //Konstruktor
//    Node(int value){
//        this.value = value;
//    }


    public void add(int newValue) {
        if (newValue > value) {
            if (right == null) {
                Node newNode = new Node(newValue);
                newNode.value = newValue;
                right = newNode;
            } else {
                right.add(newValue);
            }
        } else {
            if (left == null) {
                Node newNode = new Node(newValue);
                newNode.value = newValue;
                left = newNode;
            } else {
                left.add(newValue);
            }
        }
    }

    public int getValue() {
        return value;
    }
//        public  boolean find(int value){
//            boolean resoult;
//            if(this.value == value){
//                resoult = true;
//            }else{
//                if(value>this.value){
//                    if()
//                    return right.find(value);
//                }else{
//                    return left.find(value);
//                }
//            }
//        }

//public boolean check(int value){
//            boolean found;
//            if(value >this.value) {
//                if(right == null){
//                    System.out.println("Nie znaleziono żądanej wartości! ");
//                    found = false;
//
//                }else if{
//
//
//                }
//
//
//
//            }
//        }
    }




