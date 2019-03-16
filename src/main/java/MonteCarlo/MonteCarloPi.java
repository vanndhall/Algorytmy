package MonteCarlo;

import java.util.Random;

public class MonteCarloPi {

    public double getPi(){
        return getPi(100);
    }
    public double getPi(int n){
    int counter =0;
        for( int i = 0;i<n;i++){
            if(inside(random(), random())){
                counter++;
            }
        }
        double pi = 4* (double)counter /n;
        return pi;
    }

    private double random(){
        Random random = new Random();
        return random.nextDouble();

       // return Math.random();
    }

    private boolean inside(double a, double b) {
        // alternatywa : Math.pow(a,2);
        double c = Math.sqrt(a*a + b*b);

        return c <=1;
    }
}
