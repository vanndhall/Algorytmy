package SortingAlgorythm;

public class Sorter {
    private  DataSet data;
    private BubbleSorting bubbleSorting;
    private SortingStrategy strategy;

    //metoda podstawienia liskova
    public Sorter(DataSet data, BubbleSorting bubbleSorting) {

        this.data = data;
        this.bubbleSorting = bubbleSorting;
    }

    public void execute(){
        bubbleSorting.sort(data);
    }

}
