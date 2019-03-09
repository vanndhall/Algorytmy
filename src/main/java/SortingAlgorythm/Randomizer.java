package SortingAlgorythm;


import java.util.Random;

public class Randomizer {

    Random random = new Random();
    DataSet data = new DataSet(10);


    public DataSet generate() {
        return generate(10);
    }

    public DataSet generate(int x) {

        for (int i = 0; i < x; i++) {
            int los = random.nextInt(10);

            data.set(i, los);
        }

        return data;
    }


}
