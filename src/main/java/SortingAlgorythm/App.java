package SortingAlgorythm;

public class App {
    public static void main(String[] args){
//        System.out.println("Przed sortowaniem: ");
//        Randomizer randomer = new Randomizer();
//        DataSet tab = randomer.generate(10000);
//        System.out.println("Po sortowaniu bombelkowym: ");
//       Sorter sorter = new Sorter(tab, new BubbleSorting());
//       sorter.execute();
//        System.out.println("Po sortowaniu przez wybieranie: ");
//        Sorter sorter2 = new Sorter(tab,new SelectionSorting());
//        sorter2.execute();

        int[] tab ={4,1,3,2,16,9,10,14,8,7};
        int n = tab.length;
        Heap heap = new Heap();
        System.out.println("Przed kopcem: ");
        heap.print();
        heap.reverse();
        System.out.println("Po kopcowaniu: ");
        heap.print();
        //heap.parent(tab,n);

    }
}
