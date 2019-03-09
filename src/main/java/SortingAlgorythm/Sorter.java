package SortingAlgorythm;

public class Sorter {
    private  DataSet data;
    private BubbleSorting bubbleSorting;
    private SortingStrategy strategy;

    //metoda podstawienia liskova
    public Sorter(DataSet data, SortingStrategy strategy) {

        this.data = data;
        this.strategy = strategy;
    }

    public void execute(){
        strategy.sort(data);
    }

}
