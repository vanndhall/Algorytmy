package SortingAlgorythm;

public class SelectionSorting implements SortingStrategy {


    @Override
    public DataSet sort(DataSet dataset) {

        int k;
        for (int i = 0; i < (dataset.getSize() - 1); i++)
        {
            int Buf = dataset.get(i); // bierzemy i-ty element
            k = i; // i jego indeks
            for (int j = i + 1; j < dataset.getSize(); j++) {
                if (dataset.get(j) < Buf) // szukamy najmniejszego z prawej
                {
                    k = j;
                    Buf = dataset.get(j);
                }
            }

            dataset.swap(k,i);
        }
        return dataset;
    }


    //Alternative___________________________

}
