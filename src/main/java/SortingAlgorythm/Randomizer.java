package SortingAlgorythm;


import java.util.Random;

public class Randomizer {

    Random random = new Random();


    public DataSet generate() {
        return generate(10);
    }

    public DataSet generate(int x) {
        DataSet data = new DataSet(x);

        for (int i = 0; i < x; i++) {
            int los = random.nextInt(50);

            data.set(i, los);
        }

        return data;
    }


}
