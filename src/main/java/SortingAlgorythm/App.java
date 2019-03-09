package SortingAlgorythm;

public class App {
    public static void main(String[] args){
        System.out.println("Przed sortowaniem: ");
        Randomizer randomer = new Randomizer();
        DataSet data = randomer.generate();
       data.print();
        System.out.println("Po sortowaniu bombelkowym: ");
       Sorter sorter = new Sorter(data, new BubbleSorting());
       sorter.execute();
       data.print();
    }
}
