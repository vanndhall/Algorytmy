package SortingAlgorythm;

public class BubbleSorting implements SortingStrategy {


    @Override
    public DataSet sort(DataSet dataset) {
        for(int i=0;i< dataset.getSize();i++){

            for (int j = i+1;j< dataset.getSize();j++){

                if(dataset.get(i)<dataset.get(j))
                    dataset.swap(i,j);
            }
        }
        return dataset;
    }
}
