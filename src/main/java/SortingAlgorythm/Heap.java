package SortingAlgorythm;

import java.util.Arrays;

public class Heap {
    //pola________________________________
    int[] tab = {4,1,3,2,16,9,10,14,8,7};
    int heapSize = tab.length;

    //Konstruktor_________________________
    public Heap(int[] tab) {
        this.tab = tab;
    }

    public Heap() {
    }


    //Metody_________________________________--
    public int parent(int[] three, int n) {

        int index = 0;
        int value;
        for (int i = 1; i < n; i++)
        {
            index = (i-1)/2;
            System.out.println("Indeks tablicy: ["+index+"]");
        }

    //    public void left()
        return index;
    }
    public void swap(int x,int y){
        int tmp = tab[y];
        tab[y] = tab[x];
        tab[x] = tmp;
    }
    public int parent2(int index){
        return(int) (Math.ceil((double)index-1)/2);
    }
    public void reverse(){

        for(int i = heapSize-1; i>=0;i--){
            heapify(i);
        }
        //for int i =1
    }
    public int left(int index){
        // (i+1)*2-1
        return(int) (Math.ceil((double)index+1)*2-1);
    }
    public int right(int index){
        // (i+1)*2
        return(int) (Math.ceil((double)index+1)*2);
    }
  //not working -check
//    public void heapify(int a, int i){
//         int  left = left((i));
//         int right = right(i);
//         int largest = getLargestIndex(i,left,right);
//         if(largest !=i)
//         {
//             DataSet dataset = new DataSet();
//             dataset.swap(tab[i],tab[largest]);
//             heapify(tab[i],tab[largest]);
//         }
//    }
public void heapify( int i){
    int  left = left((i));
    int right = right(i);
    int largest = getLargestIndex(i,left,right);

    if(largest !=i)
    {
        swap(i,largest);
        heapify(largest);
    }
}
//not working - check
//    private int getLargestIndex(int i, int left, int right) {
//        int largest;
//         if( i<tab.length&& left<tab.length && tab[i]>tab[left] && tab[i]>tab[right]){
//             largest = i;
//         }
//         else if( tab[left]>tab[right]){
//            largest = left;
//         }
//         else{
//             largest = right;
//         }
//         return largest;
//    }
    public void print(){
        System.out.println(Arrays.toString(tab));
    }
private int getLargestIndex(int i, int left, int right) {
    int largest;

    if (left < heapSize && tab[left] > tab[i]) {
        largest = left;
    } else {
        largest = i;
    }

    if (right < heapSize && tab[right] > tab[largest]) {
        largest = right;
    }

    return largest;
}
}
