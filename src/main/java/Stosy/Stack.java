package Stosy;

public class Stack {
    public int top;
    int[] tab;


    //Konstruktor
    public Stack(int maxSize) {
        this.tab = new int[maxSize];
        this.top = 0;
    }

    boolean isEmpty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    int getSize() {
        return top;
    }

//    public void Push(int e) throws ArrayIndexOutOfBoundsException {
//        if (top < tab.length) ){
//            tab[top] = e;
//            top++;
//        } else {
//            throw new ArrayIndexOutOfBoundsException();
//        }
//    }
//    public boolean push(int e){
//        if(isFull()){
//            return false)
//        }
//        this.tab[++top ] = 0;
//    return false;
//    }

//    private boolean isFull() {
//    }
//    int temp = top - 1;
//        do {
//        System.out.println(tab[temp]);
//        temp--;
//    } while (top > -1);

}

