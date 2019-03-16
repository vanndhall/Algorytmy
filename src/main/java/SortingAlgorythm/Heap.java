package SortingAlgorythm;

import java.util.Arrays;

public class Heap extends DataSet{
    //pola________________________________
    int heapSize ;

    //Konstruktor_________________________
    public Heap(DataSet proxy) {
        super(proxy);
        heapSize =getSize();
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

    public int parent2(int index){
        return(int) (Math.ceil((double)index-1)/2);
    }
    public void reverse(){

        for(int i = heapSize-1; i>=0;i--){
            swap(0,heapSize-1);
            //zamien z miejscami pierwsze z ostatnim
            heapSize=heapSize-1;
            //zmniejsz kpiec o 1
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
private int getLargestIndex(int i, int left, int right) {
    int largest;

    if (left < heapSize && get(left) > get(i)) {
        largest = left;
    } else {
        largest = i;
    }

    if (right < heapSize && get(right) > get(largest)) {
        largest = right;
    }

    return largest;
}
}
