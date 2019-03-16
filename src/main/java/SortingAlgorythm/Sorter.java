package SortingAlgorythm;

import java.time.Duration;
import java.time.Instant;

public class Sorter {
    private  DataSet data;
    private BubbleSorting bubbleSorting;
    private SortingStrategy strategy;
    private HeapSort heapSort;

    //metoda podstawienia liskova
    public Sorter(DataSet data, SortingStrategy strategy) {

        this.data = data;
        this.strategy = strategy;

    }

    public void execute(){
        data.print();
        Instant start  = Instant.now();
        strategy.sort(data);
        Instant end = Instant.now();
        long duration = Duration.between(start,end).toMillis();
        System.out.println(duration);

    }

}
