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
        System.out.println("Po sortowaniu przez wybieranie: ");
        Sorter sorter2 = new Sorter(data,new SelectionSorting());
        sorter2.execute();
        data.print();

    }
}
