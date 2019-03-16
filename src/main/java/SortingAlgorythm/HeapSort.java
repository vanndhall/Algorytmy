package SortingAlgorythm;

public class HeapSort  implements  SortingStrategy{
    @Override
    public DataSet sort(DataSet dataset) {
        Heap heap = new Heap(dataset);
        heap.reverse();
        return dataset;
    }
}
