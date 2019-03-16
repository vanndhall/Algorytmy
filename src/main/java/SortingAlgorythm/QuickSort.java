package SortingAlgorythm;

public class QuickSort implements SortingStrategy {
    @Override
    public DataSet sort(DataSet dataset) {
        return null;
    }
    private void quicksort(DataSet data, int begin, int end){
        if(begin<end){
            int q= partition(data,begin,end);
            quicksort(data,begin,q-1);

        }

    }
    private int partition(DataSet data, int begin, int end){
        int pivot = data.get(end);
        int i = begin -1;
        for (int j = begin;j<end;j++){
            if(data.get(j) <=pivot){
                i++;
                data.swap(i,j);
            }
        }
        return pivot;
    }

}
