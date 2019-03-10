package SortingAlgorythm;


import java.util.Random;

public class Randomizer {

    Random random = new Random();
    DataSet data = new DataSet(100000);


    public DataSet generate() {
        return generate(1000);
    }

    public DataSet generate(int x) {

        for (int i = 0; i < x; i++) {
            int los = random.nextInt(1000);

            data.set(i, los);
        }

        return data;
    }


}
